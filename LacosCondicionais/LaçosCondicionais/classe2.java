package La�osCondicionais;

import java.util.Scanner;

//Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.

public class classe2 {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		int intA, intB, intC, antigoNumero;
		System.out.println("Entre com o primeiro n�mero: ");
		intA = ler.nextInt();
		System.out.println("Entre com o segundo n�mero: ");
		intB = ler.nextInt();
		System.out.println("Entre com o terceiro n�mero: ");
		intC = ler.nextInt();

		if (intA <= intB && intA <= intC) {
			if (intB <= intC) {
				System.out.println("A ordem crescente dos valores �: " + intA + "," + intB + "," + intC);
			} else if (intB >= intC) {
				System.out.println("A ordem crescente dos valores �: " + intA + "," + intC + "," + intB);
			}
		} else if (intB <= intA && intB <= intC) {
			if (intA <= intC) {
				System.out.println("A ordem crescente dos valores �: " + intB + "," + intA + "," + intC);
			} else if (intA >= intC) {
				System.out.println("A ordem crescente dos valores �: " + intB + "," + intC + "," + intA);
			}
		} else if (intC <= intA && intC <= intB) {
			if (intA <= intB) {
				System.out.println("A ordem crescente dos valores �: " + intC + "," + intA + "," + intB);
			} else if (intA >= intB) {
				System.out.println("A ordem crescente dos valores �: " + intC + "," + intB + "," + intA);
			}
		}
	}
}
