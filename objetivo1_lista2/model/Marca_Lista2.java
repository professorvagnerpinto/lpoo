package model;

public class Marca_Lista2 {
	private String descricao;

	public Marca_Lista2() {
		super();
	}

	public Marca_Lista2(String descricao) {
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
		return "Marca [descricao=" + descricao + "]";
	}
	
}
