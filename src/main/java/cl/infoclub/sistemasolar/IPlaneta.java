package cl.infoclub.sistemasolar;

import java.util.ArrayList;

public interface IPlaneta {
	
	public String getNombre();
	public void setNombre(String nombre);
	
	public int getTamano();
	public void setTamano(int tamano);
	
	public int getDistanciaSol();
	public void setDistanciaSol(int distanciaSol);
	
	public ArrayList<Luna> getLunas();
	public void setLunas(Luna luna);

}
