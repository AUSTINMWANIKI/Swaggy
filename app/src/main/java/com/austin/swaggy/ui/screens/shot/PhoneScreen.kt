package com.austin.swaggy.ui.screens.shot

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun PhoneScreen(navController: NavController){
    Column (
        modifier = Modifier.fillMaxWidth().height(150.dp),


    ){
        Text(
            text = "Hi Samantha",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
        )

        Text(
            text = "Here are your projects",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
        )

    }

}

@Preview(showBackground = true)
@Composable
fun PhoneScreenPreview(){
    PhoneScreen(rememberNavController())
}