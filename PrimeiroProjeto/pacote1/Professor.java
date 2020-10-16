package pacote1;

import java.util.Scanner;

public class Professor extends Pessoa {
	private String materias[];
	private String turmas[];
	Scanner ler = new Scanner(System.in);

	public Professor(String nome, int codigo, String senha, String[] materias) {
		super(nome, codigo, senha);
		this.materias = materias;
	}

	public int menu() {
		int opc = 0;
		System.out.println("====================");
		System.out.println("Menu dos PROFESSORES");
		System.out.println("====================");

		do {
			System.out.println("\nInsira...");
			System.out.println("0 - sair");
			System.out.println("1 - inserir notas");
			opc = ler.nextInt();

			if (opc < 0 || opc > 1)
				System.out.println("Comando incorreto!");
		} while (opc < 0 || opc > 1);
		return opc;
	}

	public void inserirNotas(Aluno mauricio, Aluno daysy) {
		int opcm = 0, opca = 0, voltarNotas = 0;
		float[] nota = new float[6];
		do {
			System.out.println("\nSelecione a matéria para avaliar:");
			System.out.println("1--Sociologia\n2--Matemática\n3--Gramática\n4--História\n5--Física\n6--Literatura");
			opcm = ler.nextInt();
		} while (opcm < 1 || opcm > 6);
		System.out.println();

		do {
			System.out.println("Selecione el alune para atribuir nota:");
			System.out.printf("1 -- %s\n2 -- %s\n", mauricio.getNome(), daysy.getNome());
			opca = ler.nextInt();
		} while (opca == 0);

		System.out.println("Insira a nota del alune");
		if (opca == 1) {
			nota = mauricio.getNotas();
			nota[(opcm - 1)] = ler.nextFloat();
			mauricio.setNotas(nota);
		}
		if (opca == 2) {
			nota = daysy.getNotas();
			nota[(opcm - 1)] = ler.nextFloat();
			daysy.setNotas(nota);
		}
		System.out.println("Se deseja atribuir mais notas digite 3, senão digite 0 ");
		voltarNotas = ler.nextInt();
		if (voltarNotas == 3) {
			inserirNotas(mauricio, daysy);
		}
		return;
	}

	public void verNotas(Aluno mauricio, Aluno daysy) {

	}

	public String getMaterias() {
		String concatenador = "";
		int cont = this.materias.length;

		for (int i = 0; i < cont; i++) {
			concatenador += this.materias[i];
			if (i < (cont - 1))
				concatenador += ", ";
		}

		return concatenador;
	}

	public void setMaterias(String[] materias) {
		this.materias = materias;
	}

	public String[] getTurmas() {
		return turmas;
	}

	public void setTurmas(String[] turmas) {
		this.turmas = turmas;
	}
}
