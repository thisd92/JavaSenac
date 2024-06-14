public class Modelo {

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
            System.out.println(number + " é um número primo");
        } else {
            System.out.println(number + " não é um número primo");
        }

    }

}
