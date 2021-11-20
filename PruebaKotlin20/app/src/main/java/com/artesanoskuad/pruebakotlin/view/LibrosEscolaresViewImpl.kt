package com.artesanoskuad.pruebakotlin.view

import com.artesanoskuad.pruebakotlin.model.LibrosEscolares
import com.artesanoskuad.pruebakotlin.presentation.LibrosEscolaresPresenter

class LibrosEscolaresViewImpl(
    private val presenter: LibrosEscolaresPresenter
) : LibrosEscolaresView {

    init {
        presenter.getAll()
    }

    override fun agregarLibro(new: LibrosEscolares) {
        presenter.add(new)
    }

    override fun showErrorName() {
        println("Error con el Nombre")
    }

    override fun showErrorISBN() {
        println("Error con el ISBN")
    }

    override fun showErrorFechaPublicacion() {
        println("Error con la fecha de Publicación")
    }

    override fun showErrorEditorial() {
        println("Error con la editorial")
    }

    override fun showErrorCantidadDePaginas() {
        println("Error con la cantidad de páginas")
    }

    override fun showErrorAutorDelLibro() {
        println("Error con el autor del libro")
    }

    override fun showLibroCreado(librosEscolares: LibrosEscolares) {
        println("Libro creado con éxito!")
        println(librosEscolares.toString())
    }

    override fun showLibros(list: List<LibrosEscolares>) {
        println("Imprimiendo todos los libros, esto es para el Adapter del Recycler")
        println("list: $list")
    }

    override fun showErrorRepository() {
        println("No se pudo almacenar en memoria ram")
    }
}