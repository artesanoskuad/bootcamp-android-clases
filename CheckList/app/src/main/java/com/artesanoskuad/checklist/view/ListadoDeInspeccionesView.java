package com.artesanoskuad.checklist.view;

import com.artesanoskuad.checklist.model.Inspeccion;

import java.util.List;

public interface ListadoDeInspeccionesView {
    void mostrarInspecciones(List<Inspeccion> inspeccions);
    void mostrarListaVacia();
    void mostrarMensajeDeError(String mensaje);
}
