package edu.usal.negocio.dao.interfaces;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import edu.usal.negocio.dominio.Cliente;

public interface ClienteDAO {
	
	public void addCliente(Cliente cliente) throws FileNotFoundException, IOException;
	public void updateCliente(Cliente cliente)throws FileNotFoundException, IOException;
	public void deleteCliente(Cliente cliente)throws FileNotFoundException, IOException;
	public List<Cliente> getAllCliente()throws FileNotFoundException, IOException;
	static void ClienteToString(Cliente cliente){}
	static void StringToCliente(String strCliente){}
}