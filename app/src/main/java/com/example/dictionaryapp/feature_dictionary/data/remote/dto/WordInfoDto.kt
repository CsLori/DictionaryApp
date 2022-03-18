package com.example.dictionaryapp.feature_dictionary.data.remote.dto

import com.example.dictionaryapp.feature_dictionary.data.local.entity.WordInfoEntity
import com.example.dictionaryapp.feature_dictionary.domain.model.Meaning
import com.example.dictionaryapp.feature_dictionary.domain.model.WordInfo

data class WordInfoDto(
    val meanings: List<Meaning>,
    val origin: String,
    val phonetic: String,
    val word: String
)  {
    fun toWordInfoEntity() : WordInfoEntity {
        return WordInfoEntity (
            meanings = meanings,
            origin = origin,
            phonetic= phonetic,
            word = word
        )
    }
}