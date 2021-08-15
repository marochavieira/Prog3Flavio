package prog3.gerador;

import java.util.Calendar;

import prog3.interfaces.Boleto;
import prog3.interfaces.BoletoBuilder;

public class GeneratorBoleto {

	private BoletoBuilder boletoBuilder;

	public GeneratorBoleto(BoletoBuilder boletoBuilder) {
		super();
		this.boletoBuilder = boletoBuilder;
	} 
	public Boleto geraBoleto(){

		boletoBuilder.buildSacado("Marco Aurelio");
		boletoBuilder.buildCedente("Ferrari");
		boletoBuilder.buildValor(2000.00);
		Calendar vencimento = Calendar.getInstance();
		vencimento.add(Calendar.DATE, 20);
		boletoBuilder.buildVencimento(vencimento);
		boletoBuilder.buildNossoNro(1234);

		Boleto boleto = boletoBuilder.getBoleto();
		return boleto;
	}
}