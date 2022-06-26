package com.example.atividadeartista;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class albunTempoNaoPara extends AppCompatActivity {

        Button homeAlbuns3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_albun_tempo_nao_para);
        homeAlbuns3 = (Button) findViewById(R.id.homeAlbuns3);

        ListView listView = (ListView) findViewById(R.id.lvAlbum3);

        List<String> list = new ArrayList<>();
        list.add("1 - Vida Louca Vida.");
        list.add("2 - Boas Novas.");
        list.add("3 - Ideologia.");
        list.add("4 - Todo Amor Que Houver Nessa Vida.");
        list.add("5 - Codinome Beija-Flor.");
        list.add("6 - O Tempo Não Para.");
        list.add("7 - Só As Mães São Felizes.");
        list.add("8 - O Nosso Amor A Gente Inventa.");
        list.add("9 - Exagerado.");
        list.add("10 - Faz Parte Do Meu Show.");

        ArrayAdapter ADapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1,list);
        listView.setAdapter(ADapter);

        homeAlbuns3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tela = new Intent(albunTempoNaoPara.this, SomenteListView.class);
                startActivity(tela);
            }
        });
    }
}