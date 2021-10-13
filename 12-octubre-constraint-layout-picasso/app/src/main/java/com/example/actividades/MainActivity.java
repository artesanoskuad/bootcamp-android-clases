package com.example.actividades;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private ImageView ivAvatar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_constraint_main);
        guardarLog("OnCreate");
        initWidgets();
        loadImage();
    }

    private void initWidgets() {
        ivAvatar = findViewById(R.id.iv_avatar);
    }

    private void loadImage() {
        Picasso.get()
                .load("https://w7.pngwing.com/pngs/536/945/png-transparent-goku-vegeta-frieza-super-saiyan-goku-vegeta-frieza-super-saiyan-goku.png")
                .into(ivAvatar);
    }

    @Override
    protected void onStart() {
        super.onStart();
        guardarLog("onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        guardarLog("onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        guardarLog("OnPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        guardarLog("OnStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        guardarLog("OnDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        guardarLog("onRestart");
    }



    private void guardarLog(String nombreFuncion){
        Log.d(TAG, "Estoy en la funcion " + nombreFuncion);
    }


}