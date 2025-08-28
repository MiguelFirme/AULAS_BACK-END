package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Datas válidas
        Data d1 = new Data(25, 8, 2025);    // 25/8/2025
        Data d2 = new Data(29, 2, 2024);    // 29/2/2024 (ano bissexto)
        Data d3 = new Data(31, 12, 1999);   // 31/12/1999

        System.out.println("Datas válidas:");
        d1.displayData();
        d2.displayData();
        d3.displayData();

        // Datas inválidas
        System.out.println("\nTestando datas inválidas:");
        Data d4 = new Data(31, 2, 2023);   // Fevereiro 2023 não tem 31 dias
        d4.displayData();

        Data d5 = new Data(30, 13, 2022);  // Mês inválido
        d5.displayData();

        Data d6 = new Data(0, 10, 2020);   // Dia inválido
        d6.displayData();
    }
}