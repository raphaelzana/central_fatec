package br.com.raphaelzana.central_fatec;

import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import br.com.raphaelzana.central_fatec.domain.Projetor;
import br.com.raphaelzana.central_fatec.domain.Reserva;
import br.com.raphaelzana.central_fatec.domain.Usuario;
import br.com.raphaelzana.central_fatec.domain.enums.PeriodoCurso;
import br.com.raphaelzana.central_fatec.repositories.ProjetorRepository;
import br.com.raphaelzana.central_fatec.repositories.ReservaRepository;
import br.com.raphaelzana.central_fatec.repositories.UsuarioRepository;


@SpringBootApplication
public class CentralFatecApplication implements CommandLineRunner {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Autowired
	private ReservaRepository reservaRepository;
	
	@Autowired
	private ProjetorRepository projetorRepository;
	
	@Autowired
	private BCryptPasswordEncoder pe;
	
	public static void main(String[] args) {
		SpringApplication.run(CentralFatecApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
		
		Usuario prof = new Usuario(null, "prof@prof.prof", pe.encode("profftq"));
		
		usuarioRepository.save(prof);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyy");
		Projetor p1 = new Projetor(null, true, "a");
		projetorRepository.save(p1);
		Reserva res = new Reserva(null, p1, prof, sdf.parse("01-01-2000"), 1, "oi", PeriodoCurso.NOITE);
		
		reservaRepository.save(res);
		
		System.out.println(reservaRepository.findByDataAndPeriodoAndAula(sdf.parse("01-01-2000"), 1, 1).contains(res));
		
		
	}
	
}
