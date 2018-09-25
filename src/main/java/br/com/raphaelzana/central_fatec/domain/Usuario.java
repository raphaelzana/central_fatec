package br.com.raphaelzana.central_fatec.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;

import br.com.raphaelzana.central_fatec.domain.enums.TipoUsuario;

@Entity
public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column(unique=true)
	private String email;
	private String senha;
	
	private Integer tipo;
	
	public Usuario() {}

	public Usuario(Integer id, @Email String email, String senha, TipoUsuario tipo) {
		super();
		this.id = id;
		this.email = email;
		this.senha = senha;
		this.tipo = (tipo == null) ? null : tipo.getId();;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public TipoUsuario getTipo() {
		return TipoUsuario.toEnum(tipo);
	}

	public void setTipo(TipoUsuario tipo) {
		this.tipo = tipo.getId();
	}
	
	

}
