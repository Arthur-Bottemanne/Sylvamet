@file:Suppress("SpellCheckingInspection")

package com.example.sylvamet.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.sylvamet.pages.CubageScreen

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "cubage") {
        composable("cubage") { CubageScreen(navController) }
    }
}