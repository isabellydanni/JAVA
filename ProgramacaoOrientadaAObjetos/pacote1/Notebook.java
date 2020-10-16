package pacote1;

public class Notebook {
	private String processador;
	private boolean camera;
	private String marca;
	private String memoria;
	private String tela;

	public Notebook(String processador, boolean camera, String marca, String memoria, String tela) {
		this.processador = processador;
		this.camera = camera;
		this.marca = marca;
		this.memoria = memoria;
		this.tela = tela;
	}

	public void imprimirInfo() {
		String temCamera = new String();
		if (camera) {
			temCamera = " e possui câmera.";
		} else {
			temCamera = "e não possui câmera.";
		}
		System.out.println("Você possui um notebook com " + processador + " ,da marca " + marca + ", com memória de "
				+ memoria + "gb, tela de " + tela + " polegadas" + temCamera);
	}

	public String getProcessador() {
		return processador;
	}

	public void setProcessador(String processador) {
		this.processador = processador;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getMemoria() {
		return memoria;
	}

	public void setMemoria(String memoria) {
		this.memoria = memoria;
	}

	public String getTela() {
		return tela;
	}

	public void setTela(String tela) {
		this.tela = tela;
	}

	public boolean isCamera() {
		return camera;
	}

	public void setCamera(boolean camera) {
		this.camera = camera;
	}

}
