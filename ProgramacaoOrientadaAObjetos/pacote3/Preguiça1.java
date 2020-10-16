package pacote3;

public class Preguiça1 extends Animal {
	public Preguiça1() {
		super("Preguiça ", 2);
	}

	public void som(int numSom) {
		System.out.println("Uma preguiça, ela está dormindo.");
	}

	public void movimento(int numMovimento) {
		System.out.println("ele também sobe nas árvores.");
	}

}
