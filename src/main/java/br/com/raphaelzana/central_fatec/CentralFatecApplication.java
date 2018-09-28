package br.com.raphaelzana.central_fatec;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CentralFatecApplication /*implements CommandLineRunner*/ {
	
//	@Autowired
//	private UsuarioRepository usuarioRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(CentralFatecApplication.class, args);
	}
	
//	@Override
//	public void run(String... args) throws Exception {
//		
//		Usuario admin = new Usuario(null, "adm@adm.adm", "admftq", TipoUsuario.ADMIN);
//		
//		usuarioRepository.save(admin);
//	}
	
}
