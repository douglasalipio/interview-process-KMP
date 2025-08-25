package com.br.interview.composeApp.domain.usecase

import com.br.interview.composeApp.domain.model.Movie
import com.br.interview.composeApp.domain.repository.MovieRepository

class GetMovieByIdUseCase(
    private val repository: MovieRepository
) {
    suspend operator fun invoke(movieId: Int): Movie? {
        return repository.getMovieById(movieId)
    }
}