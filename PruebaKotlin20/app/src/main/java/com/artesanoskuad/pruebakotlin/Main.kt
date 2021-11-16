package com.artesanoskuad.pruebakotlin

import com.artesanoskuad.pruebakotlin.model.InLocalMemoryLibrosRepository
import com.artesanoskuad.pruebakotlin.model.LibrosEscolares
import com.artesanoskuad.pruebakotlin.model.LibrosRepository
import com.artesanoskuad.pruebakotlin.model.TipoLibro
import com.artesanoskuad.pruebakotlin.presentation.LibrosEscolaresPresenter
import com.artesanoskuad.pruebakotlin.presentation.LibrosEscolaresPresenterImpl
import com.artesanoskuad.pruebakotlin.view.LibrosEscolaresView
import com.artesanoskuad.pruebakotlin.view.LibrosEscolaresViewImpl

fun main(){
    val libroConErrorEnTodo = LibrosEscolares("","", "","",0,0,"",TipoLibro.DIGITAL)
    val cleanCode = LibrosEscolares(
        "Clean Code: A Handbook of Agile Software Craftsmanship",
        "9780132350884",
        "01-08-2008",
        "Addison-Wesley",
        464,
        30000,
        "Robert C. Martin",
        TipoLibro.DIGITAL
    )
    val cleanArchitecture = LibrosEscolares(
        "Clean Architecture: A Craftsman's Guide to Software Structure and Design",
        "0134494164",
        "17-09-2017",
        "Addison-Wesley",
        432,
        32000,
        "Robert C. Martin",
        TipoLibro.DIGITAL
    )

    val theCleanCoder = LibrosEscolares(
        "The Clean Coder: A Code of Conduct for Professional Programmers",
        "0137081073",
        "13-03-2011",
        "Addison-Wesley",
        242,
        35000,
        "Robert C. Martin",
        TipoLibro.DIGITAL
    )
    val repository : LibrosRepository = InLocalMemoryLibrosRepository(ArrayList())
    val presenter: LibrosEscolaresPresenter = LibrosEscolaresPresenterImpl(repository)
    val view : LibrosEscolaresView = LibrosEscolaresViewImpl(presenter)
    presenter.attachView(view)
    view.agregarLibro(cleanCode)

}