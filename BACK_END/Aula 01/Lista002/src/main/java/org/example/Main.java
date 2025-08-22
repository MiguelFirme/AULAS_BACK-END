package org.example;

import java.security.SecureRandom;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String senha = Gerador(8);
        System.out.println("Senha gerada: " + senha);

        Pokemons();
    }

    static String Gerador(int tamanho) {
        if (tamanho < 8) {
            throw new IllegalArgumentException("O tamanho mínimo é 8");
        }

        String maiusculas = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String minusculas = "abcdefghijklmnopqrstuvwxyz";
        String digitos = "0123456789";
        String simbolos = "!@#$%&*()-_=+[]{}:,.?";
        String TODOS = maiusculas + minusculas + digitos + simbolos;

        SecureRandom RANDOM = new SecureRandom();
        List<Character> chars = new ArrayList<>();

        // Garantir pelo menos um de cada tipo
        chars.add(maiusculas.charAt(RANDOM.nextInt(maiusculas.length())));
        chars.add(minusculas.charAt(RANDOM.nextInt(minusculas.length())));
        chars.add(digitos.charAt(RANDOM.nextInt(digitos.length())));
        chars.add(simbolos.charAt(RANDOM.nextInt(simbolos.length())));

        for (int i = chars.size(); i < tamanho; i++) {
            chars.add(TODOS.charAt(RANDOM.nextInt(TODOS.length())));
        }

        Collections.shuffle(chars, RANDOM);

        StringBuilder senha = new StringBuilder();
        for (char c : chars) {
            senha.append(c);
        }

        return senha.toString();
    }

    static void Pokemons() {
        String[] nomes = {"Pikachu", "Charmander", "Squirtle", "Bulbasaur", "Eevee", "Jigglypuff", "Snorlax", "Gengar", "Machop", "Dratini"};
        String[] tipos = {"Elétrico", "Fogo", "Água", "Planta", "Normal", "Voador", "Fantasma", "Lutador", "Dragão", "Psíquico"};

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Quantos Pokémon você deseja gerar? ");
        int quantidade = scanner.nextInt();
        System.out.println();

        for (int i = 0; i < quantidade; i++) {
            String nome = nomes[random.nextInt(nomes.length)];
            String tipo = tipos[random.nextInt(tipos.length)];
            int nivel = random.nextInt(100) + 1;

            System.out.println(nome + " é um Pokémon do tipo " + tipo + " de nível " + nivel + ".");
        }

        scanner.close();
    }
}
