package com.example.dictionaryapp.feature_dictionary.domain.model

import com.example.dictionaryapp.feature_dictionary.data.remote.dto.MeaningDto

data class Word(
    val meanings: List<MeaningDto>,
    val origin: String,
    val phonetic: String,
    val word: String
)  {
  fun toWord() : Word {
      return Word (
          meanings = meanings,
          origin = origin,
          phonetic= phonetic,
          word = word
      )
  }
}
