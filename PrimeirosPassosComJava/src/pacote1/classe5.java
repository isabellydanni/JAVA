package pacote1;

//Fa�a um sistema que leia as 3 notas de um aluno e calcule a m�dia final deste aluno. Considerar que a m�dia � ponderada e que o peso das notas �: 2,3 e 5, respectivamente.

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
	
	System.out.println("\nM�dia ponderada: "+mp);
	
	}
}
