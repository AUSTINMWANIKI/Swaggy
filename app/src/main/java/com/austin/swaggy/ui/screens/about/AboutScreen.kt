package com.austin.swaggy.ui.screens.about

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.austin.swaggy.R
import com.austin.swaggy.ui.theme.Pink40

@Composable
fun AboutScreen(navController: NavController){

    Column (
        modifier=Modifier.fillMaxSize().paint(painter = painterResource(R.drawable.lattice), contentScale = ContentScale.FillBounds),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {

    Image(
        painter = painterResource(R.drawable.visualdisplayunit),
        contentDescription = "marketable",
        modifier = Modifier.size(300.dp),
    )

    Text(
        text = "Easy Shopping",
        color = Color.Blue,
        fontSize = 40.sp,
        fontWeight = FontWeight.Bold,
    )

    Text(
        text = "Children, Women, Clothes, Wedding, Dress, Latest Products, we always have a new products, New Stayl2025 Girl, New Stayl2025 Girl, Show Details.",
        textAlign = TextAlign.Center,
        fontSize = 20.sp,

    )
    Spacer(modifier = Modifier.height(180.dp))

    Row (){
        Box(modifier = Modifier.size(10.dp).background(color = Color.Blue, shape = CircleShape),

        )
        Spacer(modifier = Modifier.height(100.dp))

    Row (){
        Box(modifier = Modifier.size(10.dp).background(color = Color.Blue, shape = CircleShape),

            )
        Spacer(modifier = Modifier.height(100.dp))

    Row (){
        Box(modifier = Modifier.size(10.dp).background(color = Color.Blue, shape = CircleShape),
            )
        Spacer(modifier = Modifier.height(100.dp))

    }
    }




        Text(
            text = "Skip",
            color = Color.Blue,
            textAlign = TextAlign.Right,
            fontSize = 25.sp,
            modifier = Modifier.height(100.dp).padding(start = 200.dp, bottom = 25.dp),
        )

    }



    }


}

@Preview(showBackground = true)
@Composable
fun AboutScreenPreview(){
    AboutScreen(rememberNavController())
}