package com.br.interview.composeApp.presentation.state

import com.br.interview.composeApp.domain.model.Movie

data class MovieListState(
    val movies: List<Movie> = emptyList(),
    val isLoading: Boolean = false,
    val error: String? = null
)