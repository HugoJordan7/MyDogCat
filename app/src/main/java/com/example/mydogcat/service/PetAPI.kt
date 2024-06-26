package com.example.mydogcat.service

import com.example.mydogcat.model.Pet
import com.example.mydogcat.model.PetDetails
import com.example.mydogcat.util.API_KEY
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface PetAPI { // Agora isso é o PetService

    @GET("search")
    fun findPetList(
        @Query("limit") limit: Int,
        @Query("api_key") apiKey: String = API_KEY,
        @Query("has_breeds") hasBreeds: Int = 0
    ): Call<List<Pet>>

    @GET("{id}")
    fun findPetDetails(
        @Path("id") id: String,
        @Query("api_key") apiKey: String = API_KEY
    ): Call<PetDetails>

}