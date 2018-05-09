package edu.usal.negocio.dao.interfaces;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import edu.usal.negocio.dominio.Cliente;

public interface ClienteDAO {
	
	public void addPabellon(Cliente cliente) throws FileNotFoundException, IOException;
	public void updatePabellon(Cliente cliente)throws FileNotFoundException, IOException;
	public void deletePabellon(Cliente cliente)throws FileNotFoundException, IOException;
	public List<Cliente> getAllCliente()throws FileNotFoundException, IOException;
	
}