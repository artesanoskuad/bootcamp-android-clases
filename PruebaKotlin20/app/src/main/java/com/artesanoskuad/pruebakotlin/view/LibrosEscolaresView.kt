package com.artesanoskuad.pruebakotlin.view

import com.artesanoskuad.pruebakotlin.model.LibrosEscolares

interface LibrosEscolaresView {
    fun agregarLibro(new: LibrosEscolares)
    fun showErrorName()
    fun showErrorISBN()
    fun showErrorFechaPublicacion()
    fun showErrorEditorial()
    fun showErrorCantidadDePaginas()
    fun showErrorAutorDelLibro()
    fun showLibroCreado(librosEscolares: LibrosEscolares)
    fun showLibros(list: List<LibrosEscolares>)
    fun showErrorRepository()
}