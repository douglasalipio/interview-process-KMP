package com.br.interview.composeApp.domain.usecase

import com.br.interview.composeApp.domain.model.Movie
import com.br.interview.composeApp.domain.repository.MovieRepository

class GetMoviesUseCase(
    private val repository: MovieRepository
) {
    suspend operator fun invoke(): List<Movie> {
        return repository.getMovies()
    }
}