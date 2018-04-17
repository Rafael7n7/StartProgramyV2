package com.example.brbara.playcidade;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class LoginPlay extends AppCompatActivity {

    public Spinner spnCidades;
    public List<String> lCidades = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        spnCidades = (Spinner) findViewById(R.id.spinner);
        lCidades.add("Juazeiro Do norte - Ceará");
        lCidades.add("Tabuleiro do norte - Ceará");
        lCidades.add("Limoeiro do norte - Ceará");
        lCidades.add("Tauá - Ceará");

        ArrayAdapter<String> dataAdapterCidades = new ArrayAdapter<String>(LoginPlay.this, R.layout.custom_spinner_selected, lCidades);
        dataAdapterCidades.setDropDownViewResource(R.layout.custom_spinner_item);
        spnCidades.setAdapter(dataAdapterCidades);

        Button btPlay = (Button) findViewById(R.id.button);
        btPlay.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(LoginPlay.this, Opening1.class);
                startActivity(it);
            }
        });

    }
}
