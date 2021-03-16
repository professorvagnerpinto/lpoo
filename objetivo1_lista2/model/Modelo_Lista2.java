package model;

public class Modelo_Lista2 {
	private String descricao;

	public Modelo_Lista2() {
		super();
	}

	public Modelo_Lista2(String descricao) {
		super();
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return "Modelo [descricao=" + descricao + "]";
	}
	
}
