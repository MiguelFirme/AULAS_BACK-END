package org.example;

public class PortoPequeno extends BasePorto {

    public PortoPequeno() {
        this.nome = "porto pequeno";
    }

    @Override
    public void atracarBarco(Barco barco) {
        if (barco.tamanho <= 10) {
            super.atracarBarco(barco);
        } else {
            System.out.println(barco.nome + " não pode atracar no " + nome + ", tamanho muito grande.");
        }
    }
}