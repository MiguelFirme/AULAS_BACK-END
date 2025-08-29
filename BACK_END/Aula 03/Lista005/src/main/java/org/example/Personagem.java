package org.example;

public class Personagem {
    String nome;
    int hp;
    int atk;

    public Personagem(String nome, int hp, int atk) {
        this.nome = nome;
        this.hp = hp;
        this.atk = atk;

    }

    public void receberDano(int dano) {
        hp -= dano;

        if (hp <= 0){
            System.out.println("Personagem derrotado!!!");
        }else{
            System.out.println(nome + " Agora tem " + hp + " de HP!");}
    }

    public void atacar(Personagem alvo){
        System.out.println(nome + " atacou " + alvo.nome + " causando " + atk + " de dano!");
        alvo.receberDano(atk);

        if(alvo.hp == 0){
            System.out.println("ataque falhou");
        }else{
            System.out.println("Ataque bem sucedido!");
        }
    }

}
