package com.artesanoskuad.checklist.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LocalInspeccionRepository implements  InspeccionRepository {

    private List<Inspeccion> inspeccionesEnMemoria;

    public LocalInspeccionRepository() {
        inspeccionesEnMemoria = new ArrayList<>();
        inspeccionesEnMemoria.add(new Inspeccion(
                new InspeccionDetalle("Acer", "Acer2021", "08-11-2021"),
                new HashMap<>(),
                "Obs 1234"
        ));
    }

    @Override
    public List<Inspeccion> getInspecciones() {
        return inspeccionesEnMemoria;
    }

    @Override
    public List<Inspeccion> getInspecciones(InspeccionDetalle detalle) {
        return null;
    }

    @Override
    public boolean agregarInspeccion(Inspeccion nuevaInspeccion) {
        return false;
    }
}
