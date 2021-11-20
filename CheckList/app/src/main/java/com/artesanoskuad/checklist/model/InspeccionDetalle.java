package com.artesanoskuad.checklist.model;

public class InspeccionDetalle{
    private String marca;
    private String modelo;
    private String fecha;

    public InspeccionDetalle(String marca, String modelo, String fecha) {
        this.marca = marca;
        this.modelo = modelo;
        this.fecha = fecha;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}