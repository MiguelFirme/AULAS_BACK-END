package org.example;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static boolean todosDerrotados(ArrayList<Personagem> inimigos) {
        for (Personagem inimigo : inimigos) {
            if (inimigo.hp > 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        ArrayList<Personagem> inimigos = new ArrayList<>();
        inimigos.add(new Personagem("Globyn", 30, 5));
        inimigos.add(new Personagem("Lambiomi", 90, 30));
        inimigos.add(new Personagem("harpia", 15, 15));
        inimigos.add(new Personagem("Dragão", 150, 50));

        Personagem p1 = new Personagem("Edmar", 70, 10);

        Random random = new Random();

        while (p1.hp > 0 && !todosDerrotados(inimigos)) {

            Personagem inimigoAlvo = null;
            while (inimigoAlvo == null) {
                int indice = random.nextInt(inimigos.size());
                Personagem possivelAlvo = inimigos.get(indice);
                if (possivelAlvo.hp > 0) {
                    inimigoAlvo = possivelAlvo;
                }
            }

            System.out.println("\n--- Turno do Jogador ---");
            p1.atacar(inimigoAlvo);

            System.out.println("\n--- Turno dos Inimigos ---");
            for (Personagem inimigo : inimigos) {
                if (inimigo.hp > 0) {
                    inimigo.atacar(p1);
                }
            }

            System.out.println("\n============================\n");
        }

        if (p1.hp <= 0) {
            System.out.println("O jogador foi derrotado! Fim do jogo.");
        } else {
            System.out.println("Todos os inimigos foram derrotados! Vitória do jogador!");
        }
    }
}
