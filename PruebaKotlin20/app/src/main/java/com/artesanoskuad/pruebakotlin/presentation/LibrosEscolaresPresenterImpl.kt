package com.artesanoskuad.pruebakotlin.presentation

import android.annotation.SuppressLint
import android.view.View
import com.artesanoskuad.pruebakotlin.model.LibrosEscolares
import com.artesanoskuad.pruebakotlin.model.LibrosRepository
import com.artesanoskuad.pruebakotlin.view.LibrosEscolaresView
import java.text.SimpleDateFormat

class LibrosEscolaresPresenterImpl(
    private val repository: LibrosRepository
) : LibrosEscolaresPresenter {

    private lateinit var view: LibrosEscolaresView

    override fun attachView(view: LibrosEscolaresView) {
        this.view = view
    }

    override fun add(new: LibrosEscolares) {
        var isAllValid = true
        if (!isValidAutorDelLibro(new.autorDelLibro)) {
            view.showErrorAutorDelLibro()
            isAllValid = false
        }

        if (!isValidCantidadDePaginas(new.cantidadDePaginas)) {
            view.showErrorCantidadDePaginas()
            isAllValid = false
        }

        if (!isValidEditorial(new.editorial)) {
            view.showErrorEditorial()
            isAllValid = false
        }

        if (!isValidFechaPublicacion(new.fechaPublicacion)) {
            view.showErrorFechaPublicacion()
            isAllValid = false
        }

        if (!isValidISBN(new.ISBN)) {
            view.showErrorISBN()
            isAllValid = false
        }

        if (isAllValid) {
            val isAdd = repository.add(new)
            if (isAdd) {
                view.showLibroCreado(new)
            } else {
                view.showErrorRepository()
            }
        }
    }

    override fun getAll(): List<LibrosEscolares> {
        return repository.getAll()
    }

    override fun isValidName(name: String): Boolean {
        return name.isNotBlank()
    }

    override fun isValidISBN(ISBN: String): Boolean {
        //codigo tomado de Java en internet https://www.codegrepper.com/code-examples/java/validate+isbn+number+java
        val rawISBN = ISBN.replace("-", "")

        if (rawISBN.length != 10) {
            return false
        }

        try {
            var total = 0
            for (indice in 0..9) {
                val digit = Integer.parseInt(rawISBN.substring(indice, indice + 1))
                total += (10 - indice) * digit
            }

            var checkSum = ((11 - (total % 11)) % 11).toString()
            if (checkSum == "10") {
                checkSum = "X"
            }

            return checkSum == rawISBN.substring(9)
        } catch (e: Exception) {
            return false
        }
    }

    @SuppressLint("SimpleDateFormat")
    override fun isValidFechaPublicacion(fechaPublicacion: String): Boolean {
        return try {
            val formatoFecha = SimpleDateFormat("dd/MM/yyyy")
            formatoFecha.parse(fechaPublicacion)
            true
        } catch (e: Exception) {
            false
        }
    }

    override fun isValidEditorial(editorial: String): Boolean {
        return editorial.isNotBlank()
    }

    override fun isValidCantidadDePaginas(cantidad: Int): Boolean {
        return cantidad > 0
    }

    override fun isValidAutorDelLibro(autor: String): Boolean {
        return autor.isNotBlank()
    }
}
