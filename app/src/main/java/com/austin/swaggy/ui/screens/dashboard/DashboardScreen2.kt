package com.austin.swaggy.ui.screens.dashboard

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.austin.swaggy.R
import com.austin.swaggy.ui.theme.darkBlue
import com.austin.swaggy.ui.theme.darkGreen
import com.austin.swaggy.ui.theme.newBlue
import com.austin.swaggy.ui.theme.newGreen
import com.austin.swaggy.ui.theme.newPurple
import com.austin.swaggy.ui.theme.newRed
import com.austin.swaggy.ui.theme.newViolet
import com.austin.swaggy.ui.theme.newYellow

@Composable
fun DashboardScreen2(navController: NavController){
    Column (
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
    ){
        //Card
        Card (
            modifier = Modifier.fillMaxWidth().height(300.dp),
            shape = RoundedCornerShape(bottomStart = 40.dp),
            colors = CardDefaults.cardColors(newGreen),
        ){

            Column (
                modifier = Modifier.padding(20.dp)
            ){
                IconButton(onClick = {})
                {
                    Icon(
                        imageVector = Icons.Default.ArrowBack,
                        contentDescription = "arrow",
                        tint = Color.White,
                    )
                }

                Spacer(modifier = Modifier.height(10.dp))

                Text(text = "Cryptocurrency", color = Color.White, fontSize = 20.sp, fontWeight = FontWeight.Bold)
                Text(text = "Landing Page", color = Color.White, fontSize = 20.sp, fontWeight = FontWeight.Bold)
                //Row
                Row()
                {
                    Image(
                        painter = painterResource(R.drawable.reading),
                        contentDescription = "image",
                        modifier = Modifier.height(30.dp)
                    )

                    Spacer(modifier = Modifier.width(10.dp))

                    Text(
                        text = "Samantha",
                        color = Color.White,
                        )

                    Spacer(modifier = Modifier.width(190.dp))

                    Image(
                        painter = painterResource(R.drawable.searching),
                        contentDescription = "human",
                        modifier = Modifier.height(90.dp).width(90.dp).offset(y = 120.dp),
                    )
                }
                //End of row

                //Row
                Row (
                )

                {
                Text(
                    text = "Lorem ipsum dolor sit amet, consecutor adipiscing elit, sed do eiumod incididumu ut taborne dolore magne",
                    color = Color.White,
                    modifier = Modifier.padding(end = 100.dp)
                )
                }
                //End of row


            }
        }
        //End of card
        Spacer(modifier = Modifier.height(20.dp))

        //Row
        Row ()
        {
            //Column
            Column (){
            //Card
            Card (
                modifier = Modifier.height(100.dp).width(120.dp).padding(start = 15.dp),
                colors = CardDefaults.cardColors(newRed)
            ){
                Image(
                    painter = painterResource(R.drawable.string),
                    contentDescription = "loop",
                    modifier = Modifier.padding(start = 30.dp, top = 30.dp)

                )

            }
            //End of card
            Text(text = "Layout Docs", modifier = Modifier.padding(start = 20.dp))
            Text(text = "MDV+10MB", modifier = Modifier.padding(start = 20.dp))
            }
            //End of column

            //Card
            //Column
            Column () {
                Card(
                    modifier = Modifier.height(100.dp).width(120.dp).padding(start = 15.dp),
                    colors = CardDefaults.cardColors(newViolet)
                ) {
                    Image(painter = painterResource(R.drawable.play),
                        contentDescription = "link",
                        modifier = Modifier.padding(start = 30.dp, top = 30.dp)
                    )


                }
                Text(text = "Presentation", modifier = Modifier.padding(start = 20.dp))
                Text(text = "MDV-10MB", modifier = Modifier.padding(start = 20.dp))

            }
            //End of column
            //End of card

            //Card
            Column (){
            Card (
                modifier = Modifier.height(100.dp).width(120.dp).padding(start = 15.dp),
                colors = CardDefaults.cardColors(newYellow)
            ){

            }
                Text(text = "All Assets", fontWeight = FontWeight.Bold)
                Text(text = "DP+10MB")
            }



            //End of card

        }
        //End of row

        Spacer(modifier = Modifier.height(40.dp))

        //Row
        Row ()
        {
            //Card
            Column (){
            Card (
                modifier = Modifier.height(100.dp).width(120.dp).padding(start = 15.dp),
                colors = CardDefaults.cardColors(newPurple)
            ){

            }
                Text(text = "Layout Docs", fontWeight = FontWeight.Bold, modifier = Modifier.padding(start = 20.dp))
                Text(text = "WAV+10MB", modifier = Modifier.padding(start = 20.dp))
            }
            //End of card

            //Card
            Column (){
            Card (
                modifier = Modifier.height(100.dp).width(120.dp).padding(start = 15.dp),
                colors = CardDefaults.cardColors(darkGreen)
            ){
                Image(painter = painterResource(R.drawable.word),
                      contentDescription = "spreadsheet",
                      modifier = Modifier.padding(start = 30.dp, top = 30.dp)
                    )
            }
                Text(text = "Layout docs", fontWeight = FontWeight.Bold)
                Text(text = "WAV+10MB")
            }
            //End of card

            //Card
            Column ()

            {
            Card (
                modifier = Modifier.height(100.dp).width(120.dp).padding(start = 15.dp),
                colors = CardDefaults.cardColors(darkBlue)
            ){
                Image(
                    painter = painterResource(R.drawable.word),
                    contentDescription = "processor",
                    modifier = Modifier.padding(start = 30.dp, top = 30.dp)
                )


            }
                Text(text = "Layout docs", fontWeight = FontWeight.Bold)
                Text(text = "DOCK + 10MB")
            }
            //End of card



        }
        //End of row
        Spacer(modifier = Modifier.height(169.dp))

        Card (modifier = Modifier.fillMaxWidth().height(60.dp))
        {
            Row (){
            Text(
                text = "Discussions",
                color = Color.Gray,
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp,
                modifier = Modifier.padding(start = 25.dp, top = 15.dp)
            )

            Text(
                text = "Files",
                color = Color.Black,
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp,
                modifier = Modifier.padding(start = 125.dp, top = 15.dp, end = 90.dp)
            )
            }

        }




    }

}

@Preview(showBackground = true)
@Composable
fun DashboardScreen2Preview(){
    DashboardScreen2(rememberNavController())
}