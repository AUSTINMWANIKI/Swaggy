package com.austin.swaggy.ui.screens.dashboard

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FabPosition
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.austin.swaggy.R
import com.austin.swaggy.ui.theme.newIndigo

@Composable
fun DashboardScreen(navController: NavController){

    //Scaffold

    var selectedIndex by remember { mutableStateOf(0) }
    //Column
    Column (
        modifier = Modifier.verticalScroll(rememberScrollState())
    ){


    Scaffold(
        //BottomBar
        bottomBar = {
            NavigationBar(
                containerColor = Color.LightGray
            )
            {
                NavigationBarItem(
                    icon = { Icon(Icons.Default.Home, contentDescription = "Home") },
                    label = { Text("Home") },
                    selected = selectedIndex == 0,
                    onClick = { selectedIndex = 0
                        //navController.navigate(ROUT_HOME)
                    }
                )
                NavigationBarItem(
                    icon = { Icon(Icons.Default.Favorite, contentDescription = "Favorites") },
                    label = { Text("Favorites") },
                    selected = selectedIndex == 1,
                    onClick = { selectedIndex = 1
                        // navController.navigate(ROUT_HOME)
                    }
                )
                NavigationBarItem(
                    icon = { Icon(Icons.Default.Person, contentDescription = "Profile") },
                    label = { Text("Profile") },
                    selected = selectedIndex == 2,
                    onClick = { selectedIndex = 2
                        //  navController.navigate(ROUT_HOME)
                    }
                )


            }
        },

        //FloatingActionButton
        floatingActionButton = {
            FloatingActionButton(
                onClick = { /* Add action */ },
                containerColor = Color.Red,
                modifier = Modifier.offset(y = 40.dp),
                shape = RoundedCornerShape(50.dp)
            ) {
                Icon(Icons.Default.Add, contentDescription = "Add")
            }
        },
        floatingActionButtonPosition = FabPosition.Center,

        content = { paddingValues ->
            Column(
                modifier = Modifier
                    .padding(paddingValues)
                    .fillMaxSize()
            ) {


                //Main Contents of the page


                //Row
                Row (
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(200.dp)
                        .background(color = Color.White)

                ){
               //Column
                Column () {
                    Text(
                        text = "Hi Samantha",
                        fontWeight = FontWeight.Bold,
                        fontSize = 30.sp,
                    )

                    Spacer(modifier = Modifier.height(10.dp))

                    Text(
                        text = "Here are your projects",
                        fontWeight = FontWeight.Bold,
                        fontSize = 15.sp,
                    )
                }
                    //End of column
                    Image(
                        painter = painterResource(R.drawable.reading),
                        contentDescription = "reading",
                        modifier = Modifier.padding(start = 50.dp)
                    )


                }

                //End of row

                Spacer(modifier = Modifier.height(50.dp))

                //Row
                Row (
                    modifier = Modifier.horizontalScroll(rememberScrollState())
                ){
                    //Card
                    Card (
                        modifier = Modifier.height(250.dp).width(165.dp).padding(start = 10.dp).fillMaxSize(),
                        colors = CardDefaults.cardColors(newIndigo)

                    )
                    {
                        Image(
                            painter = painterResource(R.drawable.bayesianstatistics),
                            contentDescription = "statistical distribution functions",


                        )
                        Text(text = "Cryptocurrency", fontSize =20.sp, color = Color.White)

                        Spacer(modifier = Modifier.height(20.dp))

                        Text(text = "Landing page", fontSize = 20.sp, color = Color.White)

                        Spacer(modifier = Modifier.height(20.dp))
                        Text(
                            text = "12 slides"
                        )
                    }
                    //End of card

                    Spacer(modifier = Modifier.width(10.dp))
                    //Card

                    Card (
                        modifier = Modifier.height(250.dp).width(165.dp),
                        colors = CardDefaults.cardColors(Color.Yellow),

                    ){
                        Text(text = "Statistics", color = Color.White)
                        Text(text = "Dashboard", color = Color.White)
                        Text(text = "7 slides", color = Color.White)
                    }
                    //End of card
                    Spacer(modifier = Modifier.width(10.dp))

                    //Card

                    Card (
                        modifier = Modifier.height(250.dp).width(165.dp)

                    ){
                        Text(text = "Statistics", color = Color.White)
                        Text(text = "Dashboard", color = Color.White)
                        Text(text = "7 slides", color = Color.White)
                    }
                    //End of card
                }
                //End of row

                Spacer(modifier = Modifier.height(25.dp))

                Text(text = "Personal Tasks", fontWeight = FontWeight.Bold, fontSize = 20.sp, modifier = Modifier.padding(start = 20.dp))

                Spacer(modifier = Modifier.height(10.dp))

                //Card

                Card (
                    modifier = Modifier.width(369.dp).height(80.dp).padding(start = 20.dp),
                )
                {
                    Icon(
                        painter = painterResource(R.drawable.point),
                        contentDescription = "pointer",
                        modifier = Modifier.padding(start = 50.dp),
                    )

                    Icon(
                        painter = painterResource(R.drawable.lens),
                        contentDescription = "camera",
                        modifier = Modifier.padding(start = 10.dp),
                    )


                    Text(
                        text = "NDA review for website project ",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                    )
                    Spacer(modifier = Modifier.height(10.dp))

                    Text(
                        text = "Today-10pm ",
                        fontSize = 15.sp,
                    )

                }
                Spacer(modifier = Modifier.height(15.dp))

                Card (
                    modifier = Modifier
                        .width(369.dp)
                        .height(80.dp)
                        .padding(start = 20.dp)
                )
                {
                    Row (){

                    Icon(
                        painter = painterResource(R.drawable.blue),
                        contentDescription = "print",
                        modifier = Modifier.padding(start = 50.dp),
                        )

                    Icon(
                        painter = painterResource(R.drawable.mail),
                        contentDescription = "mail",
                    )
                    Text(
                        text = "Email Reply for Green Project ",
                        fontSize = 20.sp,
                        modifier = Modifier.padding(10.dp),
                        fontWeight = FontWeight.Bold
                    )
                    Spacer(modifier = Modifier.height(10.dp))


                    }
                    Text(
                        text = "Today-10pm ",
                        fontSize = 18.sp,
                        modifier = Modifier.padding(start = 55.dp)
                    )


                }














            }
        }
    )

    //End of scaffold
}
}
//End of column


@Preview(showBackground = true)
@Composable
fun DashboardScreenPreview(){
    DashboardScreen(rememberNavController())
}