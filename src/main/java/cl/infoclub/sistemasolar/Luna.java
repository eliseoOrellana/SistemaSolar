package cl.infoclub.sistemasolar;

public class Luna implements ILuna{

	private String nombre;
	private int diametro;
	private int tiempoOrbita;
	
	public Luna(String nombre,int diametro,int tiempoOrbita) {
		this.nombre=nombre;
		this.diametro=diametro;
		this.tiempoOrbita=tiempoOrbita;
	}
	
	
	public String getNombre() {
		// TODO Auto-generated method stub
		return nombre;
	}
	public void setNombre(String nombre) {
		// TODO Auto-generated method stub
		this.nombre=nombre;
	}
	public int getDiametro() {
		// TODO Auto-generated method stub
		return diametro;
	}
	public void setDiametro(int diametro) {
		// TODO Auto-generated method stub
		this.diametro=diametro;
	}
	public int getTiempoOrbita() {
		// TODO Auto-generated method stub
		return tiempoOrbita;
	}
	public void setTiempoOrbita(int tiempoOrbita) {
		// TODO Auto-generated method stub
		this.tiempoOrbita=tiempoOrbita;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Luna de nombre "+this.nombre+" que mide "+this.diametro+" km de diámetro y el tiempo de órbita es de "+this.tiempoOrbita+" días";
	}

}
