package edu.usal.presentacion;

import java.util.Scanner;

public class Menu {
	
	int opcion=0;
	Scanner sc = new Scanner(System.in);
	
	public int presentarmenu (){
		System.out.println("Ingrese una opcion:");
		System.out.println("1.Cliente");
		System.out.println("2.Linea Aerea");
		System.out.println("3.Vuelo");
		System.out.println("4.Ventas");
		opcion=sc.nextInt();
		return opcion;
	}
	
	public int presentarcliente(){
		System.out.println("Ingrese una opcion:");
		System.out.println("1.Alta");
		System.out.println("2.Baja");
		System.out.println("3.Consulta");
		System.out.println("4.Modificacion");
		opcion=sc.nextInt();
		return opcion;
	}
	public int presentarlinea(){
		System.out.println("Ingrese una opcion:");
		System.out.println("1.Alta");
		System.out.println("2.Baja");
		System.out.println("3.Consulta");
		System.out.println("4.Modificacion");
		opcion=sc.nextInt();
		return opcion;
	}
	public int presentarvuelo(){
		System.out.println("Ingrese una opcion:");
		System.out.println("1.Alta");
		System.out.println("2.Baja");
		System.out.println("3.Consulta");
		System.out.println("4.Modificacion");
		opcion=sc.nextInt();
		return opcion;
	}
	public int presentarventa(){
		System.out.println("Ingrese una opcion:");
		System.out.println("1.Alta");
		System.out.println("2.Baja");
		System.out.println("3.Consulta");
		System.out.println("4.Modificacion");
		opcion=sc.nextInt();
		return opcion;
	}
}
