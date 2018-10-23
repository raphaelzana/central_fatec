package br.com.raphaelzana.central_fatec.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.com.raphaelzana.central_fatec.domain.enums.PeriodoCurso;

@Entity
public class Curso implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	private String nome;
	private Integer periodo;
	private Integer duracao;
	
	public Curso() {}

	public Curso(Integer id, String nome, PeriodoCurso periodo, Integer duracao) {
		super();
		this.setId(id);
		this.setNome(nome);
		this.duracao = duracao;
		this.periodo = (periodo == null) ? null : periodo.getId();
	}
	
	
	public PeriodoCurso getPeriodo() {
		return PeriodoCurso.toEnum(periodo);
	}

	public void setPeriodo(PeriodoCurso periodo) {
		this.periodo = periodo.getId();
	}

	public Integer getDuracao() {
		return duracao;
	}

	public void setDuracao(Integer duracao) {
		this.duracao = duracao;
	}

	public PeriodoCurso getTipo() {
		return PeriodoCurso.toEnum(periodo);
	}

	public void setTipo(PeriodoCurso tipo) {
		this.periodo = tipo.getId();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Curso other = (Curso) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	

}
