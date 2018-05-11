package edu.usal.negocio.dao.factory;

import edu.usal.negocio.dao.implementacion.*;
import edu.usal.negocio.dao.interfaces.ClienteDAO;

public class ClienteFactory {
	
	public static ClienteDAO getClienteDAO(String datasource){
		if(datasource.equals("fileString")){
			return new ClienteDAOImplFileString();
		}else if(datasource.equals("fileStream")){
			return new ClienteDAOImplFileStream();
		}
		return null;
	}
}
