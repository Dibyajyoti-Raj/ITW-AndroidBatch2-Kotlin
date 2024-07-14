package com.ITW.ezbuy.Bag

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun BagPage(total: Int){
    var code by  remember { mutableStateOf("Enter your promo code    ") }
    Column(modifier = Modifier
        .fillMaxWidth()
        .fillMaxHeight()) {
        Text(
            text = "My Bag",
            textAlign = TextAlign.Left,
            modifier = Modifier.fillMaxWidth(),
            color = Color.Black,
            fontSize = 22.sp
        )

        Spacer(modifier = Modifier.height(26.dp))

        AllProducts()
        
        Spacer(modifier = Modifier.height(12.dp))
        TextField(value = code, onValueChange = {code = it}, modifier = Modifier.fillMaxWidth())
        Spacer(modifier = Modifier.height(12.dp))
        Text(text = "Total Amount :  $total$", modifier = Modifier.fillMaxWidth())

        Button(onClick = { /*TODO*/ }, modifier = Modifier.fillMaxWidth()) {
            Text(text = "CHECK OUT", textAlign = TextAlign.Center,
                modifier = Modifier.fillMaxWidth(), color = Color.Black)
        }
    }
}













