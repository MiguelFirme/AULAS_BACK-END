package org.example;
import org.example.Personagem;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        ArrayList<Personagem> inimigos = new ArrayList<>();
        inimigos.add(new Personagem("Globyn", 30, 5, 2));
        inimigos.add(new Personagem("Lambiomi", 90, 30, 5));
        inimigos.add(new Personagem("Harpia", 15, 15, 3));
        inimigos.add(new Personagem("Dragão", 150, 50, 10));

        Personagem p1 = new Personagem("Edmar", 70, 10, 5);
        Random random = new Random();

        System.out.println("Uma horda de monstros aparece! Prepare-se para a batalha!");

        // Loop para lutar contra os inimigos aleatoriamente
        while (p1.hp > 0 && inimigos.size() > 0) {

            // Escolhe um inimigo aleatório da lista
            int indiceInimigo = random.nextInt(inimigos.size());
            Personagem inimigoAtual = inimigos.get(indiceInimigo);

            System.out.println("\n-----------------------------");
            System.out.println(p1.nome + " encontrou um(a) " + inimigoAtual.nome + "!");
            System.out.println("HP do " + p1.nome + ": " + p1.hp);
            System.out.println("HP do " + inimigoAtual.nome + ": " + inimigoAtual.hp);
            System.out.println("-----------------------------");

            // Loop de batalha: continua enquanto o jogador E o inimigo atual estiverem vivos
            while (p1.hp > 0 && inimigoAtual.hp > 0) {

                System.out.println("\n--- Turno do " + p1.nome + " ---");
                p1.atacar(inimigoAtual);

                if (inimigoAtual.hp <= 0) {
                    System.out.println("\n" + p1.nome + " derrotou o(a) " + inimigoAtual.nome + "!");
                    // Remove o inimigo derrotado da lista
                    inimigos.remove(indiceInimigo);
                    break;
                }

                System.out.println("\n--- Turno do(a) " + inimigoAtual.nome + " ---");
                inimigoAtual.atacar(p1);

                // Se o jogador for derrotado no turno do inimigo, encerra o loop de batalha
                if (p1.hp <= 0) {
                    break;
                }
            }
        }

        if (p1.hp > 0) {
            System.out.println("\nParabéns! Você derrotou todos os inimigos. Vitória!");
        } else {
            System.out.println("\nO jogador foi derrotado! Fim do jogo.");
        }
    }
}