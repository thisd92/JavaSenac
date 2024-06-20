package exercicios;

import java.util.Scanner;
import modelo.Funcionario;

public class Exercicios {

    public static void main(String[] args) {

        int id = 0;
        Funcionario funcionario = new Funcionario();
        Scanner scan = new Scanner(System.in);

        id++;
        funcionario.setID(id);
        System.out.println("Digite o nome do funcionário:");
        funcionario.setNome(scan.nextLine());
        System.out.println("Digite o salário do funcionário:");
        funcionario.setSalario(scan.nextDouble());
        System.out.println("Digite a altura do funcionário:");
        funcionario.setAltura(scan.nextDouble());

        System.out.println("Cadsatro de Funcionários:");
        System.out.println("ID: " + funcionario.getID() + "\nNome: "
                + funcionario.getNome() + "\nSalário: "
                + funcionario.getSalario() + "\nAltura: " + funcionario.getAltura());
    }

}
