package edu.usal.negocio.dominio;

public class LineaAerea {

	String NombreAerolinea, Alianza;
	Vuelo vuelo;
	
	public LineaAerea() {
	}

	public String getNombreAerolinea() {
		return NombreAerolinea;
	}

	public void setNombreAerolinea(String nombreAerolinea) {
		NombreAerolinea = nombreAerolinea;
	}

	public String getAlianza() {
		return Alianza;
	}

	public void setAlianza(String alianza) {
		Alianza = alianza;
	}

	public Vuelo getVuelo() {
		return vuelo;
	}

	public void setVuelo(Vuelo vuelo) {
		this.vuelo = vuelo;
	}

	public LineaAerea(String nombreAerolinea, String alianza, Vuelo vuelo) {
		NombreAerolinea = nombreAerolinea;
		Alianza = alianza;
		this.vuelo = vuelo;
	}
	
	
	
}
