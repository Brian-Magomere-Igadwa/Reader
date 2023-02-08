package design.propia.reader.presentation.navigation

enum class ReaderScreens {
    ReaderSplashScreen,
    LoginScreen,
    CreateAccountScreen,
    HomeScreen,
    SearchScreen,
    UpdateScreen,
    BookDetailsScreen,
    StatsScreen;

    companion object {
        fun fromRoute(route: String?): ReaderScreens =
            when (route?.substringBefore("/")) {
                ReaderSplashScreen.name -> ReaderSplashScreen
                LoginScreen.name -> LoginScreen
                CreateAccountScreen.name -> CreateAccountScreen
                HomeScreen.name -> HomeScreen
                SearchScreen.name -> SearchScreen
                UpdateScreen.name -> UpdateScreen
                BookDetailsScreen.name -> BookDetailsScreen
                StatsScreen.name -> StatsScreen
                null -> HomeScreen
                else -> throw IllegalArgumentException("Sorry : Route $route is not recognized")
            }
    }
}