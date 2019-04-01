package com.example.julioespada.projetandroid;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    private Button bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        bt = findViewById(R.id.bt);

        String s = getIntent().getStringExtra("maCle");
        bt.setText(s);
    }
}
