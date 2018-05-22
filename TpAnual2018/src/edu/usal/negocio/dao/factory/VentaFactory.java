package edu.usal.negocio.dao.factory;

import edu.usal.negocio.dao.implementacion.VentaDAOImplFileStream;
import edu.usal.negocio.dao.implementacion.VentaDAOImplFileString;
import edu.usal.negocio.dao.interfaces.VentaDAO;

public class VentaFactory {
	public static VentaDAO getVentaDAO(String datasource){
		if(datasource.equals("fileString")){
			return new VentaDAOImplFileString();
		}else if(datasource.equals("fileStream")){
			return new VentaDAOImplFileStream();
		}
		return null;
	}
}
