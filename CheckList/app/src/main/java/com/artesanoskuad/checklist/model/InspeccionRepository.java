package com.artesanoskuad.checklist.model;

import java.util.List;

public interface InspeccionRepository {

    //Obtener el listado de Inspecciones almacenadas
    List<Inspeccion> getInspecciones();

    //Filtrar inspecciones por marca, modelo o fecha (Inspección Detalle)
    List<Inspeccion> getInspecciones(InspeccionDetalle detalle);

    //Agregar una nueva Inspeccion
    boolean agregarInspeccion(Inspeccion nuevaInspeccion);
}
