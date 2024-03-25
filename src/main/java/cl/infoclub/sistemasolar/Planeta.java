package cl.infoclub.sistemasolar;

import java.util.ArrayList;

public class Planeta implements IPlaneta{
	private String nombre;
	private int tamano;
	private int distanciaSol;
	private ArrayList<Luna> lunas=new ArrayList<Luna>();
	
	public Planeta(String nombre,int tamano, int distanciaSol) {
		// TODO Auto-generated constructor stub
		this.nombre=nombre;
		this.tamano=tamano;
		this.distanciaSol=distanciaSol;
	}
	
	
	public String getNombre() {
		// TODO Auto-generated method stub
		return nombre;
	}
	public void setNombre(String nombre) {
		// TODO Auto-generated method stub
		this.nombre=nombre;
	}
	public int getTamano() {
		// TODO Auto-generated method stub
		return tamano;
	}
	public void setTamano(int tamano) {
		// TODO Auto-generated method stub
		this.tamano=tamano;
	}
	public int getDistanciaSol() {
		// TODO Auto-generated method stub
		return distanciaSol;
	}
	public void setDistanciaSol(int distanciaSol) {
		// TODO Auto-generated method stub
		this.distanciaSol=distanciaSol;
	}
	public ArrayList<Luna> getLunas() {
		// TODO Auto-generated method stub
		return lunas;
	}
	public void setLunas(Luna luna) {
		// TODO Auto-generated method stub
		this.lunas.add(luna);
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Planeta: "+this.nombre+" está a "+this.distanciaSol+" km del sol, su tamaño es de "+this.tamano+" km de diámetro y tiene "+this.lunas.size()+" luna";
	}
}
