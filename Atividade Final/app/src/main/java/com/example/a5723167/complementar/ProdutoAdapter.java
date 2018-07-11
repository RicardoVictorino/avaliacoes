package com.example.a5723167.complementar;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class ProdutoAdapter extends RecyclerView.Adapter {

    private ArrayList<Produto> listaProduto;

    public ProdutoAdapter(ArrayList<Produto> listaInicial){
        this.listaProduto = listaInicial;
    }



    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View elementoPrincipalXml = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_especie, parent, false);
        ProdutoHolder gaveta  = new ProdutoHolder(elementoPrincipalXml);
        return gaveta;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        ProdutoHolder gaveta = (ProdutoHolder) holder;
        Produto agora = this.listaProduto.get(position);
        gaveta.apresentaOProduto(agora);
    }

    @Override
    public int getItemCount() {
        return this.listaProduto.size();
    }
}
