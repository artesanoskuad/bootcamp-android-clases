package com.artesanoskuad.trivia;

import static com.artesanoskuad.trivia.WelcomeFragmentDirections.*;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.Navigation;

import com.artesanoskuad.trivia.databinding.FragmentWelcomeBinding;

public class WelcomeFragment extends Fragment {

    private static final String EMPTY_USER_ERROR = "Ingrese nombre";
    private FragmentWelcomeBinding binding;

    public WelcomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        initBinding(inflater, container);
        setupOnClickListener();
        return binding.getRoot();
    }

    private void initBinding(LayoutInflater inflater, ViewGroup container) {
        binding = FragmentWelcomeBinding.inflate(inflater, container, false);
    }

    private void setupOnClickListener() {
        binding.btnComenzar.setOnClickListener(v -> {
            if(binding.etNombre.getText().toString().isEmpty()){
                showEmptyUserMessage();
            } else {
                goToTriviaFragment();
            }
        });
    }

    private void showEmptyUserMessage() {
        Toast.makeText(getContext(), EMPTY_USER_ERROR, Toast.LENGTH_SHORT).show();
        binding.etNombre.setError(EMPTY_USER_ERROR);
        binding.etNombre.requestFocus();
    }

    private void goToTriviaFragment() {
        String nombre = binding.etNombre.getText().toString();
        //ActionWelcomeFragmentToTriviaFragment action = actionWelcomeFragmentToTriviaFragment(nombre);
        //Navigation.findNavController(binding.getRoot()).navigate(action);
        Bundle bundle = new Bundle();
        bundle.putString("name", nombre);
        Navigation.findNavController(binding.getRoot()).navigate(R.id.action_welcomeFragment_to_triviaFragment, bundle);
    }

}