package pacote3;

public class Cachorro1 extends Animal {
	public Cachorro1() {
		super("Cachorro ", 11);
	}

	public void som(int numSom) {
		System.out.println("Um cachorro, ele est� latindo.");
	}

	public void movimento(int numMovimento) {
		System.out.println("ele tamb�m corre.");
	}
}
