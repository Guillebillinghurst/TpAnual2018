package edu.usal.negocio.dao.implementacion;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import edu.usal.negocio.dao.interfaces.ClienteDAO;
import edu.usal.negocio.dominio.Cliente;
import edu.usal.util.PropertiesUtil;


public class ClienteDAOImplFileStream implements ClienteDAO {

	private File file;
	private ObjectInputStream objInput;
	private ObjectOutputStream objOut;
	private FileOutputStream fileOut;
	private FileInputStream fileInput;

		public void addCliente(Cliente cliente) throws FileNotFoundException, IOException {
		//creamos una archivo y lo guardamos en una lista
			List<Cliente> lista = new ArrayList<Cliente>();
			this.file = new File(PropertiesUtil.getPathCliente());
			this.fileOut = new FileOutputStream(this.file, true);
			this.objOut = new ObjectOutputStream(fileOut);
			this.objOut.writeObject(lista);
			this.objOut.close();
		}
	
	public void updateCliente(Cliente cliente) throws FileNotFoundException, IOException {

	}

	public void deleteCliente(Cliente cliente) throws FileNotFoundException, IOException {

	}

	@Override
	public List<Cliente> getAllCliente() throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		return null;
	}

public List<Cliente> getAllClientes() throws FileNotFoundException, IOException { //Leemos la lista que creamos en el add
		
		this.file = new File (PropertiesUtil.getPathCliente());
		this.fileInput = new FileInputStream(this.file);
		this.objInput =  new ObjectInputStream(this.fileInput);
		
		try {
			List<Cliente> lista = (ArrayList<Cliente>) objInput.readObject();
			return lista;
		}catch (ClassNotFoundException e) {
			
		throw new RuntimeException(e.getMessage());
		}
	}
}


