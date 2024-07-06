/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author 200901268
 */
public class Calculadora {

    public static void main(String[] args) throws IOException {

        int n = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe um número para a tabuada");
        n = scan.nextInt();

        FileWriter arq = new FileWriter("d:\\tabuada-do-" + n + ".txt");
        PrintWriter gravarArq = new PrintWriter(arq);

        gravarArq.printf("+--Resultado--+\n");
        for (int i = 1; i <= 10; i++) {
            gravarArq.printf("| %2d X %d = %2d |\n", i, n, (i * n));
        }
        gravarArq.printf("+-------------+\n");

        arq.close();
    }
}
