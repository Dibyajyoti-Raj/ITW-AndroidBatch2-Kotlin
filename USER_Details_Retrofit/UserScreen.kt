package com.example.userdetails

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState

@Composable
fun userScreen(userVM: UserViewModel)
{
    val user by userVM.users.observeAsState(emptyList())
    LazyColumn {
        items(user){
            userItem(user = it)
        }
    }
}

@Composable
fun userItem(user: User) {
    Card {
        Column {

            Text(text = user.username)
            Text(text = "${user.address.city}, ${user.address.street}, ${user.address.zipcode}")
            Text(text = user.email)
            Text(text = user.phone.toString())
        }
    }
}
