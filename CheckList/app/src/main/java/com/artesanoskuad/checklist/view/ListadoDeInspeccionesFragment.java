package com.artesanoskuad.checklist.view;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.artesanoskuad.checklist.R;
import com.artesanoskuad.checklist.databinding.FragmentListadoInspeccionesBinding;
import com.artesanoskuad.checklist.model.Inspeccion;
import com.artesanoskuad.checklist.model.InspeccionInteractor;
import com.artesanoskuad.checklist.model.InspeccionRepository;
import com.artesanoskuad.checklist.model.LocalInspeccionRepository;
import com.artesanoskuad.checklist.presenter.ListadoDeInspeccionesPresenter;
import com.artesanoskuad.checklist.presenter.ListadoDeInspeccionesPresenterImpl;

import java.util.List;

public class ListadoDeInspeccionesFragment extends Fragment implements ListadoDeInspeccionesView {

    private FragmentListadoInspeccionesBinding binding;
    private InspeccionRepository repository;
    private ListadoDeInspeccionesPresenter presenter;
    private InspeccionInteractor interactor;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentListadoInspeccionesBinding.inflate(inflater, container, false);
        repository = new LocalInspeccionRepository();
        interactor = new InspeccionInteractor(repository);
        presenter = new ListadoDeInspeccionesPresenterImpl(this, interactor);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.btnAgregarInspeccion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(ListadoDeInspeccionesFragment.this)
                        .navigate(R.id.action_listadoDeInspeccionesFragment_to_agregarInspeccionFragment);
            }
        });

        presenter.obtenerInspecciones();
    }

    @Override
    public void mostrarInspecciones(List<Inspeccion> inspeccions) {
        Toast.makeText(getContext(), "Total Inspecciones " + inspeccions.size(), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void mostrarListaVacia() {
        Toast.makeText(getContext(), "Lista vacia", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void mostrarMensajeDeError(String mensaje) {
        Toast.makeText(getContext(), mensaje, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}