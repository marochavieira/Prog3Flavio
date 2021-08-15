package prog3.classes;

import prog3.interfaces.state.Bandeira;

public class Bandeira2 implements Bandeira {

	@Override
	public double calculoBandeira(double distancia) {
		double total = distancia * 3.0 + 1.0;
		return total;
	}
}
