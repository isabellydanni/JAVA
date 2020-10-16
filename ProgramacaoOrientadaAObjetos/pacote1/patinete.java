package pacote1;

public class patinete {
	private String rodas;
	private String cor;
	private boolean infAdul;
	private boolean eletrico;

	public patinete(String rodas, String cor, boolean infAdul, boolean eletrico) {
		this.rodas = rodas;
		this.cor = cor;
		this.infAdul = infAdul;
		this.eletrico = eletrico;
	}

	public void imprimirInfo() {
		String infAdult = new String();
		if (infAdul) {
			infAdult = "infaltil ";
		} else {
			infAdult = " adulto ";
		}
		String eeletrico = new String();
		if (eletrico) {
			eeletrico = "e é eletrico.";
		} else {
			eeletrico = "e não é eletrico.";
		}
		System.out.println("O patinete possui " + rodas + " rodas, é da cor " + cor + ", ele é" + infAdult + eeletrico);
	}

	public String getRodas() {
		return rodas;
	}

	public void setRodas(String rodas) {
		this.rodas = rodas;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public boolean isInfAdul() {
		return infAdul;
	}

	public void setInfAdul(boolean infAdul) {
		this.infAdul = infAdul;
	}

	public boolean isEletrico() {
		return eletrico;
	}

	public void setEletrico(boolean eletrico) {
		this.eletrico = eletrico;
	}
}
