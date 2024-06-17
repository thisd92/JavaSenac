import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        int cont = 0;
        Modelo modelo = new Modelo();

        System.out.println("");
        while (cont < 5) {
            modelo.sorteioPrimo();
            cont++;
        }

        scan.close();
    }
}
