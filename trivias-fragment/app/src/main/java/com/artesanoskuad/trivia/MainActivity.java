package com.artesanoskuad.trivia;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.artesanoskuad.trivia.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initBinding();
        setContentView(binding.getRoot());
    }

    private void initBinding() {
        binding = ActivityMainBinding.inflate(getLayoutInflater());
    }

}