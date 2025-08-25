package com.br.interview.composeApp.domain.model

data class Movie(
    val id: Int,
    val title: String,
    val overview: String,
    val posterPath: String,
    val releaseDate: String,
    val rating: Double,
    val genres: List<String>,
    val duration: Int,
    val director: String,
    val cast: List<String>
)