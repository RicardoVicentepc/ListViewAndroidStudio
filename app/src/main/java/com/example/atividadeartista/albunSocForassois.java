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

public class albunSocForassois extends AppCompatActivity {

        Button homeAlbuns4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_albun_soc_forassois);
        homeAlbuns4 = (Button) findViewById(R.id.homeAlbuns4);

        ListView listView = (ListView) findViewById(R.id.lvAlbum4);

        List<String> list = new ArrayList<>();
        list.add("1 - Só Se For a 2.");
        list.add("2 - Ritual.");
        list.add("3 - O Nosso Amor A Gente Inventa.");
        list.add("4 - Culpa Da Estimação.");
        list.add("5 - Solidão Que Nada.");
        list.add("6 - Completamente Blue.");
        list.add("7 - Vai À Luta.");
        list.add("8 - Quarta-Feira.");
        list.add("9 - Heavy Love.");
        list.add("10 - O Lobo Mau Da Ucrânia.");
        list.add("11 - Balada Da Esplanada.");

        ArrayAdapter ADapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1,list);
        listView.setAdapter(ADapter);

        homeAlbuns4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tela = new Intent(albunSocForassois.this, SomenteListView.class);
                startActivity(tela);
            }
        });
    }
}