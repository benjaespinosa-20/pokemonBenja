package com.benjaminespi.pokemonbenja.home.service

import com.benjaminespi.pokemonbenja.home.model.api.PokeApiResponse
import com.benjaminespi.pokemonbenja.home.model.api.Pokemon
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiService {
    @GET("pokemon/{id}")
    fun getPokemonInfo(@Path("id") id: Int): Call<Pokemon>
    @GET("pokemon-species")
    fun getPokemonList(@Query("limit") limit: Int, @Query("offset") offset: Int): Call<PokeApiResponse>
}