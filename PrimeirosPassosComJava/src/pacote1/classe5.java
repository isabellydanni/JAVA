package pacote1;

//Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste aluno. Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5, respectivamente.

import java.util.Scanner;

public class classe5 {
	public static void main (String args[])
	{
	Scanner ler = new Scanner (System.in);
	int nota1,nota2,nota3,mp;
	System.out.println("Entre com a primeira nota:  ");
		nota1 = ler.nextInt();
	System.out.println("Entre com a segunda nota:  ");
		nota2 = ler.nextInt();
	System.out.println("Entre com a terceira nota:  ");
		nota3 = ler.nextInt();
	
	mp=(nota1*2+nota2*3+nota3*5)/10;
	
	System.out.println("\nMédia ponderada: "+mp);
	
	}
}
