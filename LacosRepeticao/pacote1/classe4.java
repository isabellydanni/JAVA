package pacote1;
//Crie um programa que leia um número do teclado até que encontre um número igual a zero. No final, mostre a soma dos números digitados.(DO...WHILE)

import java.util.Scanner;

public class classe4 {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		int x, soma = 0;
		System.out.println("Entre com um número: ");
		x = ler.nextInt();

		do {
			if (x > 0) {
				soma = soma + x;
			}
			x--;
		} while (x != 0);
		System.out.println("\nSoma dos números:  " + soma);
	}
}
