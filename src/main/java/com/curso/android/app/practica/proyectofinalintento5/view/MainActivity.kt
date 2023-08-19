package com.curso.android.app.practica.proyectofinalintento5.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.curso.android.app.practica.proyectofinalintento5.viewModel.ClaseViewModel
import com.curso.android.app.practica.proyectofinalintento5.databinding.ActivityMainBinding
class MainActivity : AppCompatActivity() {
    private lateinit var viewModel: ClaseViewModel
    private lateinit var binding: ActivityMainBinding // Clase generada por View Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel = ViewModelProvider(this).get(ClaseViewModel::class.java)

        binding.compareButton.setOnClickListener {
            val word1 = binding.word1EditText.text.toString()
            val word2 = binding.word2EditText.text.toString()

            viewModel.compareWords(word1, word2)
        }

        viewModel.comparisonResult.observe(this, { areEqual ->
            binding.resultTextView.text = if (areEqual) "Las palabras son IGUALES" else "Las palabras son DIFERENTES"
        })
    }
}
