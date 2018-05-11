package edu.usal.negocio.dominio;

import java.util.Date;


public class Cliente {

	private String nombre , apellido, dni, cuit ,email;
	private Date fecNac;
	private Telefono tel;
	private PasajeroFrecuente pf;
	private Direccion dir;
	

	public Cliente() {
	}
	
	public Direccion getDir() {
		return dir;
	}

	public void setDir(Direccion dir) {
		this.dir = dir;
	}
	
	public Telefono getTel() {
		return tel;
	}
	public void setTel(Telefono tel) {
		this.tel = tel;
	}
	public PasajeroFrecuente getPf() {
		return pf;
	}
	public void setPf(PasajeroFrecuente pf) {
		this.pf = pf;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getCuit() {
		return cuit;
	}
	public void setCuit(String cuit) {
		this.cuit = cuit;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getFecNac() {
		return fecNac;
	}
	public void setFecNac(Date fecNac) {
		this.fecNac = fecNac;
	}
	public Cliente(String nombre, String apellido, String dni, String cuit, String email, Date fecNac, Telefono tel, PasajeroFrecuente pf, Direccion dir) {
		
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.cuit = cuit;
		this.email = email;
		this.fecNac = fecNac;
		this.tel = tel;
		this.pf = pf;
		this.dir = dir;
	}
	 
}
