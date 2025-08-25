package com.br.interview.composeApp.domain.repository

import com.br.interview.composeApp.domain.model.Movie

interface MovieRepository {
    suspend fun getMovies(): List<Movie>
    suspend fun getMovieById(id: Int): Movie?
}