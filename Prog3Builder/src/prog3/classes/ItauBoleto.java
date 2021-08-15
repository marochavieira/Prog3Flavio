package prog3.classes;

import java.util.Calendar;

import prog3.interfaces.Boleto;

public class ItauBoleto implements Boleto {

	private String sacado;
	private int nossoNro;
	private Calendar vencimento;
	private double valor;
	private String cedente;

	public ItauBoleto(String sacado, String cedente, double valor,
			Calendar vencimento, int nossoNro) {
	this.sacado =sacado;
	this.cedente = cedente; 
	this.valor = valor; 
	this.vencimento = vencimento; 
	this.nossoNro = nossoNro;
	}

	@Override
	public String getSacado() {
		// TODO Auto-generated method stub
		return sacado;
	}

	@Override
	public String getCedente() {
		// TODO Auto-generated method stub
		return cedente;
	}

	@Override
	public Calendar getVencimento() {
		// TODO Auto-generated method stub
		return vencimento;
	}

	@Override
	public double getValor() {
		// TODO Auto-generated method stub
		return valor;
	}

	@Override
	public String toString() {
		return "ItauBoleto [sacado=" + sacado + ", nossoNro=" + nossoNro
				+ ", vencimento=" + vencimento.getTime() + ", valor=" + valor
				+ ", cedente=" + cedente + "]";
	}
}
