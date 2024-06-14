import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        int number = 0;
        Modelo modelo = new Modelo();

        System.out.print("Informe um número: ");
        number = scan.nextInt();
        modelo.isPrimeNumber(number);

        scan.close();
    }
}
