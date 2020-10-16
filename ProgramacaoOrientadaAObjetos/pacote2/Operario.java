package pacote2;
//Implemente a classe Operario como subclasse da classe Pessoa. Um determinado oper�rio
//tem como atributos da classe Pessoa e tamb�m os atributos pr�prios como valorProducao
//(que corresponde ao valor monet�rio dos artigos efetivamente produzidos pelo oper�rio) e
//comissao (que corresponde � porcentagem do valorProducao que ser� adicionado ao
//vencimento base do oper�rio).

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
		System.out.println("Comiss�o de " + comissao + "% = " + x);
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
