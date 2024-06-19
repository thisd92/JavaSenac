package exercicios;

import java.util.Scanner;

public class Exercicios {

    public static void main(String[] args) {

        int num1, num2, num3, i = 0;
        Scanner scan = new Scanner(System.in);
        
        num1 = scan.nextInt();
        System.out.println("O dobro de " + num1 + " é " + (num1 * 2));
        num2 = scan.nextInt();
        System.out.println("O quadrado de " + num2 + " é " + (num2 * num2));
        num3 = scan.nextInt();
        System.out.println("O número anterior a " + num3 + " é " + (num3 - 1) + " e o posterior é " + (num3 + 1));

        scan.close();
    }

}
