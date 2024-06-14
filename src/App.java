public class App {
    public static void main(String[] args) throws Exception {

        Conta cc = new Conta();

        System.out.println("");
        System.out.println("Iniciei a conta com R$ 5.000,00");
        cc.setSaldo(5000.00);
        cc.depositar(1000.00);
        System.out.println("Depositei R$ 1.000,00");
        cc.verificaSaldo();
        cc.sacar(750.00);
        System.out.println("Saquei R$ 750,00");
        cc.verificaSaldo();
        System.out.println("");
    }
}
