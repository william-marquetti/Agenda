package br.ufes.inf.prog3.lista2.exercicio04.dominio;

public abstract class ContatoTelefone implements Contato {

	private String nome;
	private String contato;
	private String tipo;

	public ContatoTelefone(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String getNome() {
		return nome;
	}

	@Override
	public String getContato() {
		return contato;
	}

	@Override
	public String getTipo() {
		return tipo;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
