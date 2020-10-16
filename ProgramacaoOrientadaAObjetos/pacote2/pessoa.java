package pacote2;
//Cria uma Classe Pessoa, contendo os atributos encapsulados, com seus respectivos seletores
//(getters) e modificadores (setters), e ainda o construtor padrão e pelo menos mais duas
//opções de construtores conforme sua percepção. Atributos: String nome; String endereço;
//String telefone;

public class pessoa {
	private String nome;
	private String endereço;
	private String profissao;
	private int telefone;
	private int idade;

	public pessoa(String nome, String endereço, String profissao, int telefone, int idade) {
		this.nome = nome;
		this.endereço = endereço;
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
		System.out.println(nome + " tem " + idade + " anos, mora na " + endereço + ", exerce a profissão de "
				+ profissao + " e possui o número de telefone " + telefone);
	}

	public void imprimirProfissao() {
		System.out.println(nome + " exerce a profissão de " + profissao);
	}

	public void imprimirIdade() {
		System.out.println(nome + " tem " + idade + " anos e possui o número de telefone " + telefone);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereço() {
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
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
