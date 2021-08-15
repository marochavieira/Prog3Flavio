package prog3.classes;

import java.util.HashSet;
import java.util.Set;

import prog3.observer.Observer;

public class Caixa {
	private boolean status = false; 

	private Set<Observer> interessados = new HashSet<Observer>();
	private String nomeCaixa;
	
	public Caixa(String nomeCaixa) {
		this.nomeCaixa = nomeCaixa;
	}
	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;

		for(Observer interessado : interessados){
			interessado.notificaPainel(this);
		}
	}	
	
	public void registraInteressado(Observer interessado){
		this.interessados.add(interessado);
	}
	public String getNomeCaixa() {
		return nomeCaixa;
	}
	public void setNomeCaixa(String nomeCaixa) {
		this.nomeCaixa = nomeCaixa;
	}	
}
