package exercicios;

import java.util.Scanner;
import modelo.Modelo;

public class Exercicios {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int qtdeNumeros = 0;
        Modelo modelo = new Modelo();

        System.out.print("Quantos números serão sorteados? ");
        qtdeNumeros = scan.nextInt();

        modelo.printNumeros(modelo.sorteio(qtdeNumeros));

        scan.close();
    }

}
