package br.com.raphaelzana.central_fatec.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.com.raphaelzana.central_fatec.domain.enums.TipoObjeto;

@Entity
public class Objeto implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	private String descricao;
	private String local;
	private Date data;
	
	private Integer tipo;
	
	public Objeto() {}

	public Objeto(Integer id, String descricao, String local, Date data, TipoObjeto tipo) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.local = local;
		this.data = data;
		this.tipo = (tipo == null) ? null : tipo.getId();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Integer getTipo() {
		return tipo;
	}

	public void setTipo(Integer tipo) {
		this.tipo = tipo;
	}
	
	
	
	

}
