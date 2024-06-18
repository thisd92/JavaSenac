package modelo;

import java.util.ArrayList;
import java.util.Random;

public class Modelo {

    Random random = new Random();
    ArrayList<Integer> nPrimos = new ArrayList<>();
    ArrayList<Integer> nSorteados = new ArrayList<>();

    public ArrayList<Integer> getnPrimos() {
        return nPrimos;
    }

    public ArrayList<Integer> getnSorteados() {
        return nSorteados;
    }

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

    public ArrayList<Integer> sorteio(int number) {
        ArrayList<Integer> numPrimos = new ArrayList<>();
        nSorteados.clear();
        int i = 0;
        int num;
        while (i < number) {
            num = random.nextInt((100 - 30) + 1) + 30;
            nSorteados.add(num);
            if (isPrimeNumber(num)) {
                numPrimos.add(num);
                nPrimos.add(num);
            }
            i++;
        }
        return numPrimos;
    }

    public int random() {
        int number = random.nextInt((100 - 0) + 1);
        return number;
    }

}
