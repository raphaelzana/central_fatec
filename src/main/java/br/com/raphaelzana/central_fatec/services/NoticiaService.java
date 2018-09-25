package br.com.raphaelzana.central_fatec.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.raphaelzana.central_fatec.domain.Noticia;
import br.com.raphaelzana.central_fatec.repositories.NoticiaRepository;

@Service
public class NoticiaService {
	
	@Autowired
	private NoticiaRepository repo;
	
	public Noticia buscar(Integer id) {
		Optional<Noticia> obj = repo.findById(id);
		return obj.orElse(null);
	}

}
