package com.artesanoskuad.fragmentnavigation;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

public class TriviaFragment extends Fragment {

    public static final String NAME_KEY_PARAM = "nombre";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        obtainNameParam();
        return inflater.inflate(R.layout.fragment_trivia, container, false);
    }

    private void obtainNameParam() {
        String name = getArguments().getString(NAME_KEY_PARAM);
        Toast.makeText(getContext(), name, Toast.LENGTH_SHORT).show();
    }

}
