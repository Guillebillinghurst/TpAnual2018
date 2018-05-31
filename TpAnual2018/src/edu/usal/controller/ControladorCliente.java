package edu.usal.controller;
	import java.awt.List;
	import java.io.FileNotFoundException;
	import java.io.IOException;
	import java.util.ArrayList;
	import java.util.Scanner;
	import edu.usal.negocio.dao.factory.*;
	import edu.usal.negocio.dao.implementacion.ClienteDAOImplFileStream;
	import edu.usal.negocio.dao.interfaces.*;
	import edu.usal.negocio.dominio.Cliente;
	import edu.usal.negocio.dominio.*;
	import edu.usal.presentacion.Menu;
	import edu.usal.util.IOGeneral;



	public class ControladorCliente {
		
		public void addCliente() {
		Cliente P = new Cliente();
		P.setNombre(IOGeneral.leerLinea("Ingrese nombre:")); 
		P.setApellido(IOGeneral.leerLinea("Ingrese Apellido"));
	}
		public void consultaCliente() {

		}
}


