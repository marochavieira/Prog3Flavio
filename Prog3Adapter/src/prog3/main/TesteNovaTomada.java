package prog3.main;

import prog3.adapters.TomadaAdapter;
import prog3.classes.Tomada;

public class TesteNovaTomada {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Tomada tomada = new TomadaAdapter();
		//ligando a tomada
		tomada.on();
		//desligando a tomada
		tomada.off();
	}
}
