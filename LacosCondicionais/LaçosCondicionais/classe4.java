package LaçosCondicionais;

import java.util.Scanner;

//Faça um programa em que permita a entrada de um número qualquer e exiba se este número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for ímpar exiba o número elevado ao quadrado.

public class classe4 {
	public static void main(String args[]) { 
		Scanner ler = new Scanner(System.in);
		int numero,x;
		
		System.out.println("Entre com um número: ");
		numero=ler.nextInt();
		
	if (numero%2==0) {
	System.out.println("O número é par e sua raiz quadrada é: "+Math.sqrt(numero));	
	}
	
	else {
		x=numero*numero;
	System.out.println("O número é impar e elevado ao quadrado é: "+x);
	}
	
	}
}
