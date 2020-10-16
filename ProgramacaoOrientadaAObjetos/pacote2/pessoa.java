package pacote2;
//Cria uma Classe Pessoa, contendo os atributos encapsulados, com seus respectivos seletores
//(getters) e modificadores (setters), e ainda o construtor padr�o e pelo menos mais duas
//op��es de construtores conforme sua percep��o. Atributos: String nome; String endere�o;
//String telefone;

public class pessoa {
	private String nome;
	private String endere�o;
	private String profissao;
	private int telefone;
	private int idade;

	public pessoa(String nome, String endere�o, String profissao, int telefone, int idade) {
		this.nome = nome;
		this.endere�o = endere�o;
		this.profissao = profissao;
		this.telefone = telefone;
		this.idade = idade;
	}

	public pessoa(String nome, String profissao) {
		this.nome = nome;
		this.profissao = profissao;
	}

	public pessoa(String nome, int telefone, int idade) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.idade = idade;
	}

	public pessoa(String nome) {
		super();
		this.nome = nome;
	}

	public void imprimirInfo() {
		System.out.println(nome + " tem " + idade + " anos, mora na " + endere�o + ", exerce a profiss�o de "
				+ profissao + " e possui o n�mero de telefone " + telefone);
	}

	public void imprimirProfissao() {
		System.out.println(nome + " exerce a profiss�o de " + profissao);
	}

	public void imprimirIdade() {
		System.out.println(nome + " tem " + idade + " anos e possui o n�mero de telefone " + telefone);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndere�o() {
		return endere�o;
	}

	public void setEndere�o(String endere�o) {
		this.endere�o = endere�o;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

}
