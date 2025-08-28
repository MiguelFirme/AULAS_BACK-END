package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Empregado e1 = new Empregado("Maria", "Silva", 3000.0);
        Empregado e2 = new Empregado("João", "Souza", 4500.0);

        //testes

        System.out.println("Antes do aumento:");
        System.out.println("O empregado " + e1.getNome() + " " + e1.getSobrenome() + " recebe R$" + e1.getSalarioMensal() + " por mês." );
        System.out.println("Salário anual: " + e1.getSalarioAnual());

        System.out.println("\nO empregado " + e2.getNome() + " " + e2.getSobrenome() + " recebe R$" + e2.getSalarioMensal() + " por mês." );
        System.out.println("Salário anual: " + e2.getSalarioAnual());

        //aplicar aumento
        e1.aplicarAumento(15.0);
        e2.aplicarAumento(100.0);

        System.out.println("\nDepois do aumento:");
        System.out.println("O empregado " + e1.getNome() + " " + e1.getSobrenome() + " recebe R$ " + e1.getSalarioMensal() + " por mês." );
        System.out.println("Salário anual: " + e1.getSalarioAnual());

        System.out.println("\nO empregado " + e2.getNome() + " " + e2.getSobrenome() + " recebe R$" + e2.getSalarioMensal() + " por mês." );
        System.out.println("Salário anual: " + e2.getSalarioAnual());
    }
}