package br.com.raphaelzana.central_fatec.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.raphaelzana.central_fatec.domain.Objeto;
import br.com.raphaelzana.central_fatec.repositories.ObjetoRepository;

@Service
public class ObjetoService {
	
	@Autowired
	private ObjetoRepository repo;
	
	public Objeto find(Integer id) {
		Optional<Objeto> obj = repo.findById(id);
		return obj.orElse(null);
	}
	
	public List<Objeto> findAll(){
		return repo.findAll();
	}

}
