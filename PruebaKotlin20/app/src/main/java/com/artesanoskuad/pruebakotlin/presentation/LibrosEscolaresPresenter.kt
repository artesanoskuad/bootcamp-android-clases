package com.artesanoskuad.pruebakotlin.presentation

import com.artesanoskuad.pruebakotlin.model.LibrosEscolares
import com.artesanoskuad.pruebakotlin.view.LibrosEscolaresView

interface LibrosEscolaresPresenter {
    fun attachView(view: LibrosEscolaresView)
    fun add(new: LibrosEscolares)
    fun getAll() : List<LibrosEscolares>

    fun isValidName(name: String) : Boolean
    fun isValidISBN(ISBN: String) : Boolean
    fun isValidFechaPublicacion(fechaPublicacion: String) : Boolean
    fun isValidEditorial(editorial: String) : Boolean
    fun isValidCantidadDePaginas(cantidad: Int) : Boolean
    fun isValidAutorDelLibro(autor: String):Boolean
    //No es necesario el "isValidTipoLibro, al ser una enumeración, no es necesario validar nada
}