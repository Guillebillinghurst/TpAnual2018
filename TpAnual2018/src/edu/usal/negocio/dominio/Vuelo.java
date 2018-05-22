package edu.usal.negocio.dominio;

import java.util.Date;

public class Vuelo {
	
	private int numerovuelo, cantidadasientos;
	private Aeropuerto aeropuertosalida;
	private Aeropuerto aeropuertollegada;
	private Date salida,llegada;
	private String duracion;
	
	public Vuelo() {
	
	}

	public int getNumerovuelo() {
		return numerovuelo;
	}

	public void setNumerovuelo(int numerovuelo) {
		this.numerovuelo = numerovuelo;
	}

	public int getCantidadasientos() {
		return cantidadasientos;
	}

	public void setCantidadasientos(int cantidadasientos) {
		this.cantidadasientos = cantidadasientos;
	}

	public Aeropuerto getAeropuertosalida() {
		return aeropuertosalida;
	}

	public void setAeropuertosalida(Aeropuerto aeropuertosalida) {
		this.aeropuertosalida = aeropuertosalida;
	}

	public Aeropuerto getAeropuertollegada() {
		return aeropuertollegada;
	}

	public void setAeropuertollegada(Aeropuerto aeropuertollegada) {
		this.aeropuertollegada = aeropuertollegada;
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

	public String getDuracion() {
		return duracion;
	}

	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}

	public Vuelo(int numerovuelo, int cantidadasientos, Aeropuerto aeropuertosalida, Aeropuerto aeropuertollegada,
			Date salida, Date llegada, String duracion) {
		this.numerovuelo = numerovuelo;
		this.cantidadasientos = cantidadasientos;
		this.aeropuertosalida = aeropuertosalida;
		this.aeropuertollegada = aeropuertollegada;
		this.salida = salida;
		this.llegada = llegada;
		this.duracion = duracion;
	}
	
	
}
