
public class Reacao {

	private int quantidadeDeA, quantidadeDeB, a, b, c;

	public Reacao(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public void adicionarA(int a) { // recebe valor de a
		this.quantidadeDeA = a;
	}

	public void adicionarB(int b) { // recebe valor de a
		this.quantidadeDeB = b;
	}

	public void agitar() { // agita
		for (int qa = this.quantidadeDeA, qb = this.quantidadeDeB; qa >= this.a
				&& qb >= this.b; qa -= a, qb -= b) {
			this.quantidadeDeA = quantidadeDeA - a;
			this.quantidadeDeB = quantidadeDeB - b;
			c++;
		}
	}

	public int getC() {
		return this.c;
	}
}
