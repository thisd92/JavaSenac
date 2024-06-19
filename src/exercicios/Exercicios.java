package exercicios;

import java.util.Scanner;

public class Exercicios {

    public static int dobro(int number) {
        return number * 2;
    }

    public static int quadrado(int number) {
        return number * number;
    }

    public static void proximos(int number) {
        System.out.println("Número anterior a " + number + " é " + (number - 1) + " e o posterior é " + (number + 1));
    }

    public static void main(String[] args) {

        int num1, num2, num3;
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o primeiro número");
        num1 = scan.nextInt();
        System.out.println("Informe o segundo número");
        num2 = scan.nextInt();
        System.out.println("Informe o terceiro número");
        num3 = scan.nextInt();

        System.out.println("O dobro de " + num1 + " é " + dobro(num1));
        System.out.println("O quadrado de " + num2 + " é " + quadrado(num2));
        proximos(num3);

        scan.close();
    }

}
