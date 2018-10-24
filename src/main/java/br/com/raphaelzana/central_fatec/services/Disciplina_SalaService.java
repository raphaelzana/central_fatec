package br.com.raphaelzana.central_fatec.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.raphaelzana.central_fatec.domain.Disciplina_Sala;
import br.com.raphaelzana.central_fatec.repositories.Disciplina_SalaRepository;

@Service
public class Disciplina_SalaService {
	
	@Autowired
	private Disciplina_SalaRepository repo;
	
	/*public Disciplina_Sala find(Integer id) {
		Optional<Disciplina_Sala> obj = repo.findById(id);
		return obj.orElse(null);
	}*/
	
	public List<Disciplina_Sala> findAll(){
		return repo.findAll();
	}

	@Transactional
	public Disciplina_Sala insert(Disciplina_Sala obj) {
		obj.setId(null);
		return repo.save(obj);
	}
	
	/*public Disciplina_Sala update(Disciplina_Sala obj) {
		Disciplina_Sala newObj = find(obj.getId());
		updateData(newObj, obj);
		return repo.save(newObj);
	}*/
	
	/*public void delete(Integer id) {
		find(id);
		repo.deleteById(id);
	}*/
	
	/*private void updateData(Disciplina_Sala newObj, Disciplina_Sala obj) {
		
	}*/
	
}
