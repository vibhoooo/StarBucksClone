package com.example.starbucksclone.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.starbucksclone.screens.DetailScreen
import com.example.starbucksclone.screens.HomeScreen
import com.example.starbucksclone.screens.StartScreen

@Composable
fun Navigation() {
    val navHostController = rememberNavController()
    NavHost(
        navController = navHostController,
        startDestination = start,
    ) {
        composable(
            start
        ) {
            StartScreen(
                navHostController = navHostController
            )
        }
        composable(
            home
        ) {
            HomeScreen(
                navHostController = navHostController
            )
        }
        composable(
            detail
        ){
            DetailScreen(
                navHostController = navHostController
            )
        }
    }
}
const val start = "start_screen"
const val home = "home_screen"
const val detail = "detail_screen"