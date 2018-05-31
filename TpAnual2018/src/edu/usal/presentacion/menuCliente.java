package edu.usal.presentacion;

import java.io.FileNotFoundException;
import java.io.IOException;

import edu.usal.controller.*;
import edu.usal.negocio.dao.interfaces.*;
import edu.usal.util.IOGeneral;

public class menuCliente {
	ControladorCliente mn = new ControladorCliente();
	private void presentarcliente(){
		System.out.println("CLIENTES:");
		System.out.println("1.Alta");
		System.out.println("2.Baja");
		System.out.println("3.Consulta");
		System.out.println("4.Modificacion");
		System.out.println("5.Salir");
		}
	

	public int menucliente() {
		
		int opcion = 0;
		boolean fin = false;
			
		while(!fin) {
			this.presentarcliente();
			opcion = IOGeneral.leerInt("Ingrese opcion:", "");
			
			if(opcion < 1 || opcion > 5) {
				System.out.println("Opcion invalida");
				continue;
			} else {
				switch(opcion) {
				case 1:
					mn.addCliente();
					break;
			/*	case 2:
					mn.addCliente();
				break;
				case 3:
					mn.addCliente();
				break;
				case 4:
					mn.addCliente();
				break;*/
				case 5:
					fin=true;
						}
					}	
				}
		return opcion;
		}
}
