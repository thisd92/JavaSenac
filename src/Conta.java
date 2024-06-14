public class Conta {
    
    private Double saldo;

    public Conta() {

    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public void sacar(Double valor) {
        saldo -= valor;
    }

    public void depositar(Double valor) {
        saldo += valor;
    }

    public void verificaSaldo() {
        System.out.println("Saldo Disponível: " + String.format("R$ %.2f" , getSaldo()));
    }
}
