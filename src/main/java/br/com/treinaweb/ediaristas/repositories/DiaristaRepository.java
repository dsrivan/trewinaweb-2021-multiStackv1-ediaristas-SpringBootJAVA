package br.com.treinaweb.ediaristas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.treinaweb.ediaristas.models.Diarista;

public interface DiaristaRepository extends JpaRepository<Diarista, Long> {
    /* com base nessa interface, o Spring Data JPA vai prover uma classe que a implementa
    com todos os métodos para realizar crud */
}
