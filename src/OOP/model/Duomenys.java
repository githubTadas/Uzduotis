package OOP.model;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Scanner;

public class Duomenys {


    private static Duomenys obj = null;


    public static Duomenys getInstance() {
        if (obj == null) {
            obj = new Duomenys();
        }
        return obj;
    }

    private ArrayList<Animal> arrayList;

    private Duomenys() {

        arrayList = new ArrayList<>();
        readData();
    }

    public void readData() {



        FileReader reader = null;


        try {
            reader = new FileReader("gyvunai.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
Scanner sc = new Scanner(reader);

        while (sc.hasNext()) {
            String tipas = sc.next();
            String seima = sc.next();
            String vardas = sc.next();
            float svoris = sc.nextFloat();
            float ugis = sc.nextFloat();
            String judejimas = sc.next();
            arrayList.add(buildAnimal(tipas, seima, vardas, svoris, ugis, judejimas));
        }

        try {
            reader.close();
            sc.close();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    private Animal buildAnimal(String tipas, String seima, String vardas, float svoris, float ugis, String judejimas) {



        switch (tipas.toLowerCase()) {
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


}

