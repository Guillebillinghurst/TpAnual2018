package edu.usal.negocio.dominio;

public class Aeropuerto {
	
	private String id, ciudad, provincia, pais;

	public Aeropuerto() {
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public Aeropuerto(String id, String ciudad, String provincia, String pais) {
		this.id = id;
		this.ciudad = ciudad;
		this.provincia = provincia;
		this.pais = pais;
	}
	
	

}
