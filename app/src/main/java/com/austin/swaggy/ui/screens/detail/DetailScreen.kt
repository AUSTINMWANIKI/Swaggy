package com.austin.swaggy.ui.screens.detail

import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.austin.swaggy.R
import com.austin.swaggy.navigation.ROUT_INTENT
import com.austin.swaggy.navigation.ROUT_ITEM
import com.austin.swaggy.ui.theme.newIndigo

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailScreen(navController: NavController){



    //Scaffold

    var selectedIndex by remember { mutableStateOf(0) }

    Scaffold(
        //TopBar
        topBar = {
            TopAppBar(
                title = { Text("Item Screen") },
                navigationIcon = {
                    IconButton(onClick = { /* Handle back/nav */ }) {
                        Icon(Icons.Default.ArrowBack, contentDescription = "Back")
                    }
                },

                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color.Yellow,
                    titleContentColor = Color.Black,
                    navigationIconContentColor = Color.White
                )
            )
        },

        //BottomBar
        bottomBar = {
            NavigationBar(
                containerColor = Color.Yellow
            ){
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
                onClick = { 
                    
                    navController.navigate(ROUT_INTENT)
                },
                containerColor = Color.LightGray
            ) {
                Icon(Icons.Default.Add, contentDescription = "Add")
            }
        },
        content = {

                paddingValues ->
            Column(
                modifier = Modifier
                    .padding(paddingValues)
                    .fillMaxSize()
            ) {


                //Main Contents of the page

                Spacer(modifier = Modifier.height(10.dp))

                //SearchBar
                var search by remember { mutableStateOf("") }
                OutlinedTextField(
                    value = search,
                    onValueChange = { search = it },
                    modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp),
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Default.Search,
                            contentDescription = "search"
                        )
                    },
                    placeholder = { Text(text = "Search Products,Categories...") },
                    colors = OutlinedTextFieldDefaults.colors(
                        unfocusedBorderColor = newIndigo,
                        focusedBorderColor = Color.Red,
                    )
                )

                //End of SearchBar

                Spacer(modifier = Modifier.height(10.dp))

                Text(
                    text = "Categories",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(start = 10.dp),
                    textAlign = TextAlign.Center,
                )

                Spacer(modifier = Modifier.height(10.dp))

                //Row
                Row(
                    modifier = Modifier
                        .padding(start = 10.dp).horizontalScroll(rememberScrollState()),
                    )
                {
                    Button(
                        onClick = {},
                        colors = ButtonDefaults.buttonColors(Color.Gray),
                        shape = RoundedCornerShape(10.dp),
                    ) {
                        Text(text = "Shoes")
                    }
                    Spacer(modifier = Modifier.width(10.dp))

                    Button(
                        onClick = {},
                        colors = ButtonDefaults.buttonColors(Color.Gray),
                        shape = RoundedCornerShape(10.dp),
                    ) {
                        Text(text = "Watches")
                    }

                    Spacer(modifier = Modifier.width(10.dp))

                    Button(
                        onClick = {},
                        colors = ButtonDefaults.buttonColors(Color.Gray),
                        shape = RoundedCornerShape(10.dp),
                    ) {
                        Text(text = "Shirts")
                    }
                    Spacer(modifier = Modifier.width(10.dp))


                    //End of Row

                    Spacer(modifier = Modifier.height(10.dp))

                }
                Text(
                    text = "Trending",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(start = 10.dp),
                    textAlign = TextAlign.Center,
                )
                Spacer(modifier = Modifier.height(10.dp))

                //Row
                Row(
                    modifier = Modifier.padding(start = 20.dp)
                        .horizontalScroll(rememberScrollState())
                ) {

                    //Card
                    Card(
                        onClick = {},
                        modifier = Modifier.width(200.dp).height(250.dp),
                        elevation = CardDefaults.elevatedCardElevation(8.dp),
                        //colors = CardDefaults.cardColors(orange1)
                    )

                    {
                        Column (

                        )
                        {
                            Image(
                                painter = painterResource(R.drawable.specials),
                                contentDescription = "spotty",
                                modifier = Modifier.size(width = 200.dp, height = 250.dp).clip(shape = RoundedCornerShape(20.dp)),
                                contentScale = ContentScale.Crop
                            )
                            Spacer(modifier = Modifier.height(10.dp))

                            Text(
                                text = "Stylish Sneakers",
                                fontSize = 20.sp,
                                fontWeight = FontWeight.Bold,
                            )

                            Spacer(modifier = Modifier.height(10.dp))

                            Text(
                                text = "KES.3400",
                                fontSize = 15.sp,
                                fontWeight = FontWeight.Bold,
                            )
                        }
                    }
                    //End of Card

                    Spacer(modifier = Modifier.width(10.dp))

                    //Card

                    Card(
                        onClick = {},
                        modifier = Modifier.width(200.dp).height(250.dp),
                        elevation = CardDefaults.elevatedCardElevation(8.dp),
                        //colors = CardDefaults.cardColors(orange1)
                    )

                    {
                        Column (

                        )
                        {
                            Image(
                                painter = painterResource(R.drawable.specials),
                                contentDescription = "spotty",
                                modifier = Modifier.size(width = 200.dp, height = 250.dp).clip(shape = RoundedCornerShape(20.dp)),
                                contentScale = ContentScale.Crop
                            )
                            Spacer(modifier = Modifier.height(10.dp))

                            Text(
                                text = "Stylish Sneakers",
                                fontSize = 20.sp,
                                fontWeight = FontWeight.Bold,
                            )

                            Spacer(modifier = Modifier.height(10.dp))

                            Text(
                                text = "KES.3400",
                                fontSize = 15.sp,
                                fontWeight = FontWeight.Bold,
                            )
                        }
                    }
                    //End of Card
                }

                //End of row


            }
        }
    )

    //End of scaffold
}





@Preview
@Composable
fun DetailScreenPreview(){
    DetailScreen(rememberNavController())
}



