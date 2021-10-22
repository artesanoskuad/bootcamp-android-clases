package com.artesanoskuad.fragmentnavigation;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import com.artesanoskuad.fragmentnavigation.databinding.FragmentWelcomeBinding;


public class WelcomeFragment extends Fragment {

    private FragmentWelcomeBinding binding;

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
        binding.btnStart.setOnClickListener(view -> {
            goToTriviaFragment();
        });
    }

    private void goToTriviaFragment() {
        Navigation.findNavController(binding.getRoot())
                .navigate(R.id.action_welcomeFragment_to_triviaFragment, getNameForTriviaParam());
    }

    private Bundle getNameForTriviaParam() {
        Bundle bundle = new Bundle();
        String name = binding.etName.getText().toString();
        bundle.putString(TriviaFragment.NAME_KEY_PARAM, name);
        return bundle;
    }
}
