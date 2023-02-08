package design.propia.reader.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import design.propia.reader.presentation.screens.`reader-splash`.ReaderSplashScreen
import design.propia.reader.presentation.screens.details.BookDetailsScreen
import design.propia.reader.presentation.screens.home.HomeScreen
import design.propia.reader.presentation.screens.login.LoginScreen
import design.propia.reader.presentation.screens.search.SearchScreen
import design.propia.reader.presentation.screens.stats.StatsScreen
import design.propia.reader.presentation.screens.update.UpdateScreen

@Composable
fun ReaderNavigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = ReaderScreens.HomeScreen.name) {
        composable(ReaderScreens.ReaderSplashScreen.name) {
            ReaderSplashScreen(navController = navController)
        }
        composable(ReaderScreens.HomeScreen.name) {
            HomeScreen(navController = navController)
        }
        composable(ReaderScreens.StatsScreen.name) {
            StatsScreen(navController = navController)
        }
        composable(ReaderScreens.SearchScreen.name) {
            SearchScreen(navController = navController)
        }
        composable(ReaderScreens.UpdateScreen.name) {
            UpdateScreen(navController = navController)
        }
        composable(ReaderScreens.LoginScreen.name) {
            LoginScreen(navController = navController)
        }
        composable(ReaderScreens.BookDetailsScreen.name) {
            BookDetailsScreen(navController = navController)
        }

    }

}