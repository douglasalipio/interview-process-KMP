package com.br.interview.composeApp.data.datasource

import com.br.interview.composeApp.domain.model.Movie

object MockMovieDataSource {
    fun getMovies(): List<Movie> = listOf(
        Movie(
            id = 1,
            title = "The Shawshank Redemption",
            overview = "Two imprisoned men bond over a number of years, finding solace and eventual redemption through acts of common decency.",
            posterPath = "https://image.tmdb.org/t/p/w500/q6y0Go1tsGEsmtFryDOJo3dEmqu.jpg",
            releaseDate = "1994-09-23",
            rating = 9.3,
            genres = listOf("Drama", "Crime"),
            duration = 142,
            director = "Frank Darabont",
            cast = listOf("Tim Robbins", "Morgan Freeman", "Bob Gunton")
        ),
        Movie(
            id = 2,
            title = "The Godfather",
            overview = "The aging patriarch of an organized crime dynasty transfers control of his clandestine empire to his reluctant son.",
            posterPath = "https://image.tmdb.org/t/p/w500/3bhkrj58Vtu7enYsRolD1fZdja1.jpg",
            releaseDate = "1972-03-24",
            rating = 9.2,
            genres = listOf("Crime", "Drama"),
            duration = 175,
            director = "Francis Ford Coppola",
            cast = listOf("Marlon Brando", "Al Pacino", "James Caan")
        ),
        Movie(
            id = 3,
            title = "The Dark Knight",
            overview = "When the menace known as the Joker wreaks havoc and chaos on the people of Gotham, Batman must accept one of the greatest psychological and physical tests.",
            posterPath = "https://image.tmdb.org/t/p/w500/qJ2tW6WMUDux911r6m7haRef0WH.jpg",
            releaseDate = "2008-07-18",
            rating = 9.0,
            genres = listOf("Action", "Crime", "Drama"),
            duration = 152,
            director = "Christopher Nolan",
            cast = listOf("Christian Bale", "Heath Ledger", "Aaron Eckhart")
        ),
        Movie(
            id = 4,
            title = "Pulp Fiction",
            overview = "The lives of two mob hitmen, a boxer, a gangster and his wife intertwine in four tales of violence and redemption.",
            posterPath = "https://image.tmdb.org/t/p/w500/fIE3lAGcZDV1G6XM5KmuWnNsPp1.jpg",
            releaseDate = "1994-10-14",
            rating = 8.9,
            genres = listOf("Crime", "Drama"),
            duration = 154,
            director = "Quentin Tarantino",
            cast = listOf("John Travolta", "Uma Thurman", "Samuel L. Jackson")
        ),
        Movie(
            id = 5,
            title = "Inception",
            overview = "A thief who steals corporate secrets through the use of dream-sharing technology is given the inverse task of planting an idea.",
            posterPath = "https://image.tmdb.org/t/p/w500/edv5CZvWj09upOsy2Y6IwDhK8bt.jpg",
            releaseDate = "2010-07-16",
            rating = 8.8,
            genres = listOf("Action", "Sci-Fi", "Thriller"),
            duration = 148,
            director = "Christopher Nolan",
            cast = listOf("Leonardo DiCaprio", "Marion Cotillard", "Elliot Page")
        ),
        Movie(
            id = 6,
            title = "Fight Club",
            overview = "An insomniac office worker and a devil-may-care soap maker form an underground fight club that evolves into much more.",
            posterPath = "https://image.tmdb.org/t/p/w500/pB8BM7pdSp6B6Ih7QZ4DrQ3PmJK.jpg",
            releaseDate = "1999-10-15",
            rating = 8.8,
            genres = listOf("Drama"),
            duration = 139,
            director = "David Fincher",
            cast = listOf("Brad Pitt", "Edward Norton", "Helena Bonham Carter")
        ),
        Movie(
            id = 7,
            title = "The Matrix",
            overview = "A computer programmer discovers that reality as he knows it is a simulation created by machines.",
            posterPath = "https://image.tmdb.org/t/p/w500/f89U3ADr1oiB1s9GkdPOEpXUk5H.jpg",
            releaseDate = "1999-03-31",
            rating = 8.7,
            genres = listOf("Action", "Sci-Fi"),
            duration = 136,
            director = "The Wachowskis",
            cast = listOf("Keanu Reeves", "Laurence Fishburne", "Carrie-Anne Moss")
        ),
        Movie(
            id = 8,
            title = "Goodfellas",
            overview = "The story of Henry Hill and his life in the mob, covering his relationship with his wife Karen Hill and his mob partners.",
            posterPath = "https://image.tmdb.org/t/p/w500/aKuFiU82s5ISJpGZp7YkIr3kCUd.jpg",
            releaseDate = "1990-09-19",
            rating = 8.7,
            genres = listOf("Crime", "Drama"),
            duration = 146,
            director = "Martin Scorsese",
            cast = listOf("Robert De Niro", "Ray Liotta", "Joe Pesci")
        )
    )
}