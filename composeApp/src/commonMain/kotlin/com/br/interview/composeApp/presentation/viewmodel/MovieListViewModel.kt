package com.br.interview.composeApp.presentation.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import com.br.interview.composeApp.domain.usecase.GetMoviesUseCase
import com.br.interview.composeApp.presentation.state.MovieListState
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MovieListViewModel(
    private val getMoviesUseCase: GetMoviesUseCase
) {
    var state by mutableStateOf(MovieListState())
        private set
    
    private val viewModelScope = CoroutineScope(Dispatchers.Main)
    
    init {
        loadMovies()
    }
    
    private fun loadMovies() {
        viewModelScope.launch {
            state = state.copy(isLoading = true)
            try {
                val movies = getMoviesUseCase()
                state = state.copy(
                    movies = movies,
                    isLoading = false,
                    error = null
                )
            } catch (e: Exception) {
                state = state.copy(
                    isLoading = false,
                    error = e.message ?: "Unknown error occurred"
                )
            }
        }
    }
}