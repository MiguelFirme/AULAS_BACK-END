package org.example;
import org.example.Postagem;
import org.example.PlataformaSocial;

public class AnyTube implements PlataformaSocial {

    @Override
    public void compartilharPostagem(Postagem postagem) {
        System.out.println("Você compartilhou essa postagem no AnyTube.");
    }

    @Override
    public void compartilharImagem(Postagem postagem) throws Exception {
        throw new Exception("AnyTube não permite compartilhar imagens.");
    }

    @Override
    public void compartilharVideo(Postagem postagem) {
        System.out.println("Você compartilhou essa postagem no AnyTube.");
    }
}