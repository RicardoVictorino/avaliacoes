package com.example.a5723167.complementar;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class EspecieHolder extends RecyclerView.ViewHolder{
//    private TextView tvReino;
//    private TextView tvFilo;
//    private TextView tvClasse;
//    private TextView tvOrdem;
//    private TextView tvFamilia;
//    private TextView tvSubFamilia;
//    private TextView tvGenero;
    private TextView tvEspecie;
//    private ImageView ivImg;

    public EspecieHolder(View itemView) {
        super(itemView);

//        tvClasse = itemView.findViewById(R.id.tvClasse);
//        tvReino = itemView.findViewById(R.id.tvReino);
//        tvFilo = itemView.findViewById(R.id.tvFilo);
//        tvOrdem = itemView.findViewById(R.id.tvReino);
//        tvFamilia = itemView.findViewById(R.id.tvReino);
//        tvSubFamilia = itemView.findViewById(R.id.tvReino);
//        tvGenero = itemView.findViewById(R.id.tvReino);
        tvEspecie = itemView.findViewById(R.id.tvEspecie);
        //ivImg = itemView.findViewById(R.id.tvReino);

    }
    public void apresentaAEspecie(Especie agora){
//        tvSubFamilia.setText(agora.getSubfamilia());
//        tvFamilia.setText(agora.getFamilia());
//        tvOrdem.setText(agora.getOrdem());
//        tvFilo.setText(agora.getFilo());
//        tvReino.setText(agora.getReino());
//        tvClasse.setText(agora.getClasse());
//        tvGenero.setText(agora.getGenero());
        tvEspecie.setText(agora.getEspecie());


    }


}
