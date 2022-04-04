package com.benjaminespi.pokemonbenja.home.ui.info

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.benjaminespi.pokemonbenja.databinding.ActivityInfoBinding
import com.bumptech.glide.Glide

class InfoActivity : AppCompatActivity() {
    lateinit var viewModel: InfoViewModel
    lateinit var binding: ActivityInfoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityInfoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel = ViewModelProvider(this).get(InfoViewModel::class.java)

        initUI()
    }
    private fun initUI(){
        val id = intent.extras?.get("id") as Int

        viewModel.getPokemonInfo(id)

        viewModel.pokemonInfo.observe(this, Observer { pokemon ->
            binding.nameTextView.text = pokemon.name
            binding.heightText.text = "Altura: ${pokemon.height/10.0}m"
            binding.weightText.text = "Peso: ${pokemon.weight/10.0}"

            Glide.with(this).load(pokemon.sprites.frontDefault).into(binding.imageView)
        })
    }
}