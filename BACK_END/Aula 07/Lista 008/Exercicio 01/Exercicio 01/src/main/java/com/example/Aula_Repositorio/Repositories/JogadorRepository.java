package com.example.Aula_Repositorio.Repositories;

import com.example.Aula_Repositorio.Models.Jogador;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface JogadorRepository extends JpaRepository<Jogador, UUID> {

    List<Jogador> findByNomeContainingIgnoreCase(String nome);
}
