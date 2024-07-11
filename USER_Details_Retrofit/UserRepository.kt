package com.example.userdetails

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface APIservice{
    @GET("User")
    suspend fun getProduct():List<User>
}

object RetrofitClint{
    private const val BASE_URL = "https://fakestoreapi.com/users"
    val apiService: APIservice by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(APIservice::class.java)
    }
}

class UserRepo(private val apiService: APIservice) {
    suspend fun getProduct(): List<User>{
        return apiService.getProduct()
    }
}

class UserViewModel: ViewModel(){
    private val _users = MutableLiveData<List<User>>()
    val users: LiveData<List<User>> get() = _users

    private val repository = UserRepo(RetrofitClint.apiService)

    fun fetchUser() {
        viewModelScope.launch {
            try {
                val userList = repository.getProduct()
                _users.postValue(userList)
                println("API Data Called: $userList")
            } catch (e: Exception) {
                println("API Data Call: Error")
            }
        }
    }
}




























