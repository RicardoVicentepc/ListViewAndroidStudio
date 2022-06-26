package com.example.atividadeartista;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button btnParaAlbun;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnParaAlbun = (Button) findViewById(R.id.btnParaAlbuns);
        btnParaAlbun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tela = new Intent(MainActivity.this, biografiaCazuza.class);

                startActivity(tela);

            }
        });
    }
    }