package com.example.atividadeartista;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class SomenteListView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_somente_list_view);

        ListView lista = (ListView) findViewById(R.id.lv);

        ArrayList<Album> albuns = adicionarAlbuns();

        ArrayAdapter adapter = new AlbumAdapter(this, albuns);

        lista.setAdapter(adapter);

        adicionarAlbuns();

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int posicao, long l) {
                if( posicao == 0){
                    startActivity(new Intent(SomenteListView.this,albunIdeologia.class));
                }else if(posicao == 1) {
                    startActivity(new Intent(SomenteListView.this,albunExagerado.class));
                }else if(posicao == 2){
                    startActivity(new Intent(SomenteListView.this,albunTempoNaoPara.class));
                }else if(posicao == 3){
                    startActivity(new Intent(SomenteListView.this,albunSocForassois.class));
                }else if(posicao == 4){
                    startActivity(new Intent(SomenteListView.this,albunBurguesia.class));
                }
            }
        });
    }

    private ArrayList<Album> adicionarAlbuns(){

        ArrayList<Album> albuns = new ArrayList<Album>();

            Album a1 = new Album();
            a1.setNomeAlbum("Ideologia");
            a1.setImagem(R.drawable.img_2);
            albuns.add(a1);

            Album a2 = new Album();
            a2.setNomeAlbum("Exagerado");
            a2.setImagem(R.drawable.img_3);
            albuns.add(a2);

            Album a3 = new Album();
            a3.setNomeAlbum("O Tempo Não Para");
            a3.setImagem(R.drawable.img_1);
            albuns.add(a3);

            Album a4 = new Album();
            a4.setNomeAlbum("Só se For a Dois");
            a4.setImagem(R.drawable.img_4);
            albuns.add(a4);

            Album a5 = new Album();
            a5.setNomeAlbum("Maior Abandonado");
            a5.setImagem(R.drawable.img_5);
            albuns.add(a5);

        return albuns;
    }

}
