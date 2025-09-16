package org.example;

import java.util.ArrayList;
import java.util.List;

public class BasePorto {
    String nome;
    List<Barco> barcosAtracados = new ArrayList<>();

    public void atracarBarco(Barco barco) {
        barcosAtracados.add(barco);
    }

    public void desatracarBarco(Barco barco) {
        barcosAtracados.remove(barco);
    }

    public void mostrarBarcos() {
        for (Barco barco : barcosAtracados) {
            System.out.println(barco.nome + " atracado no " + nome);
        }
    }
}