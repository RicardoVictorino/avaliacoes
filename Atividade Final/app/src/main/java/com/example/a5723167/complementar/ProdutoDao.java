package com.example.a5723167.complementar;

import android.content.Context;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;



public class ProdutoDao {

    private static final String FILE_NAME = "Produtos1.txt";

    private static ArrayList<Produto> bd;

    public  static ArrayList<Produto> getList(Context c){

        bd = new ArrayList<>();
        FileInputStream inputStream;

        try{
            inputStream = c.openFileInput(FILE_NAME);
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String line;
            String[] lineSep;
            while((line = bufferedReader.readLine()) != null){
                lineSep = line.split(";");
                bd.add(new Produto(lineSep[0],lineSep[1]));

            }

        } catch (Exception e){
            e.printStackTrace();
        }
        return bd;
    }

    public static void salvar(Context c, Produto e){
        bd.add(e);
        FileOutputStream outputStream;
        try {
            outputStream = c.openFileOutput(FILE_NAME, Context.MODE_APPEND);
            String line = e.getDescricao() + ";" + e.getCategoria() + ";";
            //String line = e.getProduto() + ";";
            outputStream.write( (line + System.getProperty("line.separator")).getBytes());
            outputStream.close();
        } catch (Exception t) {
            t.printStackTrace();
        }

    }


}
