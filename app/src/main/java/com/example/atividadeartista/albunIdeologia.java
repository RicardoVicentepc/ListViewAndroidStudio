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

public class albunIdeologia extends AppCompatActivity {

     Button homeAlbuns;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_albun_ideologia);

        homeAlbuns = (Button) findViewById(R.id.homeAlbuns);
        ListView listView = (ListView) findViewById(R.id.lvAlbum1);

        List<String> list = new ArrayList<>();
        list.add("1 - Ideologia.");
        list.add("2 - Boas Novas.");
        list.add("3 - O Assasinato Da Flor. ");
        list.add("4 - A Orelha De Eurídice.");
        list.add("5 - Guerra Civil.");
        list.add("6 - Brasil.");
        list.add("7 - Um Trem Para As Estrelas.");
        list.add("8 - Vida Fácil.");
        list.add("9 - Blues Da Piedade.");
        list.add("10 - Obrigado.");
        list.add("11 - Minha Flor, Meu Bebê.");
        list.add("12 - Faz Parte Do Meu Show.");

        ArrayAdapter ADapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1,list);
        listView.setAdapter(ADapter);

        homeAlbuns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tela = new Intent(albunIdeologia.this, SomenteListView.class);
                startActivity(tela);
            }
        });



    }
}