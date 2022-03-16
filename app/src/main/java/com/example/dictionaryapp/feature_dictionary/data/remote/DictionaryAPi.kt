package com.example.dictionaryapp.feature_dictionary.data.remote

import com.example.dictionaryapp.feature_dictionary.data.remote.dto.WordDto
import retrofit2.http.GET
import retrofit2.http.Path

interface DictionaryAPi {

    @GET("/api/v2/entries/en{word}")
    suspend fun getWord(
        @Path("word") word: String
    ) : List<WordDto>
}