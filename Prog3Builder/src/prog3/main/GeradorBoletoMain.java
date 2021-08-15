package prog3.main;

import prog3.classes.ItauBoletoBuilder;
import prog3.gerador.GeneratorBoleto;
import prog3.interfaces.Boleto;
import prog3.interfaces.BoletoBuilder;

public class GeradorBoletoMain {
	public static void main(String[] args) {
		BoletoBuilder boletoBuilder = new ItauBoletoBuilder(); 
		GeneratorBoleto generatorBoleto = new GeneratorBoleto(boletoBuilder);
		Boleto boleto = generatorBoleto.geraBoleto();
		System.out.println(boleto);
	}
}
