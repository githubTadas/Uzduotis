package OOP.view;

import OOP.controller.TAnimals;
import OOP.model.Animal;
import OOP.model.Animals;
import OOP.model.Duomenys;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class AnimalView extends Animal {

    private TAnimals duomenys =null;
    private TAnimals animals;

    private void showMenu() {
        System.out.println("0 - baigti darba");
        System.out.println("1 - parodyti gyvunus");
        System.out.println("2 - pasirinkite kurio gyvuno informacija parodyti");
        System.out.println("3 - pasirinkto gyvuno judejimas");
        System.out.println("4 - pakeiskite gyvuno judejima");

    }


    public void setAnimals(TAnimals animals) {
        this.animals = animals;
    }


    public void dirbam() {

        Scanner sc = new Scanner(System.in);

        FileReader reader = null;
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
        boolean arTesti = true;
        do {
            showMenu();
            int pasirinkimas = sc.nextInt();
            switch (pasirinkimas) {
                case 0:
                    arTesti = false;
                    break;
                case 1:
                    for (Animal gyvunas : Duomenys.getInstance().getArrayList())
                        System.out.println("Gyvunas: ");
                    System.out.println("Gyvuno tipas: " + getTipas());
                    System.out.println("Gyvuno seima: " + getSeima());
                    System.out.println("Gyvuno vardas: " + getVardas());
                    System.out.println("Gyvuno svoris: " + getSvoris());
                    System.out.println("Gyvuno ugis: " + getUgis());
                    System.out.println("Gyvuno judejimas: " + getJudejimas());
                    break;
                case 2:
                    sc.nextLine();
                    System.out.println("Gyvuno judejimas: " + getJudejimas());
                    break;
                case 3:
                    sc.nextLine();
                    System.out.println("Gyvuno judejimas: " + getJudejimas());
                    break;
                case 4:
                    System.out.println("Pakeiskite gyvuno judejima: " +getJudejimas());
                    String judejimas = sc.nextLine();
                    System.out.println(judejimas);
                    break;

            }

        } while (arTesti);


    }




    public void buildAnimal(String tipas, String seima, String vardas, Float svoris, Float ugis, String judejimas) {
        System.out.println("Gyvunas: ");
        System.out.println("Gyvuno tipas: " + tipas);
        System.out.println("Gyvuno seima: " + seima);
        System.out.println("Gyvuno vardas: " + vardas);
        System.out.println("Gyvuno svoris: " + svoris);
        System.out.println("Gyvuno ugis: " + ugis);
        System.out.println("Gyvuno judejimas: " + judejimas);
    }

    @Override
    public void buildAnimal() {
        super.buildAnimal();
    }
}

