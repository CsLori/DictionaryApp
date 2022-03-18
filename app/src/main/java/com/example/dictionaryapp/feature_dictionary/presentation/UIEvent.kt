package com.example.dictionaryapp.feature_dictionary.presentation

sealed class UIEvent {
    data class ShowSnackBar(val message: String) : UIEvent()
}
