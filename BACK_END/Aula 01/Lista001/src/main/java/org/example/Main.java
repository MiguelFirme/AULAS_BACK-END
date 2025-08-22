package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Exercicio06();
    }

    static void introdução() {
        //Cria um scanner na memória
        Scanner leitor = new Scanner(System.in);
        //Peço pro usuário digitar seu nome
        System.out.println("Digite seu nome: ");
        //Leio e gravo o nome do usuário (sring nome)
        String nome = leitor.nextLine();
        //Concateno a mensagem com a variavel nome
        String mensagem = "Olá " + nome + "!";
        //Mostrar a mensagem final
        System.out.println(mensagem);
    }

    static void Exercicio01() {
        String mensagem = "Bem-vindo ao Sistema de Geração de Jogadores!";
        System.out.println(mensagem);
    }

    static void Exercicio02() {
        String nome = "Mariana Silva";
        String cargo = "Analista de Sistemas";
        double salario = 4500.00;

        System.out.println("Dados do Funcionário: \n" + "Nome: " + nome + "\nCargo: "+ cargo + "\nSalario: R$ "+salario);
    }

    static void Exercicio03() {
        String nome = "Teclado";
        int codigo = 1234;
        double preco = 99.99;
        boolean promo = true;

        System.out.println("Dados do Funcionário: \n" + "Nome: " + nome + "\nCódigo: "+ codigo + "\nPreço: R$ "+preco + "\nPromoção: "+ promo);
    }

    static void Exercicio04() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o valor: ");
        double precoN = entrada.nextDouble();
        double preco = 0;

        if (precoN > 100) {preco = precoN * 0.9;} else {preco = precoN; }

        System.out.println("Valor final com desconto: R$ " + preco );
    }

    static void Exercicio05() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite sua Idade: ");
        int idade = entrada.nextInt();
        String categoria= "";

        if(idade < 12){
            categoria = "Infantil";}
        else if ( idade > 12 && idade <17)
        { categoria = "Adolescente";}
        else if( idade > 17){ categoria = "Adulto";}

        System.out.println("Você está classificado como: " + categoria);
    }

    static void Exercicio06(){
        double nota01 = 7;
        double nota02 = 8;
        double nota03 = 6;
        double nota04 = 9;
        double nota05 = 10;

        double media = (nota01 + nota02 + nota03 + nota04 + nota05)/5;
        System.out.println("Média: " + media);
    }

}
