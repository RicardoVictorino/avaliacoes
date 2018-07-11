package com.example.a5723167.complementar;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

public class ListActivity extends AppCompatActivity {
    private final int ADICIONAR_PRODUTO = 1;
    private ProdutoAdapter adaptador;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        RecyclerView rvLista = findViewById(R.id.rvLista);
        adaptador = new ProdutoAdapter(ProdutoDao.getList(this));

        rvLista.setAdapter(adaptador);

        rvLista.addItemDecoration(new DividerItemDecoration(this, RecyclerView.VERTICAL));

        rvLista.setLayoutManager(new LinearLayoutManager(this));
    }


    public void onClickAdd(View v){
        Intent abrirNovaTela = new Intent(this, AddProdutoActivity.class);
        startActivityForResult(abrirNovaTela, ADICIONAR_PRODUTO);
    }



    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == ADICIONAR_PRODUTO){
            if (resultCode == Activity.RESULT_OK){
                adaptador.notifyDataSetChanged();
            }
        }

    }


}
