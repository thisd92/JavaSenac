import java.util.Random;

public class Modelo {

    Random random = new Random();

    public void sorteioPrimo() {
        int numeroSorteado = (int) random.nextInt(((100 - 30) + 1) + 30);
        System.out.println("Número sorteado: " + numeroSorteado);
    }

}
