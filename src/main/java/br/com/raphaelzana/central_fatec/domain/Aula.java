package br.com.raphaelzana.central_fatec.domain;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Aula  implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private AulaPK id = new AulaPK();
	private Sala sala;
	
	private String dia;
	private String horario;
	
	public Aula() {}

	public Aula(Periodo periodo, Disciplina disciplina, Sala sala, String dia, String horario) {
		super();
		id.setPeriodo(periodo);
		id.setDisciplina(disciplina);
		this.sala = sala;
		this.dia = dia;
		this.horario = horario;
	}


	public Periodo getPeriodo() {
		return id.getPeriodo();
	}


	public Disciplina getDisciplina() {
		return id.getDisciplina();
	}

	public AulaPK getId() {
		return id;
	}

	public void setId(AulaPK id) {
		this.id = id;
	}

	public Sala getSala() {
		return sala;
	}

	public void setSala(Sala sala) {
		this.sala = sala;
	}

	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
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
		Aula other = (Aula) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}	
	
}
