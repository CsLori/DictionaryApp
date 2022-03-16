package com.example.dictionaryapp.feature_dictionary.domain.model

import com.example.dictionaryapp.feature_dictionary.data.remote.dto.DefinitionDto

data class Meaning(
    val definitions: List<DefinitionDto>,
    val partOfSpeech: String,
) {
    fun toMeaning() : Meaning {
        return Meaning(
            definitions = definitions,
            partOfSpeech = partOfSpeech,
        )
    }
}
