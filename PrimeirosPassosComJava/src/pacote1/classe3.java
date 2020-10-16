package pacote1;

import java.util.Scanner;

public class classe3 {
	public static void main (String args[])
	{
	Scanner ler = new Scanner (System.in);
	int s,h,m,ts;
	System.out.println("Escreva o tempo em segundos:  ");
	ts = ler.nextInt();
		h =ts/3600;
	System.out.println("\nTempo em horas: "+h);
		m =ts/60;
	System.out.println("\nTempo em minutos: "+m);
		s =ts/1;
	System.out.println("\nTempo em segundos"+s);
	}
}