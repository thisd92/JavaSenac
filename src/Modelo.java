import java.util.ArrayList;

public class Modelo {

    ArrayList<Integer> numerosPrimos = new ArrayList<>();

    public void isPrimeNumber(int number) {
        int div = 0;
        int valor = 1;
        while (valor <= number) {
            if (number % valor == 0) {
                div++;
            }
            valor++;
        }
        if (div == 2) {
            numerosPrimos.add(number);
        }
    }

    public void sorteioPrimo() {
        int numeroSorteado = (int) (Math.random() * 50 + 1);
        System.out.println("Número sorteado: " + numeroSorteado);
        isPrimeNumber(numeroSorteado);
        System.out.println("Números primos sorteados:");
        for (Integer num : numerosPrimos) {
            System.out.print(num + " - ");
        }
    }

}
