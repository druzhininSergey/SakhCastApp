package com.example.sakhcastapplication.model


data class Series(
    val id: Int,
    val title: String,
    val imdbRating: Double,
    val kinopoiskRating: Double,
    val releaseYear: Int,
    val totalSeries: String
)

data class Movie(
    val id: Int,
    val title: String,
    val imdbRating: Double,
    val kinopoiskRating: Double,
    val releaseYear: Int,
    val duration: String
)