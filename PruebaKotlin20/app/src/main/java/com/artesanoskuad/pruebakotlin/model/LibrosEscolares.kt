package com.artesanoskuad.pruebakotlin.model

data class LibrosEscolares(
    val nombre: String,
    val ISBN: String,
    val fechaPublicacion: String,
    val editorial: String,
    val cantidadDePaginas: Int,
    val precio: Int,
    val autorDelLibro: String,
    val tipoLibro: TipoLibro
) {

    fun precioFormateado() = "$$precio"

    override fun toString(): String {
        return "LibrosEscolares(nombre='$nombre', ISBN='$ISBN', fechaPublicacion='$fechaPublicacion', editorial='$editorial', cantidadDePaginas=$cantidadDePaginas, precio=$precio, autorDelLibro='$autorDelLibro', tipoLibro=$tipoLibro)"
    }
}


