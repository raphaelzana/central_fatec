package br.com.raphaelzana.central_fatec.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.raphaelzana.central_fatec.domain.Disciplina_Sala;

@Repository
public interface Disciplina_SalaRepository extends JpaRepository<Disciplina_Sala, Integer>{

}
