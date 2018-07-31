package OOP.model;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Scanner;

public class Duomenys {



    Scanner sc = new Scanner(System.in);


    FileReader reader;

    {
        try {
            reader = new FileReader("gyvunai.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static Duomenys obj = null;



    public static Duomenys getInstance() {
        if(obj == null){
            obj= new Duomenys();
        }
        return obj;
    }
    private ArrayList<Animal> arrayList;

    private Duomenys(){

        arrayList = new ArrayList<>();
    }

    public void readData(){
        while (sc.hasNext()) {
            String tipas = sc.nextLine();
            String seima = sc.nextLine();
            String vardas = sc.nextLine();
            float svoris = sc.nextFloat();
            float ugis = sc.nextFloat();
            String judejimas = sc.nextLine();

        }

        try {
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    private Animal buildAnimal(String tipas, String seima, String vardas, float svoris, float ugis, String judejimas){


        tipas = null;
        switch (tipas) {
            case "suo":
                return new Suo(tipas, seima, svoris, vardas, ugis, judejimas);
            case "kate":
                return new Cat(tipas, seima, svoris, vardas, ugis, judejimas);
            case "spider":
                return new Spider(tipas, seima, svoris, vardas, ugis, judejimas);

        }
        return null;

    }


    public ArrayList<Animal> getArrayList() {
        return arrayList;


    }
    // switch

     Scanner close;



}

