package OOP.view;

import OOP.controller.TAnimals;
import OOP.model.Animal;
import OOP.model.Duomenys;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class AnimalView {

    private TAnimals duomenys =null;
    private TAnimals animals;

    private void showMenu() {
        System.out.println("0 - baigti darba");
        System.out.println("1 - parodyti gyvunus");
        System.out.println("2 - pasirinkite kurio gyvuno informacija parodyti");

        System.out.println("3 - pakeiskite gyvuno judejima");

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
                    for (Animal gyvunas : Duomenys.getInstance().getArrayList()) {
                        System.out.println("Gyvunas: ");
                        System.out.println("Gyvuno tipas: " + gyvunas.getTipas());
                        System.out.println("Gyvuno seima: " + gyvunas.getSeima());
                        System.out.println("Gyvuno vardas: " + gyvunas.getVardas());
                        System.out.println("Gyvuno svoris: " + gyvunas.getSvoris());
                        System.out.println("Gyvuno ugis: " + gyvunas.getUgis());
                        System.out.println("Gyvuno judejimas: " + gyvunas.getJudejimas());
                    }
                    break;
                case 2:
                    System.out.println("Iveskite gyvuno numeri nuo 0 iki "+Duomenys.getInstance().getArrayList().size());
                    int i =sc.nextInt();
                    System.out.println(Duomenys.getInstance().getArrayList().get(i));
                    break;

                case 3:
                    System.out.println("Iveskite gyvuno numeri nuo 0 iki "+Duomenys.getInstance().getArrayList().size());
                    i =sc.nextInt();
                    System.out.println("Iveskite nauja gyvuno judejima");
                    String judejimas = sc.next();
                    Duomenys.getInstance().getArrayList().get(i).setJudejimas(judejimas);

                    break;

            }

        } while (arTesti);


    }


}

