package edu.usal.presentacion;
import edu.usal.util.IOGeneral;
import java.util.Scanner;
import edu.usal.presentacion.*;

public class Menu {
	
	int opcion=0;
	Scanner sc = new Scanner(System.in);
	menuVentas venta = new menuVentas();
	menuCliente cliente = new menuCliente();
	menuVuelo vuelo = new menuVuelo();
	menuLinea linea = new menuLinea();


	public int menu() {
		
		int opcion = 0;
		boolean fin = false;
			
		while(!fin) {
			this.presentarmenu();
			opcion = IOGeneral.leerInt("Ingrese opcion:", "");
			
			if(opcion < 1 || opcion > 5) {
				System.out.println("Opcion invalida");
				continue;
			} else {
				switch(opcion) {
				case 1:
					cliente. menucliente();
				break;
				case 2:
					linea.presentarlinea();
				break;
				case 3:
					vuelo.presentarvuelo();
				break;
				case 4:
					venta.presentarventa();
				break;
				case 5:
					fin=true;
				}
			}	
		}
			
		return opcion;
	}
	
	
	private void presentarmenu (){
		System.out.println("1.Cliente");
		System.out.println("2.Linea Aerea");
		System.out.println("3.Vuelo");
		System.out.println("4.Ventas");
		System.out.println("5.Salir");
		}
	
	
}
