package edu.usal.negocio.dominio;

import java.util.Date;

public class Venta {
	
	private Cliente cliente;
	private Vuelo vuelo;
	private LineaAerea aerolinea;
	private Date salida, llegada;
	private String formadepago;
	
	public Venta() {
	
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Vuelo getVuelo() {
		return vuelo;
	}

	public void setVuelo(Vuelo vuelo) {
		this.vuelo = vuelo;
	}

	public LineaAerea getAerolinea() {
		return aerolinea;
	}

	public void setAerolinea(LineaAerea aerolinea) {
		this.aerolinea = aerolinea;
	}

	public Date getSalida() {
		return salida;
	}

	public void setSalida(Date salida) {
		this.salida = salida;
	}

	public Date getLlegada() {
		return llegada;
	}

	public void setLlegada(Date llegada) {
		this.llegada = llegada;
	}

	public String getFormadepago() {
		return formadepago;
	}

	public void setFormadepago(String formadepago) {
		this.formadepago = formadepago;
	}

	public Venta(Cliente cliente, Vuelo vuelo, LineaAerea aerolinea, Date salida, Date llegada, String formadepago) {
		this.cliente = cliente;
		this.vuelo = vuelo;
		this.aerolinea = aerolinea;
		this.salida = salida;
		this.llegada = llegada;
		this.formadepago = formadepago;
	}
	
	
}
