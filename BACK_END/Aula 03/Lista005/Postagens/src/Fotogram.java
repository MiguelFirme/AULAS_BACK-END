package org.example;
import org.example.Postagem;
import org.example.PlataformaSocial;

public class Fotogram implements PlataformaSocial {

    @Override
    public void compartilharPostagem(Postagem postagem) throws Exception {
        throw new Exception("Fotogram não permite compartilhar postagens de texto.");
    }

    @Override
    public void compartilharImagem(Postagem postagem) {
        System.out.println("Você compartilhou essa postagem no Fotogram.");
    }

    @Override
    public void compartilharVideo(Postagem postagem) {
        System.out.println("Você compartilhou essa postagem no Fotogram.");
    }
}