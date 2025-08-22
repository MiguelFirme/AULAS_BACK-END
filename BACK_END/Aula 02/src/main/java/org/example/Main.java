package org.example;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String[] nomes = { "Deide", "Ronaldo", "Cristiano", "Pelé", "Pedro", "Diego" };
        String[] sobrenomes = { "Costa", "Mineiro", "Geromel", "Ronaldo", "Alves", "Silva" };
        String[] clubes = { "Criciúma", "Fortaleza", "Flamengo", "Vasco", "Prospera", "Bahia" };
        String[] posicoes = { "goleiro", "zagueiro", "lateral", "meio-campo", "atacante" };


        Random random = new Random();

        String nome = nomes[random.nextInt(nomes.length)];
        String sobrenome = sobrenomes[random.nextInt(sobrenomes.length)];
        String clube = clubes[random.nextInt(clubes.length)];
        String posicao = posicoes[random.nextInt(posicoes.length)];
        short idade = 30;

        Jogador Neymar = new Jogador(
                "Neymar",
                "Junior",
                "Santos",
                "Atacante",
                (short) 45
        );

        for ( int i = 0; i < 11; i ++) {
            Jogador jogador = new Jogador(
                    nomes[random.nextInt(nomes.length)],
                    sobrenomes[random.nextInt(sobrenomes.length)],
                    clubes[random.nextInt(clubes.length)],
                    posicoes[random.nextInt(posicoes.length)],
                    (short)random.nextInt(18, 45));

            System.out.println(jogador.nome + " " + jogador.sobrenome + " é um futebolista brasileiro de " + jogador.idade + " anos que atua como " + jogador.posicao + " atualmente jogando pelo " + jogador.clube);
        }

        /*System.out.println(nome + " " + sobrenome + " é um futebolista brasileiro de " + idade + " anos que atua como " + posicao + " atualmente jogando pelo " + clube);*/

    }
}