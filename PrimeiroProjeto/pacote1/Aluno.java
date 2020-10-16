package pacote1;

import java.util.Scanner;

public class Aluno extends Pessoa {
	private String turma;
	private String materias[];

	Scanner ler = new Scanner(System.in);

	// 0-hist�ria, 1-matem�tica, 2-f�sica, 3-gram�tica, 4-literatura, 5-sociologia
	private float[] notas = new float[6];

	public Aluno(String nome, int codigo, String senha, String turma) {
		super(nome, codigo, senha);
		this.turma = turma;
	}

	public void verNotas(Aluno mauricio, Aluno daysy) {
			System.out.println("\nSua nota= " + mauricio.getNotas());
	}

	public String getTurma() {
		return turma;
	}

	public void setTurma(String turma) {
		this.turma = turma;
	}

	public float[] getNotas() {
		return notas;
	}

	public void setNotas(float[] notas) {
		this.notas = notas;
	}
}