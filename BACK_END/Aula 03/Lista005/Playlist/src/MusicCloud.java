package org.example;
import org.example.Musica;
import java.util.ArrayList;
import java.util.List;

public class MusicCloud {
    private List<Musica> musicasDisponiveis;

    public MusicCloud() {
        this.musicasDisponiveis = new ArrayList<>();
        musicasDisponiveis.add(new Musica("Leão", "Marilia Mendonça"));
        musicasDisponiveis.add(new Musica("Trem das Onze", "Demonios da Garoa"));
        musicasDisponiveis.add(new Musica("Evidências", "Chitãozinho & Xororó"));
    }

    public org.example.Musica buscarMusica(String titulo) throws Exception {
        for (Musica musica : musicasDisponiveis) {
            if (musica.getTitulo().equalsIgnoreCase(titulo)) {
                return musica;
            }
        }
        throw new Exception("A música " + titulo + " não foi encontrada no sistema.");
    }
}