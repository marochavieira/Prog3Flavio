package prog3.classes;

import prog3.interfaces.state.Bandeira;

public class Bandeira1 implements Bandeira {

	@Override
	public double calculoBandeira(double distancia) {		
		double total = distancia * 1.5 ;
		return total;
	}
}
