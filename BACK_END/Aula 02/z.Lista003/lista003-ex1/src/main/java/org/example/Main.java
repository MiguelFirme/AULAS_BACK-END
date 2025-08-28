package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Fatura f1 = new Fatura("123", "mouse", 2, 80.0);
        Fatura f2 = new Fatura("678", "Teclado", -3, -100.0);

        System.out.println("Fatura número: " + f1.getNumero());
        System.out.println("Descrição: " + f1.getDescricao());
        System.out.println("Quantidade: " + f1.getQtde());:
        System.out.println("Preço por item: " + f1.getPrecoPorItem());
        System.out.println("Total: R$ " + f1.getTotalFatura());

        System.out.println("\nFatura número: " + f2.getNumero());
        System.out.println("Descrição: " + f2.getDescricao());
        System.out.println("Quantidade: " + f2.getQtde());
        System.out.println("Preço por item: " + f2.getPrecoPorItem());
        System.out.println("Total: R$ " + f2.getTotalFatura());
    }
}