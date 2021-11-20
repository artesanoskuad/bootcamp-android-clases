package com.artesanoskuad.checklist.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LocalInspeccionRepository implements  InspeccionRepository {

    private final List<Inspeccion> inspeccionesEnMemoria;

    public LocalInspeccionRepository() {
        inspeccionesEnMemoria = new ArrayList<>();
        inspeccionesEnMemoria.add(new Inspeccion(
                crearDetalleInspeccion("Acer", "Acer2021", "08-11-2021"),
                crearCheckListInspeccion(),
                "Obs 1234"
        ));
    }

    private HashMap<String, Boolean> crearCheckListInspeccion() {
        HashMap<String, Boolean> checkList = new HashMap<>();
        checkList.put("Equipo en caja", true);
        checkList.put("Cargador en caja", false);
        checkList.put("Manual en caja", true);
        checkList.put("Garantía en caja", true);
        checkList.put("Equipo enciende carga SO", true);
        checkList.put("Monitor sin problemas", true);
        checkList.put("Audio sin problemas", true);
        checkList.put("Touchpad sin problemas", true);
        return checkList;
    }

    private InspeccionDetalle crearDetalleInspeccion(String marca, String modelo, String fecha) {
        return new InspeccionDetalle(marca, modelo, fecha);
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
