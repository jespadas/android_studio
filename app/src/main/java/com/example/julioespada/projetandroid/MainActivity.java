package com.example.julioespada.projetandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    private Button btValider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btValider = findViewById(R.id.btValider);
        btValider.setText("Mon Text");

    }
}
