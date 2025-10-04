package com.example.Aula_Repositorio.Controller;

import com.example.Aula_Repositorio.Models.Jogador;
import com.example.Aula_Repositorio.Service.JogadorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;
import java.util.UUID;


@RestController
@RequestMapping("/jogadores")

public class JogadorController {
    private JogadorService jogadorService;

    public JogadorController(JogadorService jogadorService) {
        this.jogadorService = jogadorService;
    }


    @PostMapping
    public Jogador saveJogador(@RequestBody Jogador jogador) {
        return jogadorService.saveJogador(jogador.getNome(), jogador.getSobrenome());
    }


    @GetMapping
    public List<Jogador> listarOuPesquisar(@RequestParam(required = false) String nome) {
        if (nome != null && !nome.isEmpty()) {
            return jogadorService.buscarPorNome(nome);
        }

        return jogadorService.getAllJogadores();
    }


    @GetMapping("/{id}")
    public ResponseEntity<Jogador> getJogadorById(@PathVariable UUID id) {
        Optional<Jogador> jogador = jogadorService.buscarPorId(id);

        return jogador
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarJogador(@PathVariable UUID id) {

        if (jogadorService.buscarPorId(id).isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        jogadorService.deleteJogador(id);
        return ResponseEntity.noContent().build();
    }
}