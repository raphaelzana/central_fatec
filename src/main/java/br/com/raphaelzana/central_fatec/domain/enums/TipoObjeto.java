package br.com.raphaelzana.central_fatec.domain.enums;

public enum TipoObjeto {

	ACHADO(1,"Achado"),
	PERDIDO(2,"Perdido");

	private int id;
	private String descricao;
	private TipoObjeto(int id, String descricao) {
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
	
	public static TipoObjeto toEnum(Integer id) {
		if(id == null) {return null;}
		for(TipoObjeto x : TipoObjeto.values()) {
			if(id.equals(x.getId())) {
				return x;
			}
		}
		throw new IllegalArgumentException("Id inválido: " + id);
	}
	
}
