package com.example.userdetails

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.userdetails.ui.theme.UserDetailsTheme

class MainActivity : ComponentActivity() {
    private val userVM : UserViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            UserDetailsTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    UserSc(userVM)
                }
            }
        }
    }
}

@Composable
fun UserSc(userVM: UserViewModel) {
    Column {
        Button(onClick = { userVM.fetchUser() }) {
            Text(text = "Click to fetch user details.")
        }
    }
}
