package com.example.sakhcastapplication.data

import com.example.sakhcastapplication.model.Series


object STUB {
    val series: List<Series> = listOf(
        Series(1, "Сериал 1", 9.0, 10.0, 2022, "1 Сезон 23 Cерии"),
        Series(2, "Сериал 2", 8.5, 12.0, 2023, "3 Сезон 15 Cерии"),
        Series(3, "Сериал 3", 7.8, 11.5, 2021, "2 Сезон 20 Cерии"),
        Series(4, "Сериал 4", 8.9, 9.8, 2020, "5 Сезон 28 Cерии"),
        Series(5, "Сериал 5", 7.2, 14.2, 2019, "1 Сезон 10 Cерии"),
        Series(6, "Сериал 6", 8.3, 11.7, 2018, "4 Сезон 24 Cерии"),
        Series(7, "Сериал 7", 9.1, 12.5, 2022, "2 Сезон 18 Cерии"),
        Series(8, "Сериал 8", 7.5, 10.3, 2023, "3 Сезон 22 Cерии"),
        Series(9, "Сериал 9", 8.7, 13.0, 2021, "2 Сезон 15 Cерии"),
        Series(10, "Сериал 10", 8.0, 11.8, 2020, "4 Сезон 20 Cерии")
    )

    fun getAllSeries(): List<Series> = series
}
