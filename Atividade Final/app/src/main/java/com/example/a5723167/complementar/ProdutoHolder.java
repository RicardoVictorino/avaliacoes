package com.example.a5723167.complementar;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ProdutoHolder extends RecyclerView.ViewHolder{
    private TextView tvDescricao;
    private TextView tvCategoria;


    public ProdutoHolder(View itemView) {
        super(itemView);
        tvDescricao = itemView.findViewById(R.id.tvDescricao);
        tvCategoria = itemView.findViewById(R.id.tvCategoria);


    }
    public void apresentaOProduto(Produto agora){
        tvDescricao.setText(agora.getDescricao());
        tvCategoria.setText(agora.getCategoria());



    }



}
