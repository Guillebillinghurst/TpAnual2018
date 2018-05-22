package edu.usal.negocio.dao.factory;

import edu.usal.negocio.dao.implementacion.LineaAereaDAOImplFileString;
import edu.usal.negocio.dao.implementacion.LineaAereaDAOImplFileStream;
import edu.usal.negocio.dao.interfaces.LineaAereaDAO;

public class LineaAereaFactory {
	public static LineaAereaDAO getLineaAereaDAO(String datasource){
		if(datasource.equals("fileString")){
			return new LineaAereaDAOImplFileString();
		}else if(datasource.equals("fileStream")){
			return new LineaAereaDAOImplFileStream();
		}
		return null;
	}

}
