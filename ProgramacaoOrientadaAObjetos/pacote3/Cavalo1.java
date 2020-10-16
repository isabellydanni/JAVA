package pacote3;

public class Cavalo1 extends Animal {
	public Cavalo1() {
		super("Cavalo ", 5);
	}

	public void som(int numSom) {
		System.out.println("Um Cavalo, ele está relinchando.");
	}

	public void movimento(int numMovimento) {
		System.out.println("ele também corre.");
	}
}
