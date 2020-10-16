package pacote3;

public class AnimalTeste {
	public static void main(String args[]) {
		Cachorro1 cachorro = new Cachorro1();
		Cavalo1 cavalo = new Cavalo1();
		Preguiça1 preguiça = new Preguiça1();

		Animal animal = null;
		int n = (int) (Math.random() * 4.0);
		System.out.println(n);
		switch (n) {
		case 1:
			animal = cachorro;
			break;
		case 2:
			animal = cavalo;
			break;
		case 3:
			animal = preguiça;
			break;
		default:
			System.out.println("Erro na digitação...");
		}
		if (animal != null) {
			animal.som(1);
			animal.movimento(1);
		}
	}
}
