package LaçosCondicionais;

import java.util.Scanner;

//Faça um programa que entre com três números e coloque em ordem crescente.

public class classe2 {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		int intA, intB, intC, antigoNumero;
		System.out.println("Entre com o primeiro número: ");
		intA = ler.nextInt();
		System.out.println("Entre com o segundo número: ");
		intB = ler.nextInt();
		System.out.println("Entre com o terceiro número: ");
		intC = ler.nextInt();

		if (intA <= intB && intA <= intC) {
			if (intB <= intC) {
				System.out.println("A ordem crescente dos valores é: " + intA + "," + intB + "," + intC);
			} else if (intB >= intC) {
				System.out.println("A ordem crescente dos valores é: " + intA + "," + intC + "," + intB);
			}
		} else if (intB <= intA && intB <= intC) {
			if (intA <= intC) {
				System.out.println("A ordem crescente dos valores é: " + intB + "," + intA + "," + intC);
			} else if (intA >= intC) {
				System.out.println("A ordem crescente dos valores é: " + intB + "," + intC + "," + intA);
			}
		} else if (intC <= intA && intC <= intB) {
			if (intA <= intB) {
				System.out.println("A ordem crescente dos valores é: " + intC + "," + intA + "," + intB);
			} else if (intA >= intB) {
				System.out.println("A ordem crescente dos valores é: " + intC + "," + intB + "," + intA);
			}
		}
	}
}
