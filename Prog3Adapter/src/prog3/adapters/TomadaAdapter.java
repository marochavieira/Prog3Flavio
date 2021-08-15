package prog3.adapters;

import prog3.classes.Tomada;
import prog3.modelonovo.TomadaNova;

public class TomadaAdapter extends Tomada {
	private TomadaNova tomadaNova;
		
	public TomadaAdapter() {
	tomadaNova = new TomadaNova();	
	}

	@Override
	public void on() {		
	tomadaNova.on(true);
	}

	@Override
	public void off() {		
	tomadaNova.off(false);
	}	
}
