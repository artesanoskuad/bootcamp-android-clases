package com.artesanoskuad.pruebakotlin.model

class InLocalMemoryLibrosRepository(private val libros: MutableList<LibrosEscolares>) : LibrosRepository {

    override fun add(new: LibrosEscolares) : Boolean {
        return libros.add(new)
    }

    override fun getAll(): List<LibrosEscolares> {
        return libros
    }
}