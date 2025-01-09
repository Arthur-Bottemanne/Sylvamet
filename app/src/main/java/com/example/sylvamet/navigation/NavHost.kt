@file:Suppress("SpellCheckingInspection")

package com.example.sylvamet.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.sylvamet.pages.CreateCubageScreen
import com.example.sylvamet.pages.CubageListScreen
import com.example.sylvamet.pages.MartelageScreen

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "cubage") {
        composable("cubage") { CubageListScreen(navController) }
        composable("create_cubage") { CreateCubageScreen(navController) }
        composable("martelage") { MartelageScreen(navController) }
    }
}