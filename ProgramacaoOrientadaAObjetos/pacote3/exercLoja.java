package pacote3;
/*Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá
trabalhar com Collection do tipo List do Java para manipular os dados desse estoque, o
programa deverá atender as seguintes funcionalidades:
*Armazenar dados da List   *Remover dados da list;   *Atualizar dados da list.
*Apresentar todos os dados da list.*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class exercLoja {

	public static void main(String[] args) {

		// populando o array
		Collection<String> lista = new ArrayList();
		lista.add("papel");
		lista.add("lápis");
		lista.add("tinta");
		lista.add("canetas");
		lista.add("cadeiras");

		System.out.println("Lista do estoque: " + lista);

		// removendo um item
		lista.remove("papel");

		System.out.println("\nLista atualizada pela primeira vez: " + lista);

		// atualizando lista
		Collection<String> lista2 = Arrays.asList("mesas", "pincéis");
		lista.addAll(lista2);

		System.out.println("\nLista atualizada pela segunda vez: " + lista);
	}
}
