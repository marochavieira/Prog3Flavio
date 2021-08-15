package prog3.main;

import prog3.classes.Bandeira1;
import prog3.classes.Bandeira2;
import prog3.classes.Taximetro;

public class TaxiMain {

	public static void main(String[] args) {
		Bandeira1 bandeira1 = new Bandeira1();
		Taximetro taximetro = new Taximetro(bandeira1);
		taximetro.setBandeira(bandeira1);
		System.out.println("Valor da corrida com bandeira 1: "+ taximetro.calculaCorrida(2.0));
		taximetro.setBandeira(new Bandeira2());
		System.out.println("O valor da corrida com bandeira 2: "	+ taximetro.calculaCorrida(2.0));
	}
}
