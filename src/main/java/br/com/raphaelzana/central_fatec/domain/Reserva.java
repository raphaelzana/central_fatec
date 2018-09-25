package br.com.raphaelzana.central_fatec.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Reserva implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	private Projetor projetor;
	private Date data;
	private Usuario usuario;

	public Reserva() {}

	public Reserva(Integer id, Projetor projetor, Date data, Usuario usuario) {
		super();
		this.id = id;
		this.projetor = projetor;
		this.data = data;
		this.usuario = usuario;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Projetor getProjetor() {
		return projetor;
	}

	public void setProjetor(Projetor projetor) {
		this.projetor = projetor;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
}
