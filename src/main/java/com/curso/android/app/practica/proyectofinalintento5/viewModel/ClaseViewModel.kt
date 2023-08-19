package com.curso.android.app.practica.proyectofinalintento5.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.curso.android.app.practica.proyectofinalintento5.model.ClasePalabra

class ClaseViewModel : ViewModel() {
    private val _comparisonResult = MutableLiveData<Boolean>()
    val comparisonResult: LiveData<Boolean>
        get() = _comparisonResult

    private val clasePalabra = ClasePalabra()

    fun compareWords(word1: String, word2: String) {
        _comparisonResult.value = clasePalabra.compareWords(word1, word2)
    }
}