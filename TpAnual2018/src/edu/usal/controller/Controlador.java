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

public class Controlador {	
}
// TODO ESTO SE HACE DESDE ControladorCliente
	/*		private ClienteDAO factory;
	private ArrayList<Cliente> AP = new ArrayList<Cliente>();
	
	public Controlador(){
		factory = ClienteFactory.getClienteDAO("fileStream");
		//AP = (ArrayList<Cliente>) factory.getAllCliente();
	}
	public void addCliente() {
	Cliente P = new Cliente();
	P.setNombre(IOGeneral.leerLinea("Ingrese nombre:")); 
	P.setApellido(IOGeneral.leerLinea("Ingrese Apellido"));
}
}
	

	
	int opcion;
	boolean salir=false;
	Scanner sc = new Scanner(System.in);
	Menu mn = new Menu();
	Cliente cliente = new Cliente();
	ClienteDAOImplFileStream cdao = new ClienteDAOImplFileStream();
	
	
	
	
	
	while(salir=false){
		mn.presentarmenu();
		switch(opcion){
		case 1:
			opcion=mn.presentarcliente();
				switch(this.opcion){
				case 1:
					cliente.setNombre(sc.nextLine());
					cliente.setApellido(sc.nextLine());
					cliente.setDni(sc.nextLine());
					cliente.setCuit(sc.nextLine());
					cliente.setEmail(sc.nextLine());
					cliente.setFecNac((sc.nextLine()));
					cdao.addCliente(cliente);
				}
		case 2:
			opcion=mn.presentarlinea();
		case 3:
			opcion=mn.presentarvuelo();
		case 4:
			opcion=mn.presentarventa();
		}
		salir=true;
	}
	
}*/

