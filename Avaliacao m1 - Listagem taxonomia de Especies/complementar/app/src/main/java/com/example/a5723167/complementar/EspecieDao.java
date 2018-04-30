package com.example.a5723167.complementar;

import android.content.Context;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by 5723167 on 23/04/2018.
 */

public class EspecieDao {

    private static final String FILE_NAME = "especies1.txt";

    private static ArrayList<Especie> bd;

    public  static ArrayList<Especie> getList(Context c){

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
                bd.add(new Especie(lineSep[0],lineSep[1],lineSep[2],lineSep[3],lineSep[4],lineSep[5],lineSep[6]));
                //bd.add(new Especie(lineSep[0]));
            }

        } catch (Exception e){
            e.printStackTrace();
        }
        return bd;
    }

    public static void salvar(Context c, Especie e){
        bd.add(e);
        FileOutputStream outputStream;
        try {
            outputStream = c.openFileOutput(FILE_NAME, Context.MODE_APPEND);
            String line = e.getReino() + ";" + e.getFilo() + ";" + e.getClasse() + ";" + e.getOrdem() + ";" + e.getFamilia() + ";" + e.getGenero() + ";" + e.getEspecie();
            //String line = e.getEspecie() + ";";
            outputStream.write( (line + System.getProperty("line.separator")).getBytes());
            outputStream.close();
        } catch (Exception t) {
            t.printStackTrace();
        }

    }


}
