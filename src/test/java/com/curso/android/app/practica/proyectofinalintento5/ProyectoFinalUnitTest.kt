package com.curso.android.app.practica.proyectofinalintento5

import org.junit.Test

import org.junit.Assert.*


class ProyectoFinalUnitTest {

    fun compararPalabras(word1: String, word2: String): Boolean {
        return word1 == word2
    }
    @Test
    fun testPalabrasIguales() {
        val result = compararPalabras("manzana", "manzana")
        assertTrue(result)
    }

    @Test
    fun testPalabrasNoIguales() {
        val result = compararPalabras("apple", "banana")
        assertFalse(result)
    }

}