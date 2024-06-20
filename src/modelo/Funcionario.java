package modelo;

public class Funcionario {

    private String nome;
    private int ID;
    private double salario;

    public Funcionario() {

    }

    public Funcionario(int id, String nome, double salario) {
        this.ID = id;
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
