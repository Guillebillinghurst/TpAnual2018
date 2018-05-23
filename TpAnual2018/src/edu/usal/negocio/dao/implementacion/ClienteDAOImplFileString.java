package edu.usal.negocio.dao.implementacion;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import edu.usal.negocio.dao.interfaces.*;
import edu.usal.negocio.dominio.*;


public class ClienteDAOImplFileString implements ClienteDAO{
	
	private File file;
	private FileWriter fw;
	private BufferedWriter bw;
	private Scanner sc;
	

	public void addCliente(Cliente cliente) throws FileNotFoundException, IOException {
		file = new File("C:\\Archivos\\Clientes.dat");
		fw = new FileWriter(file, true);
		bw = new BufferedWriter(fw);
		bw.write(this.ClienteToString(cliente));
		bw.close();
	}


	public void updateCliente(Cliente cliente) throws FileNotFoundException, IOException {
		
	}

	
	public void deleteCliente(Cliente cliente) throws FileNotFoundException, IOException {
		
	}

	@Override
	public List<Cliente> getAllCliente() throws FileNotFoundException, IOException {
		List<Cliente> list = new ArrayList<Cliente>();
		file = new File("C:\\Archivos\\Clientes.dat");
		sc = new Scanner(file);
		while(sc.hasNextLine()){
			list.add(StringToCliente(sc.nextLine()));
		}
		
		return list;
	}
	
	private static String ClienteToString(Cliente cliente){
		return cliente.getDni() + ";" + cliente.getNombre() + ";" + cliente.getApellido() + ";" + cliente.getCuit() + ";" + cliente.getEmail() + ";" + cliente.getFecNac() + ";" + cliente.getTel() + ";" + cliente.getPf() + ";" + cliente.getDir() + "\n";
		
	}
	
	private static Cliente StringToCliente(String strCliente){
		String[] straux = strCliente.split(";");
		Cliente cliente = new Cliente();
		cliente.setDni(straux[0]);
		cliente.setNombre(straux[1]);
		cliente.setApellido(straux[2]);
		cliente.setCuit(straux[3]);
		cliente.setEmail(straux[4]);
		cliente.setFecNac(Date.valueOf(straux[5])); //MAL
		Telefono tel = new Telefono((straux[6]),straux[7],straux[8]);
		cliente.setTel(tel);
		PasajeroFrecuente pf = new PasajeroFrecuente(straux[9],straux[10]);
		cliente.setPf(pf);
		Direccion dir = new Direccion(straux[11],straux[12],straux[13],straux[14],straux[15],straux[16]);
		cliente.setDir(dir);
		
		
		return cliente;
		
	}
}
