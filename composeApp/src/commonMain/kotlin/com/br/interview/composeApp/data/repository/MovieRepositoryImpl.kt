package com.br.interview.composeApp.data.repository

import com.br.interview.composeApp.data.datasource.MockMovieDataSource
import com.br.interview.composeApp.domain.model.Movie
import com.br.interview.composeApp.domain.repository.MovieRepository

class MovieRepositoryImpl : MovieRepository {
    private val movies = MockMovieDataSource.getMovies()
    
    override suspend fun getMovies(): List<Movie> {
        return movies
    }
    
    override suspend fun getMovieById(id: Int): Movie? {
        return movies.find { it.id == id }
    }
}