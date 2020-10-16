package pacote1;

public class avião {
	private String lugares;
	private String motor;
	private String modelo;
	private boolean paraquedas;

	public avião(String lugares, String motor, String modelo, boolean paraquedas) {
		this.lugares = lugares;
		this.motor = motor;
		this.modelo = modelo;
		this.paraquedas = paraquedas;
	}

	public void imprimirInfo() {
		String temparaquedas = new String();
		if (paraquedas) {
			temparaquedas = " e possui paraquedas individuais.";
		} else {
			temparaquedas = "e não possui paraquedas individuais.";
		}
		System.out.println(
				"O avião possui " + lugares + " lugares, motor " + motor + ", do modelo " + modelo + temparaquedas);
	}

	public String getLugares() {
		return lugares;
	}

	public void setLugares(String lugares) {
		this.lugares = lugares;
	}

	public String getMotor() {
		return motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public boolean isParaquedas() {
		return paraquedas;
	}

	public void setParaquedas(boolean paraquedas) {
		this.paraquedas = paraquedas;
	}

}
