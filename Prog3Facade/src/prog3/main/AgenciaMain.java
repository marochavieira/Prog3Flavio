package prog3.main;

import prog3.classes.CiaAerea;
import prog3.classes.Cliente;
import prog3.classes.Hotel;
import prog3.facade.AgenciaFacade;

public class AgenciaMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Cliente cliente = new Cliente("Marco Aurelio", "Vieira", 32);
		Hotel hotel = new Hotel("Aprovação", 150.00);
		CiaAerea ciaAerea = new CiaAerea("Va Com Deus");
		AgenciaFacade agencia = new AgenciaFacade(hotel, ciaAerea);
		agencia.registraViagem(cliente);
	}
}
