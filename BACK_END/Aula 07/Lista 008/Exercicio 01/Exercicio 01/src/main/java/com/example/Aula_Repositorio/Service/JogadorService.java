package com.example.Aula_Repositorio.Service;

import com.example.Aula_Repositorio.Models.Jogador;
import com.example.Aula_Repositorio.Repositories.JogadorRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;


@Service
public class JogadorService {
    private JogadorRepository jogadorRepository;

    public JogadorService (JogadorRepository jogadorRepository){
        this.jogadorRepository = jogadorRepository;
    }
    public Jogador saveJogador(String nome, String sobrenome) {
        Jogador novoJogador = new Jogador();
        novoJogador.setNome(nome);
        novoJogador.setSobrenome(sobrenome);
        novoJogador.setClube("Criciuma");
        jogadorRepository.save(novoJogador);
        return novoJogador;


    }
    // Retorna todos os jogadores
    public List<Jogador> getAllJogadores() {
        return jogadorRepository.findAll();
    }

    //Retornar um em especifico
    public Optional<Jogador> buscarPorId(UUID id) {
        return jogadorRepository.findById(id);
    }

    //pesquisar por nome
    public List<Jogador> buscarPorNome(String nome) {
        return jogadorRepository.findByNomeContainingIgnoreCase(nome);
    }

    public void deleteJogador(UUID id) {
        jogadorRepository.deleteById(id);
    }

    public Optional<Jogador> atualizarParcialmente(UUID id, Jogador jogadorDetalhes) {

        return jogadorRepository.findById(id).map(jogadorExistente -> {

            if (jogadorDetalhes.getNome() != null) {
                jogadorExistente.setNome(jogadorDetalhes.getNome());
            }

            if (jogadorDetalhes.getSobrenome() != null) {
                jogadorExistente.setSobrenome(jogadorDetalhes.getSobrenome());
            }

            return jogadorRepository.save(jogadorExistente);
        });
    }
}
