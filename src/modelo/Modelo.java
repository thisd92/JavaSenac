package modelo;

import java.util.ArrayList;
import java.util.Random;

public class Modelo {

    public ArrayList sorteio(int number) {
        Random random = new Random();
        ArrayList<Integer> nSorteados = new ArrayList<>();
        int i = 0;
        int num;
        while (i < number) {
            num = random.nextInt((100 - 30) + 1) + 30;
            nSorteados.add(num);
            i++;
        }
        return nSorteados;
    }

    public void printNumeros(ArrayList<Integer> array) {
        for (int n : array) {
            System.out.print(n + " - ");
        }
    }

}
