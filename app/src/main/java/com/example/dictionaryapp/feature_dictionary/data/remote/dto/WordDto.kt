package com.example.dictionaryapp.feature_dictionary.data.remote.dto

import com.example.dictionaryapp.feature_dictionary.domain.model.Meaning

data class WordDto(
    val meanings: List<Meaning>,
    val origin: String,
    val phonetic: String,
    val word: String
)