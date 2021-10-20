package com.artesanoskuad.trivia;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.artesanoskuad.trivia.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private WelcomeFragment welcomeFragment;
    private TriviaFragment triviaFragment;
    private WinnerFragment winnerFragment;

    private ActivityMainBinding binding;

    private boolean isInitActivity = true;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initBinding();
        loadWelcomeFragment();
        setContentView(binding.getRoot());
    }

    private void initBinding() {
        binding = ActivityMainBinding.inflate(getLayoutInflater());
    }

    private void loadWelcomeFragment() {
        if(welcomeFragment == null){
            welcomeFragment = WelcomeFragment.newInstance();
        }

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.content, welcomeFragment)
                .addToBackStack(null)
                .commit();
    }






}