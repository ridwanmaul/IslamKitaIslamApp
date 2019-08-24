package com.ridwanmaulana.islamkitaislam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnSalat;
    private Button btnHalal;
    private Button btnDoa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSalat =(Button)findViewById(R.id.btn_salat);
        btnHalal = (Button)findViewById(R.id.halal);
        btnDoa = (Button)findViewById(R.id.btn_doa);

        btnSalat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ridwan = new Intent(MainActivity.this, MainSalat.class);
                startActivity(ridwan);
            }

        });

        btnHalal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ridwan = new Intent(MainActivity.this, MainHalal.class);
                startActivity(ridwan);
            }
        });

        btnDoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ridwan = new Intent(MainActivity.this, MainDoa.class);
                startActivity(ridwan);
            }
        });
    }
}