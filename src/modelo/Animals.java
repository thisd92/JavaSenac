package modelo;

public class Animals {

    private String raca;
    private double altura;
    private int peso;

    public Animals() {

    }

    public Animals(String raca, double altura, int peso) {
        this.raca = raca;
        this.altura = altura;
        this.peso = peso;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Animals{" + "raca=" + raca + ", altura=" + altura + ", peso=" + peso + '}';
    }

}
