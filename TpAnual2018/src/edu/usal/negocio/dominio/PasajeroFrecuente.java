package edu.usal.negocio.dominio;

public class PasajeroFrecuente {
	
	private String numero,categoria;

	public PasajeroFrecuente() {
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public PasajeroFrecuente(String numero, String categoria) {
		this.numero = numero;
		this.categoria = categoria;
	}
	
	

}
