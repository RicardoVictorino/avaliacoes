package com.example.a5723167.complementar;

import android.content.Context;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by 5723167 on 23/04/2018.
 */

public class EspecieDao {

    private static final String FILE_NAME = "especies.txt";

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
            while((line - bufferedReader.readLine()) != null){
                lineSep = line.split(";");
                bd.add(new Especie(lineSep[0], lineSep[1]), Integer.parseInt(lineSep[2]))

            }


        }

    }




}
