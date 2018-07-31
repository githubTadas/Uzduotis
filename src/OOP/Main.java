package OOP;

import OOP.controller.AnimalsController;
import OOP.controller.TAnimals;
import OOP.model.Animal;
import OOP.view.AnimalView;

public class Main {

    public static void main(String[] args) {

       TAnimals animals = new AnimalsController();

        AnimalView obj = new AnimalView();

        obj.setAnimals(animals);
        obj.dirbam();


    }
    }





