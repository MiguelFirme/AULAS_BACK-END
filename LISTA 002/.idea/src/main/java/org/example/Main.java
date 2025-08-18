package org.example;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String senha = Gerador(8);
        System.out.println("Senha gerada: " + senha);
    }

    static String Gerador(int tamanho) {
        if (tamanho < 4) {
            throw new IllegalArgumentException("O tamanho mínimo é 8");
        }

        String maiusculas = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String minusculas = "abcdefghijklmnopqrstuvwxyz";
        String digitos    = "0123456789";
        String simbolos   = "!@#$%&*()-_=+[]{}:,.?";
        String TODOS      = maiusculas + minusculas + digitos + simbolos;

        SecureRandom RANDOM = new SecureRandom();
        List<Character> chars = new ArrayList<>();

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
}