package org.example;

public class Personagem {
    String nome;
    int hp;
    int atk;
    int defesa;

    public Personagem(String nome, int hp, int atk, int defesa) {
        this.nome = nome;
        this.hp = hp;
        this.atk = atk;
        this.defesa = defesa;
    }

    public void receberDano(int dano) {
        this.hp -= dano;
        if (this.hp < 0) {
            this.hp = 0;
        }

        if (this.hp <= 0) {
            System.out.println(this.nome + " foi derrotado!");
        } else {
            System.out.println(this.nome + " agora tem " + this.hp + " de HP!");
        }
    }

    public void atacar(Personagem alvo) {
        int danoCausado = Math.max(0, this.atk - alvo.defesa);
        System.out.println(this.nome + " atacou " + alvo.nome + "!");

        if (danoCausado > 0) {
            alvo.receberDano(danoCausado);
        } else {
            System.out.println("O ataque de " + this.nome + " foi ineficaz contra a defesa de " + alvo.nome + "!");
        }
    }
}