package com.benjaminespi.pokemonbenja.home.ui.list

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.benjaminespi.pokemonbenja.R
import android.content.Intent
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.benjaminespi.pokemonbenja.databinding.ActivityListBinding
import com.benjaminespi.pokemonbenja.home.ui.info.InfoActivity
import kotlinx.android.synthetic.main.activity_list.*

class ListActivity : AppCompatActivity() {
    private lateinit var viewModel: ListViewModel
    private lateinit var binding: ActivityListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityListBinding.inflate(layoutInflater)
        setContentView(binding.root)
        viewModel = ViewModelProvider(this).get(ListViewModel::class.java)

        initUI()
    }
    private fun initUI(){
        binding.listRecyclerView.layoutManager = LinearLayoutManager(this)
        binding.listRecyclerView.adapter = ListAdapter{
            val intent = Intent(this, InfoActivity::class.java)
            intent.putExtra("id", it)
            startActivity(intent)
        }

        viewModel.getPokemonList()

        viewModel.pokemonList.observe(this, Observer { list ->
            (binding.listRecyclerView.adapter as ListAdapter).setData(list)
        })
    }
}