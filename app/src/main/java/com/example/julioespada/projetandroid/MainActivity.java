package com.example.julioespada.projetandroid;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "toto";

    // Déclarer les composants
    private Button btValider, btAnnuler;
    private RadioButton rbPasAimer;
    private RadioButton rbAimer;
    private Button mBtNext;
    private ImageView iv;
    private EditText et;
    private RadioGroup rg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Charger la view
        setContentView(R.layout.activity_main);
        // Je recupére les instances
        btValider = findViewById(R.id.btValider);
        btAnnuler = findViewById(R.id.btAnnuler);
        rbPasAimer = findViewById(R.id.rbPasAimer);
        rbAimer = findViewById(R.id.rbAimer);
        iv = findViewById(R.id.iv);
        et = findViewById(R.id.et);
        rg = findViewById(R.id.rg);

        // Changer le texte
        btValider.setOnClickListener(this);
        btAnnuler.setOnClickListener(this);
    }


    /*
    // Callback Click
    */
    @Override
    public void onClick(View v) {
        //Identifier la vue cliquÃ©e
        if (v == btValider) {
            if (rbAimer.isChecked()) {
                et.setText(rbAimer.getText());
            } else if (rbPasAimer.isChecked()) {
                et.setText(rbPasAimer.getText());
            }

            iv.setImageResource(R.mipmap.ic_done);
            iv.setColorFilter(Color.CYAN);
        } else if (v.getId() == btAnnuler.getId()) {
            rg.clearCheck();
            et.setText("");
            iv.setImageResource(R.mipmap.ic_delete);
            iv.setColorFilter(getResources().getColor(R.color.maCouleur, getTheme()));
        }
    }


    public void onBtNextClick(View view) {
        Intent intent = (new Intent(this, SecondActivity.class));
        intent.putExtra("maCle", "Toto");
        startActivity(intent);
    }


}
