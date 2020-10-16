package pacote1;

import java.util.Scanner;

//*Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)

public class classe2 {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		int numero, contpar = 0, contimpar = 0;
		for (int x = 1; x <= 10; x++) {
			System.out.println("Entre com um número: ");
			numero = ler.nextInt();
			if (numero % 2 == 0) {
				contpar++;
			} else {
				contimpar++;
			}

		}
		System.out.println("\nQuantidade de números pares: " + contpar);
		System.out.println("\nQuantidade de números pares: " + contimpar);
	}
}
