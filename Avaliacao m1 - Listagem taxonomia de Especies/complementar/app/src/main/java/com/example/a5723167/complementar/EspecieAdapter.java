package com.example.a5723167.complementar;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class EspecieAdapter extends RecyclerView.Adapter {

    private ArrayList<Especie> listaEspecie;

    public  EspecieAdapter(ArrayList<Especie> listaInicial){
        this.listaEspecie = listaInicial;
    }



    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View elementoPrincipalXml = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_especie, parent, false);
        EspecieHolder gaveta  = new EspecieHolder(elementoPrincipalXml);
        return gaveta;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        EspecieHolder gaveta = (EspecieHolder) holder;
        Especie agora = this.listaEspecie.get(position);
        gaveta.apresentaAEspecie(agora);
    }

    @Override
    public int getItemCount() {
        return this.listaEspecie.size();
    }
}
