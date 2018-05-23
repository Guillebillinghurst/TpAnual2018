package edu.usal.controller;

import java.util.Scanner;

import edu.usal.negocio.dao.implementacion.ClienteDAOImplFileStream;
import edu.usal.negocio.dominio.Cliente;
import edu.usal.presentacion.Menu;

public class Controlador {

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
	
}	
}
