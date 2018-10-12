package br.com.raphaelzana.central_fatec.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.raphaelzana.central_fatec.domain.Reserva;

@Repository
public interface ReservaRepository extends JpaRepository<Reserva, Integer>{

}
