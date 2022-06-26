package com.example.atividadeartista;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class biografiaCazuza extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biografia_cazuza);
        Button btnParaTodosAlbuns;

        btnParaTodosAlbuns = (Button) findViewById(R.id.btnParaTodosAlbuns);

        btnParaTodosAlbuns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tela = new Intent(biografiaCazuza.this, SomenteListView.class);

                startActivity(tela);
            }
        });
    }
}