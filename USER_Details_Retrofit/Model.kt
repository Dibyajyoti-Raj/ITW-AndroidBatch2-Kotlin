package com.example.userdetails

data class User(val address: Address, val id: Int, val email:String,
                val username: String, val password: String,
                val name: Name, val phone: Int, val _v: Int = 0)

data class Geolocation(val lat: Double, val long: Double)

data class Address(val geolocation: Geolocation, val city: String,
                   val street: Int, val number: Int, val zipcode: String)

data class Name(val firstname: String, val lastname: String)