package br.com.raphaelzana.central_fatec.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.raphaelzana.central_fatec.domain.Objeto;
import br.com.raphaelzana.central_fatec.services.ObjetoService;

@RestController
@RequestMapping(value="/objetos")
public class ObjetoResource {
	
	@Autowired
	private ObjetoService service;
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<Objeto>> findAll() {
		List<Objeto> list = service.findAll();
		return ResponseEntity.ok().body(list);
		
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
		Objeto obj = service.find(id);
		return ResponseEntity.ok().body(obj);
	}

}
