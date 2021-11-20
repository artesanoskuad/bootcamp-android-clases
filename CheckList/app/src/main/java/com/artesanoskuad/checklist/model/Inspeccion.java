package com.artesanoskuad.checklist.model;

import java.util.HashMap;

public class Inspeccion {
    private InspeccionDetalle detalle;
    private HashMap<String, Boolean> checkList;
    private String observaciones;

    public Inspeccion(InspeccionDetalle detalle, HashMap<String, Boolean> checkList, String observaciones) {
        this.detalle = detalle;
        this.checkList = checkList;
        this.observaciones = observaciones;
    }

    public InspeccionDetalle getDetalle() {
        return detalle;
    }

    public void setDetalle(InspeccionDetalle detalle) {
        this.detalle = detalle;
    }

    public HashMap<String, Boolean> getCheckList() {
        return checkList;
    }

    public void setCheckList(HashMap<String, Boolean> checkList) {
        this.checkList = checkList;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
}


