package br.com.raphaelzana.central_fatec;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.raphaelzana.central_fatec.domain.Curso;
import br.com.raphaelzana.central_fatec.domain.Disciplina;
import br.com.raphaelzana.central_fatec.domain.Disciplina_Sala;
import br.com.raphaelzana.central_fatec.domain.Sala;
import br.com.raphaelzana.central_fatec.domain.Usuario;
import br.com.raphaelzana.central_fatec.domain.enums.PeriodoCurso;
import br.com.raphaelzana.central_fatec.domain.enums.TipoUsuario;
import br.com.raphaelzana.central_fatec.repositories.CursoRepository;
import br.com.raphaelzana.central_fatec.repositories.DisciplinaRepository;
import br.com.raphaelzana.central_fatec.repositories.Disciplina_SalaRepository;
import br.com.raphaelzana.central_fatec.repositories.SalaRepository;
import br.com.raphaelzana.central_fatec.repositories.UsuarioRepository;

@SpringBootApplication
public class CentralFatecApplication implements CommandLineRunner {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Autowired
	private CursoRepository cursoRepository;
	
	@Autowired
	private SalaRepository salaRepository;
	
	@Autowired
	private DisciplinaRepository disciplinaRepository;
	
	@Autowired
	private Disciplina_SalaRepository disciplina_salaRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(CentralFatecApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		
		/* 1 cadastro para cada professor, ai idProfessor estara em disciplina_sala*/
		Usuario admin = new Usuario(null, "adm@adm.adm", "admftq", TipoUsuario.ADMIN);
		Usuario mirela = new Usuario(null, "mirela@ingles1.ftq", "profftq", TipoUsuario.PROFESSOR);
		Usuario jederson = new Usuario(null, "jederson@les.ftq", "profftq", TipoUsuario.PROFESSOR);
		Usuario aluno = new Usuario(null, "aluno@aluno.aluno", "alunoftq", TipoUsuario.ALUNO);
		
		Curso adsNoite = new Curso(null, "Análise e Desenvolvimento de Sistemas", PeriodoCurso.NOITE, 8);
		Curso adsTarde = new Curso(null, "Análise e Desenvolvimento de Sistemas", PeriodoCurso.TARDE, 6);
		Curso agroManha = new Curso(null, "Agronegócio", PeriodoCurso.MANHA, 6);
		Curso agroNoite = new Curso(null, "Agronegócio", PeriodoCurso.NOITE, 8);
		Curso piManha = new Curso(null, "Produção Industrial", PeriodoCurso.MANHA, 6);
		Curso piNoite = new Curso(null, "Produção Industrial", PeriodoCurso.NOITE, 8);
		Curso siManha = new Curso(null, "Sistemas para Internet", PeriodoCurso.MANHA, 6);
		Curso geEAD = new Curso(null, "Gestão Empresarial", PeriodoCurso.MANHA/*EAD*/, 6);
		/*fazer enum EAD para ge */
		
		Sala lab1 = new Sala(null, "Laboratório de Informática 1", "A1");
		Sala lab2 = new Sala(null, "Laboratório de Informática 2", "A1");
		Sala lab3 = new Sala(null, "Laboratório de Informática 3", "A1");
		Sala lab4 = new Sala(null, "Laboratório de Informática 4", "A1");
		Sala lab5 = new Sala(null, "Laboratório de Informática 5", "A1");
		Sala lab1pi = new Sala(null, "Laboratório de Produção Industrial 1", "A2");
		Sala lab2pi = new Sala(null, "Laboratório de Produção Industrial 2", "A2");
		
		Disciplina les = new Disciplina(null, "Laboratório de Engenharia de Software");
		Disciplina ing1 = new Disciplina(null, "Ingles I");
		
		Disciplina_Sala salaLes = new Disciplina_Sala(les, adsNoite, lab1, "Quinta-Feira", 4, 7);
		Disciplina_Sala salaIng1 = new Disciplina_Sala(ing1, adsNoite, lab2, "Segunda-Feira", 1, 6);
		
		usuarioRepository.save(admin);
		usuarioRepository.save(mirela);
		usuarioRepository.save(jederson);
		usuarioRepository.save(aluno);
		
		cursoRepository.saveAll(Arrays.asList(adsNoite,adsTarde,agroManha,agroNoite,piManha,piNoite,siManha,geEAD));
		
		salaRepository.saveAll(Arrays.asList(lab1,lab2,lab3,lab4,lab5,lab1pi,lab2pi));
		disciplinaRepository.save(les);
		
		disciplina_salaRepository.saveAll(Arrays.asList(salaLes, salaIng1));
	}
	
}
