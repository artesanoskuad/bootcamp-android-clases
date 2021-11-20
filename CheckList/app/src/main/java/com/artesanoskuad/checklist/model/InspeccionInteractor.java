package com.artesanoskuad.checklist.model;

import java.util.List;

public class InspeccionInteractor {

    private final InspeccionRepository repository;

    public InspeccionInteractor(InspeccionRepository repository) {
        this.repository = repository;
    }

    public boolean agregarInspeccion(Inspeccion nuevaInspeccion) {
        return repository.agregarInspeccion(nuevaInspeccion);
    }

    public List<Inspeccion> obtenerInspecciones() {
        return repository.getInspecciones();
    }

    public List<Inspeccion> obtenerInspecciones(InspeccionDetalle inspeccionDetalle) {
        return repository.getInspecciones(inspeccionDetalle);
    }

}
