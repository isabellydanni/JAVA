package pacote1;

import java.util.Scanner;

public class Teste {
	static Scanner ler = new Scanner(System.in);

	public static void main(String[] args) {
		// Atribuindo mat�rias para o professor brendo, que est� sendo instanciado
		// Ordem de atributos para Professor: nome, c�digo, senha, mat�rias
		String[] materiasBrendo = new String[] { "sociologia", "matem�tica", "gram�tica" };
		Professor brendo = new Professor("Brendo", 1234, "senha", materiasBrendo);

		// Atribuindo mat�rias para a professora isabelly, que est� sendo instanciada
		String[] materiasIsa = new String[] { "hist�ria", "f�sica", "literatura" };
		Professor isabelly = new Professor("Isabelly", 4321, "padrao", materiasIsa);

		// Instanciando a aluna Daysy
		// Ordem de atributos para Aluno: nome, c�digo, senha, turma
		Aluno daysy = new Aluno("Daysy", 9876, "#TeamLorena", "7");

		// Instanciando o aluno Maur�cio
		Aluno mauricio = new Aluno("Maur�cio", 6789, "tesoureiroXD", "7");

		int cod = 0, opc = 0;

		do {
			cod = login(isabelly, brendo, daysy, mauricio);

			// execu��o dos menus dos professores
			if (cod == 1234)
				opc = brendo.menu();
			if (cod == 4321)
				opc = isabelly.menu();

			switch (opc) {
			case 1:
				if (cod == 1234)
					brendo.inserirNotas(mauricio, daysy);
				if (cod == 4321)
					isabelly.inserirNotas(mauricio, daysy);
				break;
			case 2:
				if (cod == 1234)
					brendo.verNotas(mauricio, daysy);
				if (cod == 4321)
					isabelly.verNotas(mauricio, daysy);
				break;
			}
		} while (opc != 0);
	}

	// Pergunta qual o tipo de usu�rio (Aluno ou Professor)
	public static int login(Professor isabelly, Professor brendo, Aluno daysy, Aluno mauricio) {
		int opc = 0, cod = 0;
		do {
			System.out.println("\nInsira...");
			System.out.println("1 para Professor");
			System.out.println("2 para Aluno");
			opc = ler.nextInt();
		} while (opc < 1 || opc > 2);

		if (opc == 1)
			cod = loginProf(isabelly, brendo, daysy, mauricio);
		if (opc == 2)
			cod = loginAluno(isabelly, brendo, daysy, mauricio);

		return cod;
	}

	// Faz o login do professor
	public static int loginProf(Professor isabelly, Professor brendo, Aluno daysy, Aluno mauricio) {
		String senha = "";
		int cod = 0;
		System.out.println("\n***************************");
		System.out.println("Espa�o virtual do PROFESSOR");
		System.out.println("***************************");

		System.out.println("Insira, a qualquer momento, o n�mero 0 para voltar � pagina de sele��o Aluno/Professor");

		System.out.println("\nInsira seus dados...");
		while (cod != brendo.getCodigo() && cod != isabelly.getCodigo()) {
			System.out.printf("Seu c�digo: ");
			cod = ler.nextInt();
			if (cod == 0)
				login(isabelly, brendo, daysy, mauricio);
			if (cod != brendo.getCodigo() && cod != isabelly.getCodigo()) {
				System.out.println("C�digo incorreto!\n");
				cod = 0;
			}
		}
		while (!senha.equals(brendo.getSenha()) && !senha.equals(isabelly.getSenha())) {
			System.out.printf("Sua senha: ");
			senha = ler.next();
			if (!senha.equals(brendo.getSenha()) && !senha.equals(isabelly.getSenha())) {
				System.out.println("Senha incorreta!\n");
			}
			if (senha == "0")
				login(isabelly, brendo, daysy, mauricio);
		}

		System.out.println("\nLogin efetuado com sucesso!\n");
		return cod;
	}

	// Faz o login do Aluno
	public static int loginAluno(Professor isabelly, Professor brendo, Aluno daysy, Aluno mauricio) {
		String senha = "";
		int cod = 0;
		System.out.println("\n***********************");
		System.out.println("Espa�o virtual do ALUNO");
		System.out.println("***********************");

		System.out.println("Insira, a qualquer momento, o n�mero 0 para voltar � pagina de sele��o Aluno/Professor");

		System.out.println("\nInsira seus dados...");
		while (cod != mauricio.getCodigo() && cod != daysy.getCodigo()) {
			System.out.printf("Seu c�digo: ");
			cod = ler.nextInt();
			if (cod == 0)
				login(isabelly, brendo, daysy, mauricio);
			if (cod != mauricio.getCodigo() && cod != daysy.getCodigo()) {
				System.out.println("C�digo incorreto!\n");
				cod = 0;
			}
		}
		Aluno aluno = null;
		while (!senha.equals(mauricio.getSenha()) && !senha.equals(daysy.getSenha())) {
			System.out.printf("Sua senha: ");
			senha = ler.next();

			String logado;
			if (senha.equals(mauricio.getSenha())) {
				logado = "Mauricio entrou\n";
				aluno = mauricio;
			} else if (senha.equals(daysy.getSenha())) {
				logado = "Daysy entrou\n";
				aluno = daysy;
			} else if (senha == "0")
				login(isabelly, brendo, daysy, mauricio);
		}
		System.out.println("\nLogin do " + aluno.getNome() + " efetuado com sucesso!\n");
		System.out.println(aluno.getNome() + ", suas notas s�o: ");
		float[] nota = new float[6];
		nota = aluno.getNotas();
		System.out.printf("Hist�ria: %.1f\nMatem�tica: %.1f\nF�sica: %.1f\nGram�tica: %.1f\nLiteratura: %.1f\nSociologia: %.1f\n\n",
				nota[0], nota[1], nota[2], nota[3], nota[4], nota[5]);

		return cod;
	}
}
