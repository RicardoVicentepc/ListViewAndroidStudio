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

public class albunBurguesia extends AppCompatActivity {

        Button homeAlbuns5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_albun_burguesia);
        homeAlbuns5 = (Button) findViewById(R.id.homeAlbuns5);

        ListView listView = (ListView) findViewById(R.id.lvAlbum5);

        List<String> list = new ArrayList<>();
        list.add("1 - Maior Abandonado.");
        list.add("2 - Baby Suporte.");
        list.add("3 - Sem Vergonha.");
        list.add("4 - Você Se Parece Com Todo Mundo.");
        list.add("5 - Milagres.");
        list.add("6 - Não amo ninguém.");
        list.add("7 - Por Que a Gente é Assim?");
        list.add("8 - Narciso.");
        list.add("9 - Nós.");
        list.add("10 - Dolorosa.");
        list.add("11 - Bate Balanço.");

        ArrayAdapter ADapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1,list);
        listView.setAdapter(ADapter);

        homeAlbuns5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tela = new Intent(albunBurguesia.this, SomenteListView.class);
                startActivity(tela);
            }
        });
    }
}