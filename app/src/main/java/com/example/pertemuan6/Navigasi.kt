package com.example.pertemuan6

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController

enum class Navigasi{
    FormulirSaya,
    Detail
}

@Composable
fun DataApp(
  navController: NavHostController = rememberNavController()
){}