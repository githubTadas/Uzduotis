package OOP;

import OOP.controller.AnimalsController;
import OOP.controller.TAnimals;
import OOP.model.Animal;
import OOP.model.Duomenys;
import OOP.view.AnimalView;

public class Main {

    public static void main(String[] args) {
        Duomenys.getInstance();
       TAnimals animals = new AnimalsController();

        AnimalView obj = new AnimalView();

        obj.setAnimals(animals);
        obj.dirbam();


//        komentaras specialiai del naujo brancho
    }
    }





