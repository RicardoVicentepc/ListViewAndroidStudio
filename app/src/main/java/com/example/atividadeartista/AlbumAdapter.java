package com.example.atividadeartista;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AlbumAdapter extends ArrayAdapter<Album> {

    private Context context;
    private final ArrayList<Album> elementos;
    public AlbumAdapter(Context context,  ArrayList<Album> elementos) {
        super(context, R.layout.activity_albunss,elementos);

        this.context = context;
        this.elementos = elementos;
    }
    public View getView(int position, View convertView, ViewGroup parent){
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(R.layout.activity_albunss, parent, false);

        TextView nomeAlbum = (TextView) rowView.findViewById(R.id.nomeAlbum);
        ImageView imagem = (ImageView) rowView.findViewById(R.id.imagem);

        nomeAlbum.setText(elementos.get(position).getNomeAlbum());
        imagem.setImageResource(elementos.get(position).getImagem());

        return rowView;
    }
}
