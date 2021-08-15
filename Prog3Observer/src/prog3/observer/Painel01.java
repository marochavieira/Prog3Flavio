package prog3.observer;

import prog3.classes.Caixa;

public class Painel01 implements Observer {

	@Override
	public void notificaPainel(Caixa caixa) {
		System.out.println("O " + caixa.getNomeCaixa() + " está disponivel. Status alterado para " + caixa.isStatus());
	}

}
