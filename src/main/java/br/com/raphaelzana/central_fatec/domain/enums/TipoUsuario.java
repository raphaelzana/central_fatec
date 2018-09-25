package br.com.raphaelzana.central_fatec.domain.enums;

public enum TipoUsuario {
	
	ADMIN(1,"Administrador"),
	PROFESSOR(2,"Professor"),
	ALUNO(3,"Aluno");

	private int id;
	private String descricao;
	private TipoUsuario(int id, String descricao) {
		this.id = id;
		this.descricao = descricao;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public static TipoUsuario toEnum(Integer id) {
		if(id == null) {return null;}
		for(TipoUsuario x : TipoUsuario.values()) {
			if(id.equals(x.getId())) {
				return x;
			}
		}
		throw new IllegalArgumentException("Id inválido: " + id);
	}
	
}
