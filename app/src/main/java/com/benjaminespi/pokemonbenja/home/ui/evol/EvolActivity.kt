package com.benjaminespi.pokemonbenja.home.ui.evol

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.benjaminespi.pokemonbenja.R
import com.benjaminespi.pokemonbenja.databinding.ActivityEvolBinding

class EvolActivity : AppCompatActivity() {
    lateinit var binding: ActivityEvolBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityEvolBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}