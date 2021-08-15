package prog3.main;

import prog3.classes.Caixa;
import prog3.observer.Painel01;

public class ObserverMain {
	public static void main(String[] args) {
		Painel01 painel01 = new Painel01();

		Caixa caixa1 = new Caixa("Caixa 1");
		caixa1.registraInteressado(painel01);		
		caixa1.setStatus(true);
		
		Caixa caixa2 = new Caixa("Caixa 2");
		caixa2.registraInteressado(painel01);
	}
}
