package pacote2;
//Implemente a classe Administrador como subclasse da classe pessoa. Um determinado
//administrador tem como atributos da classe Pessoa e também os atributos próprios como
//ajudaDeCusto (ajudas referentes a viagens, estadias).

public class administrador extends pessoa {
	private String ajudaDeCusto;

	public administrador(String nome, String profissao, String ajudaDeCusto) {
		super(nome, profissao);
		this.ajudaDeCusto = ajudaDeCusto;
	}

	public String getAjudaDeCusto() {
		return ajudaDeCusto;
	}

	public void setAjudaDeCusto(String ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}

}
