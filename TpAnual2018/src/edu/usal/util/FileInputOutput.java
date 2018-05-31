package edu.usal.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class FileInputOutput {

	private String nombreArchivo;
	
	public FileInputOutput() {
		
	}
	
	public FileInputOutput(String nombreArchivo) {
		this.nombreArchivo = nombreArchivo;
	}
	
	public boolean escribirArchivo(Object obj) {
		File file = null;
		FileOutputStream fOut = null;
		ObjectOutputStream oOut = null;
		try {
			file = new File(this.nombreArchivo);
			if(!file.exists()) {
				file.createNewFile();
			}
			fOut = new FileOutputStream(file);
			oOut = new ObjectOutputStream(fOut);
			oOut.writeObject(obj);
		} catch(Exception e) {
		
			return false;
		
		} finally {
			try {
				if(oOut != null) {
					oOut.close();
				}
			} catch(Exception e) {
				
			}
			
			try{
				if(fOut != null) {
					fOut.close();
				}
			} catch (Exception e) {
				
			}			
		}
		
		return true;
	}
	
	
	public Object getListaByArchivo() {
		File file = null;
		FileInputStream fInput = null;
		ObjectInputStream oInput = null;
		Object obj = null;
		try {
			file = new File(this.nombreArchivo);
			if(!file.exists()) {
				return null;
			} 
			fInput = new FileInputStream(file);
			oInput = new ObjectInputStream(fInput);
			obj = oInput.readObject();			
		} catch(Exception e) {
		} finally {
			try {
				if(oInput !=  null) {
					oInput.close();
				}				
			} catch(Exception e) {
				
			}
			
			try {
				if(fInput != null) {
					fInput.close();
				}
			} catch(Exception e) {
				
			}
		}
		
		return obj;
	}
	
}
