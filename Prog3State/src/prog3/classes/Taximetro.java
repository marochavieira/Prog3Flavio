package prog3.classes;

import prog3.interfaces.state.Bandeira;

public class Taximetro {

	private Bandeira bandeira;

	public Taximetro(Bandeira bandeira) {
		super();
		this.bandeira = bandeira;
	}

	public Bandeira getBandeira() {
		return bandeira;
	}

	public void setBandeira(Bandeira bandeira) {
		this.bandeira = bandeira;
	} 

	public double calculaCorrida(double distancia){
		double totalCorrida = bandeira.calculoBandeira(distancia);
	return totalCorrida;
	}
}
