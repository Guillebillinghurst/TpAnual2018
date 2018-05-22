package edu.usal.negocio.dao.interfaces;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import edu.usal.negocio.dominio.Venta;

public interface VentaDAO {
	
	public void addVenta(Venta venta) throws FileNotFoundException, IOException;
	public void updateVenta(Venta venta)throws FileNotFoundException, IOException;
	public void deleteVenta(Venta venta)throws FileNotFoundException, IOException;
	public List<Venta> getAllVenta()throws FileNotFoundException, IOException;
	

}
