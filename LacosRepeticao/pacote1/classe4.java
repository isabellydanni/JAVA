package pacote1;
//Crie um programa que leia um n�mero do teclado at� que encontre um n�mero igual a zero. No final, mostre a soma dos n�meros digitados.(DO...WHILE)

import java.util.Scanner;

public class classe4 {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		int x, soma = 0;
		System.out.println("Entre com um n�mero: ");
		x = ler.nextInt();

		do {
			if (x > 0) {
				soma = soma + x;
			}
			x--;
		} while (x != 0);
		System.out.println("\nSoma dos n�meros:  " + soma);
	}
}
