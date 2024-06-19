/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

/**
 *
 * @author 200901268
 */
public class Modelo {

    public int dobro(int number) {
        return number * 2;
    }

    public int quadrado(int number) {
        return number * number;
    }

    public void proximos(int number) {
        System.out.println("Número anterior a " + number + " é " + (number - 1) + " e o posterior é " + (number + 1));
    }
}
