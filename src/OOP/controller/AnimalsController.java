package OOP.controller;

import OOP.model.Animal;
import OOP.view.AnimalView;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class AnimalsController implements TAnimals {



    private Animal model;
    private AnimalView view;

    public AnimalsController()
    {
        this.model = model;
        this.view = view;
    }

    Scanner sc = new Scanner(System.in);

    FileReader reader;


    public void skaitykInfo() {

    }
    {
        try {
            reader = new FileReader("gyvunai.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        try {
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void setAnimalTipas(String tipas)
    {

        model.setTipas(tipas);
    }

    public String getAnimalTipas()
    {

        return model.getTipas();

        }

        public void setAnimalSeima(String seima) {

        model.setSeima(seima);
    }

    public String getAnimalSeima()
    {

        return model.getSeima();
    }

        public void setAnimalVardas(String vardas)
    {

        model.setVardas(vardas);
    }

    public String getAnimalVardas()
    {

        return model.getVardas();
    }

    public void setAnimalSvoris(float svoris)
    {

        model.setSvoris(svoris);
    }

    public float getAnimalSvoris()
    {

        return model.getSvoris();
    }

    public void setAnimalUgis(float ugis)
    {

        model.setUgis(ugis);
    }

    public float getAnimalUgis()
    {

        return model.getUgis();
    }
    public void setAnimalJudejimas(String judejimas)
    {

        model.setJudejimas(judejimas);
    }

    public String getAnimalJudejimas()
    {

        return model.getJudejimas();
    }

}
