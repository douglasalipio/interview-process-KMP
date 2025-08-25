package com.br.interview.composeApp.di

import com.br.interview.composeApp.data.repository.MovieRepositoryImpl
import com.br.interview.composeApp.domain.repository.MovieRepository
import com.br.interview.composeApp.domain.usecase.GetMovieByIdUseCase
import com.br.interview.composeApp.domain.usecase.GetMoviesUseCase
import com.br.interview.composeApp.presentation.viewmodel.MovieDetailViewModel
import com.br.interview.composeApp.presentation.viewmodel.MovieListViewModel

object AppModule {
    private val movieRepository: MovieRepository by lazy {
        MovieRepositoryImpl()
    }
    
    private val getMoviesUseCase by lazy {
        GetMoviesUseCase(movieRepository)
    }
    
    private val getMovieByIdUseCase by lazy {
        GetMovieByIdUseCase(movieRepository)
    }
    
    fun provideMovieListViewModel(): MovieListViewModel {
        return MovieListViewModel(getMoviesUseCase)
    }
    
    fun provideMovieDetailViewModel(): MovieDetailViewModel {
        return MovieDetailViewModel(getMovieByIdUseCase)
    }
}