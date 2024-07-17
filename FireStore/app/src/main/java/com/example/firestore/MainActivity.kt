package com.example.firestore

import android.net.Uri
import android.os.Bundle
import android.service.controls.ControlsProviderService.TAG
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.firestore.ui.theme.FireStoreTheme
import com.google.firebase.Firebase
import com.google.firebase.firestore.firestore
import androidx.compose.runtime.*
import androidx.navigation.*
import androidx.navigation.compose.*
import com.google.gson.Gson

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
        setContent {
            val userList = remember {
                mutableStateOf<List<User>>(emptyList())
            }

            LaunchedEffect(Unit) {
                fetchUser { users -> userList.value = users }
            }

            FireStoreTheme {
//                Greeting()
                LazyColumn(modifier = Modifier.fillMaxWidth()) {
                    items(userList.value) { item ->
                        Text(text = item.name)
                        Text(text = item.age)
                    }
                }
            }
        }
    }


        private val db = Firebase.firestore
        fun addUser(name: String, age: String) {
            val user = User(name, age)
            db.collection("default")
                .add(user)
                .addOnSuccessListener { docRef ->
                    Log.d(TAG, "DOCUMENT SNAP ADDED: ${docRef.id}")
                }
                .addOnFailureListener { e ->
                    Log.w(TAG, "ERROR ADDING SNAP")
                }
        }

        fun addUser2(name: String, sic: String) {
            val user = User(name, sic)
            db.collection("student")
                .document(sic)
                .set(user)
        }

        fun fetchUser(onResult: (List<User>) -> Unit) {
            try {
                db.collection("default").get()
                    .addOnSuccessListener { result ->
                        val userList = result.map { document ->
                            document.toObject(User::class.java)
                        }
                        onResult(userList) // Call the onResult callback with the fetched user list
                    }
                    .addOnFailureListener { exception ->
                        Log.w(TAG, "Error getting documents", exception)
                        onResult(emptyList()) // Return an empty list in case of failure
                    }
            } catch (exception: Exception) {
                println("Could not deserialize object: ${exception.message}")
                onResult(emptyList()) // Return an empty list in case of exception
            }
        }


        @Composable
        fun UserScreen(navController: NavController) {
            var name by remember { mutableStateOf("") }
            var age by remember { mutableStateOf("") }
            Column(
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                TextField(
                    value = name,
                    onValueChange = { name = it },
                    label = { Text(text = "Name") },
//                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
                    modifier = Modifier.padding(vertical = 8.dp)
                )

                TextField(
                    value = age,
                    onValueChange = { age = it },
                    label = { Text(text = "Age") },
//                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                    modifier = Modifier.padding(vertical = 8.dp)
                )


                Button(
                    onClick = { addUser2(name, age) }, modifier = Modifier
                        .fillMaxWidth()
                        .padding(48.dp)
                ) {
                    Text(text = "Add your details.")
                }

//            Button(
//                onClick = { }, modifier = Modifier
//                    .fillMaxWidth()
//                    .padding(48.dp)
//            ) {
//                Text(text = "See pre-existing Users.")
//            }

            }
        }

        @Composable
        fun Greeting() {
            val navController = rememberNavController()

            NavHost(navController = navController, startDestination = "screen1") {
                composable("Screen1") {
                    UserScreen(navController)
                }

//            composable(
//                "screen2/{userList}",
//                arguments = listOf(navArgument("userList") { type = NavType.StringType })
//            ) { backStackEntry ->
//                val userListJson = backStackEntry.arguments?.getString("userList")
//                val uL: List<User> = if (userListJson.isNullOrEmpty()) {
//                    emptyList()
//                } else {
//                    Gson().fromJson(userListJson, Array<User>::class.java).toList()
//                }
//                UsersList(navController = navController, userList = uL)
//            }
            }
        }

        fun NavController.navigateToUsersList(userList: List<User>) {
            val userListJson = Uri.encode(Gson().toJson(userList))
            navigate("screen2/$userListJson")
        }

}

//data class User(val name:String = " ", val age: String)
data class User(
    val name: String = "",
    val age: String = "0",
    // add other properties with default values
) {
    // No-argument constructor for Firestore deserialization
    constructor() : this("", "0")
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    FireStoreTheme {

    }
}