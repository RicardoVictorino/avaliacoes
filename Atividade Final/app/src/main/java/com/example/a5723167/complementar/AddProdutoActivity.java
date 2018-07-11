package com.example.a5723167.complementar;

        import android.app.Activity;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.EditText;
        import android.widget.RadioButton;
        import android.widget.RadioGroup;

        import java.io.Console;

public class AddProdutoActivity extends AppCompatActivity {
    private  RadioGroup radioGroup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_epecie);
    }

    public void onClickSalvar(View v) {
        EditText descricao = findViewById(R.id.etDescricao);

        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);



        Produto produto = new Produto(descricao.getText().toString());


        ProdutoDao.salvar(this, produto);

        setResult(Activity.RESULT_OK);
        finish();
    }
}
