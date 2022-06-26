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

public class albunExagerado extends AppCompatActivity {

        Button homeAlbuns2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_albun_exagerado);
        homeAlbuns2 = (Button) findViewById(R.id.homeAlbuns2);

        ListView listView = (ListView) findViewById(R.id.lvAlbum2);

        List<String> list = new ArrayList<>();
        list.add("1 - Exagerado.");
        list.add("2 - Medieval.");
        list.add("3 - Cúmplice.");
        list.add("4 - Mal Nenhum.");
        list.add("5 - Balada De Um Vagabundo.");
        list.add("6 - Codinome Beija-Flor.");
        list.add("7 - Desastre Mental.");
        list.add("8 - Boa Vida.");
        list.add("9 - Só As Mães São Felizes.");
        list.add("10 - Rock Da Descerebração.");

        ArrayAdapter ADapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1,list);
        listView.setAdapter(ADapter);

        homeAlbuns2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tela = new Intent(albunExagerado.this, SomenteListView.class);
                startActivity(tela);
            }
        });
    }
}