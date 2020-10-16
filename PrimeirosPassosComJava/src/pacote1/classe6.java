package pacote1;

//Construa um programa em c que, tendo como dados de entrada dois pontos quaisquer no plano, P(x1, y1) e P(x2, y2), escreva a distância entre eles.

import java.util.Scanner;

public class classe6 {
	public static void main (String args[])
	{
	Scanner ler = new Scanner (System.in);
	int x1,y1,x2,y2,t1,t2;
	
	System.out.println("Entre com o ponto x1:  ");
		x1 = ler.nextInt();
	System.out.println("Entre com o ponto y1:  ");
		y1 = ler.nextInt();
	System.out.println("Entre com o ponto x2:  ");
		x2 = ler.nextInt();
	System.out.println("Entre com o ponto y2:  ");
		y2 = ler.nextInt();
	t1= (x2-x1)*(x2-x1);
	t2= (y2-y1)*(y2-y1)+t1;
	System.out.println("\nDistância entre os pontos igual a:  "+Math.sqrt(t2));
	
		
		
	}
}
