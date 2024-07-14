package com.ITW.ezbuy

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.FontScaling
import androidx.compose.ui.unit.dp

@Composable
fun ProfilePage(name: String?, mail: String? )
{
    Column {
        Text(text = "My profile", textAlign = TextAlign.Left,
            modifier = Modifier.fillMaxWidth(), color = Color.Black, fontSize = (32.dp))
        Spacer(modifier = Modifier.height(26.dp))
        Box(modifier = Modifier.fillMaxWidth()){
            Row {
                Image(painter = , contentDescription = "profile", )
                Spacer(modifier = Modifier.width(14.dp))
                Column {
                    Text(text = "$name")
                    Text(text = "$name")
                }
            }

        }

        Card(modifier = Modifier.fillMaxWidth()) {
            Text(text = "My Order")
            Text(text = "Already have 12 orders.")
            Icon( imageVector = Icons.Default.KeyboardArrowRight, contentDescription = "right")
        }
        Card(modifier = Modifier.fillMaxWidth()) {
            Text(text = "My Order")
            Text(text = "Already have 12 orders.")
            Icon( imageVector = Icons.Default.KeyboardArrowRight, contentDescription = "right")
        }
        Card(modifier = Modifier.fillMaxWidth()) {
            Text(text = "My Order")
            Text(text = "Already have 12 orders.")
            Icon( imageVector = Icons.Default.KeyboardArrowRight, contentDescription = "right")
        }
    }
}













