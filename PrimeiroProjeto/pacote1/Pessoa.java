package pacote1;

public class Pessoa {
	private String nome;
	private int codigo;
	private String senha;

	public Pessoa(String nome, int codigo, String senha) {
		this.nome = nome;
		this.codigo = codigo;
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
}
