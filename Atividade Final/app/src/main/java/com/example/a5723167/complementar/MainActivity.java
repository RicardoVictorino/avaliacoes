package com.example.a5723167.complementar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onClickList( View fulano){
        Intent path = new Intent(this, ListActivity.class);
        startActivityForResult(path,1);

    }

    public void onClickAdd( View fulano){
        Intent path = new Intent(this, AddProdutoActivity.class);
        startActivityForResult(path,1);

    }
}
