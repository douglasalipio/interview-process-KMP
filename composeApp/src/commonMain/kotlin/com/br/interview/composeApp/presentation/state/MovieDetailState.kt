package com.br.interview.composeApp.presentation.state

import com.br.interview.composeApp.domain.model.Movie

data class MovieDetailState(
    val movie: Movie? = null,
    val isLoading: Boolean = false,
    val error: String? = null
)