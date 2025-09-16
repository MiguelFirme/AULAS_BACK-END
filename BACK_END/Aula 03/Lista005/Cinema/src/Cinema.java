package org.example;

import java.util.ArrayList;
import java.util.List;

public class Cinema {
    private List<Filme> filmesDisponiveis;
    private List<Ingresso> ingressosVendidos;

    public Cinema() {
        this.filmesDisponiveis = new ArrayList<>();
        this.ingressosVendidos = new ArrayList<>();

        // Inserindo filmes
        filmesDisponiveis.add(new Filme("Homem Aranha", 20.0, 14));
        filmesDisponiveis.add(new Filme("Vingadores", 25.0, 12));
        filmesDisponiveis.add(new Filme("Toy Story", 15.0, 0));
        filmesDisponiveis.add(new Filme("Interestelar", 30.0, 16));
        filmesDisponiveis.add(new Filme("Matrix", 22.0, 18));
    }

    public List<Filme> getFilmesDisponiveis() {
        return filmesDisponiveis;
    }

    public void venderIngresso(Cliente cliente, String nomeFilme, String assento) throws Exception {
        Filme filmeEscolhido = null;

        for (Filme filme : filmesDisponiveis) {
            if (filme.getNome().equalsIgnoreCase(nomeFilme)) {
                filmeEscolhido = filme;
                break;
            }
        }

        if (filmeEscolhido == null) {
            throw new Exception("Filme não encontrado.");
        }

        if (cliente.getIdade() < filmeEscolhido.getIdadeMinima()) {
            throw new Exception("O ingresso não pode ser vendido pois sua idade não permite!");
        }

        for (Ingresso ingresso : ingressosVendidos) {
            if (ingresso.getAssento().equalsIgnoreCase(assento) && ingresso.getFilme().getNome().equalsIgnoreCase(nomeFilme)) {
                throw new Exception("O ingresso não pode ser vendido pois seu assento não está mais disponível!");
            }
        }

        Ingresso novoIngresso = new Ingresso(cliente, filmeEscolhido, assento);
        ingressosVendidos.add(novoIngresso);

        System.out.println("Ingresso vendido com sucesso! " + filmeEscolhido.getNome() + " - " + assento + " - " + cliente.getNome());
    }
}