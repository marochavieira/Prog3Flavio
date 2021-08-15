package prog3.facade;

import prog3.classes.CiaAerea;
import prog3.classes.Cliente;
import prog3.classes.Hotel;

public class AgenciaFacade {

	private Hotel hotel; 
	private CiaAerea ciaAerea;
	
	public AgenciaFacade(Hotel hotel, CiaAerea ciaAerea) {
		super();
		this.hotel = hotel;
		this.ciaAerea = ciaAerea;
	}

	public void registraViagem(Cliente cliente){
		this.hotel.registraReserva(cliente.getNome(),cliente.getSobreNome());
		this.ciaAerea.reservaVoo(cliente.getNome(),cliente.getSobreNome());
	}

	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

	public CiaAerea getCiaAerea() {
		return ciaAerea;
	}

	public void setCiaAerea(CiaAerea ciaAerea) {
		this.ciaAerea = ciaAerea;
	}
}
