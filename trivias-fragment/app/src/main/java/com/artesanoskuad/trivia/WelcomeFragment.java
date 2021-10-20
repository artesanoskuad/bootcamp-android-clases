package com.artesanoskuad.trivia;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.artesanoskuad.trivia.databinding.FragmentWelcomeBinding;

public class WelcomeFragment extends Fragment {

    private FragmentWelcomeBinding binding;
    private TriviaFragment triviaFragment;

    public WelcomeFragment() {
        // Required empty public constructor
    }


    public static WelcomeFragment newInstance() {
        WelcomeFragment fragment = new WelcomeFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

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
            goToTriviaFragment();
        });
    }

    private void goToTriviaFragment() {
        //todo: acá validar que el edit text tenga un nombre de usuario.

        if (triviaFragment == null) {
            triviaFragment = TriviaFragment.newInstance();
        }

        FragmentManager fragmentManager = getParentFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.content, triviaFragment)
                .addToBackStack(null)
                .commit();

    }
}