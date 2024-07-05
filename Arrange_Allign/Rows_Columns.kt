package com.example.itw_day7

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Cyan
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.ViewModel
import com.example.itw_day7.ui.theme.ITWDay7Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val gradientColors = listOf(Color.Cyan, Color.Blue, Color.Magenta)
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
        setContent {
            ITWDay7Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//                    Greeting(
//                        name = "Android",
//                        modifier = Modifier.padding(innerPadding)
//                    )
                    Column {
                        Row {
                            Text(text = "Row 1, Column 1")
                            Text(text = "Row 1, Column 2")
                        }
                        Row {
                            Text(text = "Row 2, Column 1")
                            Text(text = "Row 2, Column 2")
                        }
                    }

                }
            }
        }
    }

//        override fun onCreate() {
//            super.onCreate()
//            println("On create Created")
//        }

        override fun onResume() {
            super.onResume()
            println("On create resumed")
        }

        override fun onStart() {
            super.onStart()
            println("On create Started")
        }

        override fun onPause() {
            super.onPause()
            println("On create paused")
        }

        override fun onStop() {
            super.onStop()
            println("On create Stopped")
        }

}

//@Composable
//fun Greeting(name: String, modifier: Modifier = Modifier) {
//    Text(
//        text = "Hello $name!",
//        modifier = modifier
//    )
//}

//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    ITWDay7Theme {
//        Greeting("Android")
//    }
//}