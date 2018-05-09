
package edu.usal.negocio.dominio;

import java.util.Date;

public class Pasaporte {
	
 	private String nro,pais,autoridad;
 	private Date fecEmi,fecVen;
 	
 	public Pasaporte(){
 	}
	public String getNro() {
		return nro;
	}
	public void setNro(String nro) {
		this.nro = nro;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getAutoridad() {
		return autoridad;
	}
	public void setAutoridad(String autoridad) {
		this.autoridad = autoridad;
	}
	public Date getFecEmi() {
		return fecEmi;
	}
	public void setFecEmi(Date fecEmi) {
		this.fecEmi = fecEmi;
	}
	public Date getFecVen() {
		return fecVen;
	}
	public void setFecVen(Date fecVen) {
		this.fecVen = fecVen;
	}
	
	public Pasaporte(String nro, String pais, String autoridad, Date fecEmi, Date fecVen) {
	
		this.nro = nro;
		this.pais = pais;
		this.autoridad = autoridad;
		this.fecEmi = fecEmi;
		this.fecVen = fecVen;
	}

 	
}
