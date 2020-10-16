package pacote2;
//Implemente a classe Operario como subclasse da classe Pessoa. Um determinado operário
//tem como atributos da classe Pessoa e também os atributos próprios como valorProducao
//(que corresponde ao valor monetário dos artigos efetivamente produzidos pelo operário) e
//comissao (que corresponde à porcentagem do valorProducao que será adicionado ao
//vencimento base do operário).

public class Operario extends pessoa {
	private int valorProducao;
	private int comissao;

	public Operario(String nome, int valorProducao, int comissao) {
		super(nome);
		this.valorProducao = valorProducao;
		this.comissao = comissao;
	}

	public void imprimirOperario() {
		int x;
		x = (this.valorProducao * this.comissao) / 100;
		System.out.println("Comissão de " + comissao + "% = " + x);
	}

	public int getValorProducao() {
		return valorProducao;
	}

	public void setValorProducao(int valorProducao) {
		this.valorProducao = valorProducao;
	}

	public int getComissao() {
		return comissao;
	}

	public void setComissao(int comissao) {
		this.comissao = comissao;
	}

}
