package com.ITW.ezbuy.Bag

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import com.ITW.ezbuy.R

@Composable
fun AllProducts() {
    val pro = listOf(
        Product(
            name = "Rose",
            description = "A thorny flowering plant known for its beautiful blooms.",
            imageRes = R.drawable.ic_launcher_foreground
        ),
        Product(
            name = "Sunflower",
            description = "A large, yellow flowering plant that follows the sun.",
            imageRes = R.drawable.ic_launcher_foreground
        ),
        Product(
            name = "Tulip",
            description = "A bulbous spring-flowering plant with boldly colored cup-shaped flowers.",
            imageRes = R.drawable.ic_launcher_foreground // Assuming R.drawable.tulip is a valid drawable resource ID
        )
    )

    ProductList(pro)
}

@Composable
fun ProductList(Prod: List<Product>) {
    LazyColumn {
        items(Prod) { prod ->
            ProductCard(prod)
        }
    }
}