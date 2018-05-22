package edu.usal.negocio.dominio;

public class Direccion {
	
	private String Calle, Altura, Ciudad, CodigoPostal, Pais, Provincia;

	public String getCalle() {
		return Calle;
	}

	public void setCalle(String calle) {
		Calle = calle;
	}

	public String getAltura() {
		return Altura;
	}

	public void setAltura(String altura) {
		Altura = altura;
	}

	public String getCiudad() {
		return Ciudad;
	}

	public void setCiudad(String ciudad) {
		Ciudad = ciudad;
	}

	public String getCodigoPostal() {
		return CodigoPostal;
	}

	public void setCodigoPostal(String codigoPostal) {
		CodigoPostal = codigoPostal;
	}

	public String getPais() {
		return Pais;
	}

	public void setPais(String pais) {
		Pais = pais;
	}

	public String getProvincia() {
		return Provincia;
	}

	public void setProvincia(String provincia) {
		Provincia = provincia;
	}

	public Direccion() {
		
	}

	public Direccion(String calle, String altura, String ciudad, String codigoPostal, String pais, String provincia) {
		
		Calle = calle;
		Altura = altura;
		Ciudad = ciudad;
		CodigoPostal = codigoPostal;
		Pais = pais;
		Provincia = provincia;
	}
	
	
	
}
