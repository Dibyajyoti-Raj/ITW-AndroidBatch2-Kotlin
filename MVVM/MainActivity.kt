package com.example.android_mvvm

import android.graphics.fonts.FontStyle
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModel
import com.example.android_mvvm.ui.theme.Android_MVVMTheme

class MainActivity : ComponentActivity() {

    private val viewModel: CounterViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Android_MVVMTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    CounterView(viewModel)
//                    CounterView()
                }
            }
        }
    }
}

@Composable
fun CounterView(counterVM:CounterViewModel){
    val currentCount = counterVM.counter.value

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(10.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
        Text(text = "Count: ${currentCount.count}",
            color = Color.Black,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(12.dp))

        Button(onClick = { counterVM.incrementCounter() },
            shape = RectangleShape,
            colors = ButtonDefaults.buttonColors( Color.Yellow) ) {
            Text(text = "Increase", color = Color.Black)
        }

        Spacer(modifier = Modifier.height(7.dp))

        Button(onClick = { counterVM.decrementCounter() },
            shape = RectangleShape,
            colors = ButtonDefaults.buttonColors( Color.Yellow) ) {
            Text(text = "Decrease", color = Color.Black)
        }

        Spacer(modifier = Modifier.height(7.dp))

        Button(onClick = { counterVM.reset() },
            shape = RectangleShape,
            colors = ButtonDefaults.buttonColors( Color.Yellow) ) {
            Text(text = "Reset", color = Color.Black)
        }

    }

}

//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    Android_MVVMTheme {
//        CounterView()
//    }
//}