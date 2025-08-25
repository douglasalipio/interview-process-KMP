package com.br.interview.composeApp

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.*
import com.br.interview.composeApp.di.AppModule
import com.br.interview.composeApp.presentation.screen.MovieDetailScreen
import com.br.interview.composeApp.presentation.screen.MovieListScreen
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    MaterialTheme {
        var currentScreen by remember { mutableStateOf<Screen>(Screen.MovieList) }
        
        when (val screen = currentScreen) {
            is Screen.MovieList -> {
                val viewModel = remember { AppModule.provideMovieListViewModel() }
                MovieListScreen(
                    viewModel = viewModel,
                    onMovieClick = { movie ->
                        currentScreen = Screen.MovieDetail(movie.id)
                    }
                )
            }
            is Screen.MovieDetail -> {
                val viewModel = remember { AppModule.provideMovieDetailViewModel() }
                MovieDetailScreen(
                    movieId = screen.movieId,
                    viewModel = viewModel,
                    onBackClick = {
                        currentScreen = Screen.MovieList
                    }
                )
            }
        }
    }
}

sealed class Screen {
    object MovieList : Screen()
    data class MovieDetail(val movieId: Int) : Screen()
}