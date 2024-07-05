package com.example.itw_day7

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Done
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.ListItemDefaults.containerColor
import androidx.compose.material3.ListItemDefaults.contentColor
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Slider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Cyan
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.ViewModel
import com.example.itw_day7.ui.theme.ITWDay7Theme
import com.google.ai.client.generativeai.type.content
import androidx.compose.runtime.*




class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val gradientColors = listOf(Color.Cyan, Color.Blue, Color.Magenta)
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
        setContent {
            ITWDay7Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }

//        override fun onCreate() {
//            super.onCreate()
//            println("On create Created")
//        }



}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {

    var value by remember { mutableFloatStateOf(0f) }

    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box {
            Text(
                text = "Welcome, $name. Choose an Option.",
                fontSize = 34.sp,
                textAlign = TextAlign.Center,
                color = Color.Unspecified
            )
        }
        Row {
            Button(
                onClick = {},
                shape = RoundedCornerShape(5.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color.Blue)
            ) {
                Text(text = "Basic Button", color = Color.Black)
            }

            ElevatedButton(
                onClick = { /*TODO*/ },
                shape = RoundedCornerShape(5.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color.Blue)
            ) {
                Text(text = "Elevated Button", color = Color.Black)
            }

            OutlinedButton(
                onClick = { /*TODO*/ },
                shape = RoundedCornerShape(5.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color.Blue)
            ) {
                Text(text = "Outline Button", color = Color.Black)
            }
        }

        Card {
            Column(Modifier.padding(10.dp)) {
                Image(
                    painter = painterResource(id = R.drawable.th),
                    contentDescription = "this is an Image."
                )
                Text("JetPack Compose", fontWeight = FontWeight.W700)
                Text("This thing  is stunning")

            }
        }

        Slider(value = value, onValueChange = {value = it})
        Text(text = value.toString())
    }


    Box(
            modifier = Modifier.fillMaxWidth(),

            contentAlignment = Alignment.BottomEnd
        ) {
            FloatingActionButton(
                onClick = { },
                containerColor = Color.Yellow,
                contentColor = Color.Black
            ) {
                Icon(Icons.Default.Done, contentDescription = "Floating action button.")
            }
        }

    }




@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ITWDay7Theme {
        Greeting("Android")
    }
}