package exercicios;

import java.util.Scanner;
import modelo.Animals;

public class Exercicios {

    static String[] racasCachorro = {"Bulldog", "Poddle", "Pincher", "Pastor Alemão", "Pug", "Golden Retrivier", "Vira-lata"};
    static String[] racasGato = {"Siamês", "Persa", "Himalaia", "Angorá", "Maine Coon"};
    static String especie;

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Animals animal = new Animals();

        System.out.println("Informe a raça do animal: ");
        animal.setRaca(scan.nextLine());
        System.out.println("Informe o peso do animal: ");
        animal.setPeso(scan.nextInt());
        System.out.println("Informe a altura do animal: ");
        animal.setAltura(scan.nextInt());

        if (animal.getPeso() < 5 && animal.getAltura() <= 30) {
            especie = "Provavelmente é um gato";
        } else {
            especie = "Provavelmete é um cachorro";
        }

        for (String raca : racasCachorro) {
            if (animal.getRaca().equalsIgnoreCase(raca)) {
                especie = "O animal é um cachorro";
                break;
            } else {

            }
        }

        for (String raca : racasGato) {
            if (animal.getRaca().equalsIgnoreCase(raca)) {
                especie = "O animal é um gato";
                break;
            }
        }

        System.out.println(especie);
        System.out.println(animal.toString());
    }

}
