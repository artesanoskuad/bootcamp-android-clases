package com.artesanoskuad.checklist.presenter;

import com.artesanoskuad.checklist.model.Inspeccion;
import com.artesanoskuad.checklist.model.InspeccionInteractor;
import com.artesanoskuad.checklist.view.ListadoDeInspeccionesView;

import java.util.List;

public class ListadoDeInspeccionesPresenterImpl implements ListadoDeInspeccionesPresenter {

    private ListadoDeInspeccionesView view;
    private InspeccionInteractor interactor;

    public ListadoDeInspeccionesPresenterImpl(ListadoDeInspeccionesView view, InspeccionInteractor interactor) {
        this.view = view;
        this.interactor = interactor;
    }

    @Override
    public void obtenerInspecciones() {
        try {
            List<Inspeccion> inspeccions = interactor.obtenerInspecciones();
            if(inspeccions.isEmpty()){
                view.mostrarListaVacia();
            } else {
                view.mostrarInspecciones(inspeccions);
            }
        } catch(Exception e) {
            view.mostrarMensajeDeError(e.getMessage());
        }
    }
}
