package com.artesanoskuad.trivia;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.artesanoskuad.trivia.databinding.FragmentTriviaBinding;

public class TriviaFragment extends Fragment {

    private FragmentTriviaBinding binding;

    public TriviaFragment() {
        // Required empty public constructor
    }

    public static TriviaFragment newInstance() {
        TriviaFragment fragment = new TriviaFragment();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        initBinding(inflater, container);

        return binding.getRoot();
    }

    private void initBinding(LayoutInflater inflater, ViewGroup container) {
        binding = FragmentTriviaBinding.inflate(inflater, container, false);
    }
}