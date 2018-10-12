package br.com.raphaelzana.central_fatec.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.raphaelzana.central_fatec.domain.Noticia;
import br.com.raphaelzana.central_fatec.services.NoticiaService;

@RestController
@RequestMapping(value="/noticias")
public class NoticiaResource {
	
	@Autowired
	private NoticiaService service;
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
		Noticia obj = service.find(id);
		return ResponseEntity.ok().body(obj);
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<Noticia>> findAll() {
		List<Noticia> list = service.findAll();
		return ResponseEntity.ok().body(list);
		
	}
}
