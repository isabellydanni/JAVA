package La�osCondicionais;

import java.util.Scanner;

//Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for �mpar exiba o n�mero elevado ao quadrado.

public class classe4 {
	public static void main(String args[]) { 
		Scanner ler = new Scanner(System.in);
		int numero,x;
		
		System.out.println("Entre com um n�mero: ");
		numero=ler.nextInt();
		
	if (numero%2==0) {
	System.out.println("O n�mero � par e sua raiz quadrada �: "+Math.sqrt(numero));	
	}
	
	else {
		x=numero*numero;
	System.out.println("O n�mero � impar e elevado ao quadrado �: "+x);
	}
	
	}
}
