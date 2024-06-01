package com.example.sakhcastapplication.data

import com.example.sakhcastapplication.model.BackdropColors
import com.example.sakhcastapplication.model.Genre
import com.example.sakhcastapplication.model.Network
import com.example.sakhcastapplication.model.PosterColors
import com.example.sakhcastapplication.model.Season
import com.example.sakhcastapplication.model.Series
import com.example.sakhcastapplication.model.Trailer
import com.example.sakhcastapplication.model.UserFavorite

object SeriesSample {
    val series = Series(
        id = 1961,
        url = "/show/the.good.doctor/",
        backdrop = "https://cf2-static-eu1.stvcdn.org/img/backdrops/lp/8d/att6xp3f-960x540.png",
        backdropAlt = "https://cf2-static-eu1.stvcdn.org/img/cache/MD/Q0/YTE2MjE4NGM5Y2VlMjppbWcvYmFja2Ryb3BzL2xwLzhkL2F0dDZ4cDNmLnBuZzo5NjA6NTQwOjA6OTA.",
        isDarkBackdrop = true,
        backdropColors = BackdropColors(
            background1 = "#440f1a",
            background2 = "#6b3540",
            title = "#c0a4a5",
            text = "#ffffff",
            lum = 92.001650165016
        ),
        poster = "https://cf4-static-eu1.stvcdn.org/img/posters/37/0c/5qjscj5b-396x594.png",
        posterAlt = "https://cf1-static-eu1.stvcdn.org/img/cache/ND/Mw/Y2U5OTczZjJiZDFkMDppbWcvcG9zdGVycy8zNy8wYy81cWpzY2o1Yi5wbmc6Mzk2OjU5NDowOjkw.",
        posterColors = PosterColors(
            background1 = "#85b0b6",
            background2 = "#5f8a90",
            title = "#8a6d62",
            text = "#ffffff",
            lum = 137.74043715847
        ),
        name = "Хороший доктор",
        eName = "The Good Doctor",
        tvShow = "the.good.doctor",
        ageLimits = 18,
        genres = listOf(
            Genre(id = 5185, name = "драма", variant = "info"),
            Genre(id = 5186, name = "медицина", variant = "default")
        ),
        titles = listOf(),
        year = 2017,
        yearEnd = 2024,
        country = listOf("США"),
        network = listOf("ABC"),
        networks = listOf(Network(id = 2, name = "ABC")),
        website = "https://abc.com/shows/the-good-doctor",
        status = "Завершен",
        imdbRating = 8.0,
        imdbUrl = "http://www.imdb.com/title/tt6470478/",
        kpRating = 7.997,
        kpId = 1011528,
        runtime = "43",
        views = 188708,
        about = "История молодого талантливого врача с синдромом саванта, обладающего уникальными способностями — невероятной памятью и фантастической чувствительностью к проблемам, вспыхивающим внутри человеческого организма. Герой становится блестящим хирургом, несмотря на то, в личностном плане его развитие соответствует развитию десятилетнего ребёнка…",
        aboutPlain = "История молодого талантливого врача с синдромом саванта, обладающего уникальными способностями — невероятной памятью и фантастической чувствительностью к проблемам, вспыхивающим внутри человеческого организма. Герой становится блестящим хирургом, несмотря на то, в личностном плане его развитие соответствует развитию десятилетнего ребёнка…",
        trailers = listOf(
            Trailer(
                id = 3775,
                serialId = 1961,
                site = "YouTube",
                path = "DQ4akh9CQhc",
                name = "Тизер №1. Сезон 4",
                lang = "ru",
                type = "Teaser",
                size = 1080,
                isDeleted = 0
            ),
            Trailer(
                id = 3815,
                serialId = 1961,
                site = "YouTube",
                path = "wAIQ7EXVjWw",
                name = "Трейлер №1. Сезон 4",
                lang = "ru",
                type = "Trailer",
                size = 1080,
                isDeleted = 0
            ),
            Trailer(
                id = 7812,
                serialId = 1961,
                site = "YouTube",
                path = "lnY9FWUTY84",
                name = "The Good Doctor – Official Trailer",
                lang = "en",
                type = "Trailer",
                size = 1080,
                isDeleted = 0
            ),
            Trailer(
                id = 1479,
                serialId = 1961,
                site = "YouTube",
                path = "fYlZDTru55g",
                name = "The Good Doctor - Official Trailer - Coming to ABC September 25",
                lang = "en",
                type = "Trailer",
                size = 720,
                isDeleted = 0
            )
        ),
        favAmount = 883,
        userRating = null,
        userLastMedia = "/watch/the.good.doctor/07/09/lostfilm/",
        userLastMediaId = 233284,
        userLastMediaTime = 2554,
        userLastSeason = "7",
        userLastSeasonId = 12142,
        userFavorite = UserFavorite(id = 208504, kind = "watching", notify = 1, voices = listOf()),
        seasons = listOf(
            Season(id = 5359, index = "01"),
            Season(id = 6055, index = "02"),
            Season(id = 6768, index = "03"),
            Season(id = 7893, index = "04"),
            Season(id = 8716, index = "05"),
            Season(id = 9766, index = "06"),
            Season(id = 12142, index = "07")
        )
    )

    fun getFullSeries() = series
}