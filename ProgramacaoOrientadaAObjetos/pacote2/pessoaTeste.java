package pacote2;

public class pessoaTeste {
	public static void main(String args[]) {

		// classe pessoa
		pessoa a = new pessoa("Maria", "rua dos rodoviários 336 jardim Paulista", "gerente de vendas", 45567186, 32);
		a.imprimirInfo();

		pessoa b = new pessoa("\nCarla", "engenheira civil.");
		b.imprimirProfissao();

		pessoa c = new pessoa("\nPedro", 41402876, 19);
		c.imprimirIdade();

		// classe administrador
		administrador Adriana = new administrador("\nAdriana", "desenvolvedora", "1900");
		System.out.println(Adriana.getNome());
		System.out.println(Adriana.getProfissao());
		System.out.println(Adriana.getAjudaDeCusto());

		administrador Isadora = new administrador("\nIsadora", "arquiteta", "2200");
		System.out.println(Isadora.getNome());
		System.out.println(Isadora.getProfissao());
		System.out.println(Isadora.getAjudaDeCusto());

		// classe operario
		Operario Jose = new Operario("\nJose", 1000, 30);
		System.out.println(Jose.getNome());
		System.out.println(Jose.getValorProducao());
		Jose.imprimirOperario();

		Operario Marta = new Operario("\nMarta", 1500, 45);
		System.out.println(Marta.getNome());
		System.out.println(Marta.getValorProducao());
		Marta.imprimirOperario();
	}
}
