package com.example.moakeno;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity11 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main11);
        getSupportActionBar().hide();
    }


    public void finalizar(View h) {

        Intent i = new Intent(this, MainActivity12.class);
        startActivity(i);
    }
}