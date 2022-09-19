package com.example.alkemychallenge.services

import com.example.alkemychallenge.models.MovieResponse
import retrofit2.http.GET
import retrofit2.Call

interface MovieApiInterface {
    @GET("/3/movie/popular?api_key=5f66c6b3940576ad23fc84b9e11a7f7b")
    fun getMovieList(): Call<MovieResponse>
}