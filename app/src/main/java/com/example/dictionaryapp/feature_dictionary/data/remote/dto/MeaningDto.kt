package com.example.dictionaryapp.feature_dictionary.data.remote.dto

import com.example.dictionaryapp.feature_dictionary.domain.model.Definition
import com.example.dictionaryapp.feature_dictionary.domain.model.Meaning

data class MeaningDto(
    val antonyms: List<String>,
    val definitions: List<Definition>,
    val partOfSpeech: String,
    val synonyms: List<String>
) {
    fun toMeaning () : Meaning {
        return Meaning(
            definitions = definitions,
            partOfSpeech = partOfSpeech,
        )
    }
}