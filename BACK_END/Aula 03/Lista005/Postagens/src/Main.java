package org.example;
import org.example.Postagem;
import org.example.MyBook;
import org.example.Fotogram;
import org.example.AnyTube;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Titulo: ");
        String titulo = scanner.nextLine();

        System.out.print("Descrição: ");
        String descricao = scanner.nextLine();

        System.out.print("Tipo (texto, imagem, video): ");
        String tipoStr = scanner.nextLine().toUpperCase();

        Postagem.TipoPostagem tipo;
        try {
            tipo = Postagem.TipoPostagem.valueOf(tipoStr);
        } catch (IllegalArgumentException e) {
            System.out.println("Tipo inválido!");
            scanner.close();
            return;
        }

        Postagem postagem = new Postagem(titulo, descricao, tipo);

        MyBook myBook = new MyBook();
        Fotogram fotogram = new Fotogram();
        AnyTube anyTube = new AnyTube();

        try {
            myBook.compartilharPostagem(postagem);
        } catch (Exception e) {
            System.out.println("Ocorreu um erro ao compartilhar essa postagem no MyBook.");
        }

        try {
            fotogram.compartilharImagem(postagem);
        } catch (Exception e) {
            System.out.println("Ocorreu um erro ao compartilhar essa postagem no Fotogram.");
        }

        try {
            anyTube.compartilharVideo(postagem);
        } catch (Exception e) {
            System.out.println("Ocorreu um erro ao compartilhar essa postagem no AnyTube.");
        }

        scanner.close();
    }
}