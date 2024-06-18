package modelo;

import java.util.ArrayList;
import java.util.Random;

public class Modelo {

    int[] numerosPrimos = new int[20];
    Random random = new Random();
    ArrayList<Integer> nPrimos = new ArrayList<>();

    public boolean isPrimeNumber(int number) {
        int div = 0;
        int valor = 1;
        while (valor <= number) {
            if (number % valor == 0) {
                div++;
            }
            valor++;
        }
        if (div == 2) {
            return true;
        }
        return false;
    }

    public void sorteio(int number) {
        int i = 0;
        int num;
        while (i < number) {
            num = random.nextInt((100 - 30) + 1) + 30;
            if (isPrimeNumber(num)) {
                numerosPrimos[i] = num;
                nPrimos.add(num);
            }
            System.out.println("Número sorteado: " + num);
            i++;
        }
    }

    public int random() {
        int number = random.nextInt((100 - 0) + 1);
        return number;
    }

    public void printPrimos() {
        for (int i = 0; i < numerosPrimos.length; i++) {
            if (numerosPrimos[i] > 0) {
                System.out.print(numerosPrimos[i] + " ");
            }
        }
        System.out.println("");
        for (int n : nPrimos) {
            System.out.print(n + " ");
        }
        System.out.println("");

    }
}
