package com.example.a5723167.complementar;

        import android.app.Activity;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.EditText;

public class AddEpecieActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_epecie);
    }

    public void onClickSalvar(View v) {
        EditText etReino = findViewById(R.id.etReino);
        EditText etFilo = findViewById(R.id.tvFilo);
        EditText etClasse = findViewById(R.id.etClasse);
        EditText etOrdem = findViewById(R.id.etOrdem);
        EditText etFamilia = findViewById(R.id.etFamilia);
        EditText etGenero = findViewById(R.id.etGenero);
        EditText etEspecie = findViewById(R.id.etEspecie);


        Especie especie = new Especie(etReino.getText().toString(),etFilo.getText().toString(), etClasse.getText().toString(),etOrdem.getText().toString(),etFamilia.getText().toString(),etGenero.getText().toString(),etEspecie.getText().toString());
        //Especie especie = new Especie(etEspecie.getText().toString());

        EspecieDao.salvar(this, especie);

        setResult(Activity.RESULT_OK);
        finish();
    }
}
