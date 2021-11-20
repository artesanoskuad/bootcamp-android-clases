package com.artesanoskuad.pruebakotlin.model

interface LibrosRepository {
    fun add(new: LibrosEscolares) : Boolean
    fun getAll() : List<LibrosEscolares>
}