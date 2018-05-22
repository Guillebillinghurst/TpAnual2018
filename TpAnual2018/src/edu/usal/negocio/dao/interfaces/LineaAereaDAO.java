package edu.usal.negocio.dao.interfaces;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import edu.usal.negocio.dominio.LineaAerea;

public interface LineaAereaDAO {
	
	public void addLineaAerea(LineaAerea la) throws FileNotFoundException, IOException;
	public void updateLineaAerea(LineaAerea la)throws FileNotFoundException, IOException;
	public void deleteLineaAerea(LineaAerea la)throws FileNotFoundException, IOException;
	public List<LineaAerea> getAllLineaAerea()throws FileNotFoundException, IOException;
	static void LineaAereaToString(LineaAerea la){}
	static void StringToLineaAerea(String strLineaAerea){}
}
