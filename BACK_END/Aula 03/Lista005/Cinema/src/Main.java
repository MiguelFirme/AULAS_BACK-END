package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cinema cinema = new Cinema();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Que filme você deseja assistir? (ou 'sair' para encerrar) ");
            String nomeFilme = scanner.nextLine();
            if (nomeFilme.equalsIgnoreCase("sair")) {
                break;
            }

            System.out.print("Qual assento você deseja? ");
            String assento = scanner.nextLine();

            System.out.print("Qual o seu nome? ");
            String nomeCliente = scanner.nextLine();

            System.out.print("Qual a sua idade? ");
            int idade = Integer.parseInt(scanner.nextLine());

            Cliente cliente = new Cliente(nomeCliente, idade);

            try {
                cinema.venderIngresso(cliente, nomeFilme, assento);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        scanner.close();
    }
}