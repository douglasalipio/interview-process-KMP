package com.br.interview.composeApp.presentation.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import com.br.interview.composeApp.domain.usecase.GetMovieByIdUseCase
import com.br.interview.composeApp.presentation.state.MovieDetailState
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MovieDetailViewModel(
    private val getMovieByIdUseCase: GetMovieByIdUseCase
) {
    var state by mutableStateOf(MovieDetailState())
        private set
    
    private val viewModelScope = CoroutineScope(Dispatchers.Main)
    
    fun loadMovie(movieId: Int) {
        viewModelScope.launch {
            state = state.copy(isLoading = true)
            try {
                val movie = getMovieByIdUseCase(movieId)
                state = state.copy(
                    movie = movie,
                    isLoading = false,
                    error = if (movie == null) "Movie not found" else null
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