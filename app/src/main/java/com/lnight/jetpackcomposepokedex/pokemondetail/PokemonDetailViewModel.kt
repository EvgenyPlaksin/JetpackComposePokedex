package com.lnight.jetpackcomposepokedex.pokemondetail

import androidx.lifecycle.ViewModel
import com.lnight.jetpackcomposepokedex.data.remote.responses.Pokemon
import com.lnight.jetpackcomposepokedex.repository.PokemonRepository
import com.lnight.jetpackcomposepokedex.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class PokemonDetailViewModel @Inject constructor(
    private val repository: PokemonRepository
) : ViewModel() {

    suspend fun getPokemonInfo(pokemonName: String): Resource<Pokemon> {
        return repository.getPokemonInfo(pokemonName)
    }
}