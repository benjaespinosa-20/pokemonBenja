package com.benjaminespi.pokemonbenja.home.ui.abil

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.benjaminespi.pokemonbenja.R
import com.benjaminespi.pokemonbenja.databinding.ActivityAbilBinding

class AbilActivity : AppCompatActivity() {

    companion object{
        const val IDPOKE = "id"
    }

    lateinit var binding: ActivityAbilBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityAbilBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

    }
}