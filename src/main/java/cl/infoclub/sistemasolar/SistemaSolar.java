package cl.infoclub.sistemasolar;

import java.util.ArrayList;

public class SistemaSolar {
	
	private ArrayList<Planeta> planetas=new ArrayList<Planeta>();
	
	public SistemaSolar() {
		// TODO Auto-generated constructor stub
	}
	
	
	public void mostrarPlanetas(){
		for (Planeta planeta : planetas) {
			System.out.println(planeta.toString());
		}
	}

	public void mostrarPlanetasLunas() {
		for (Planeta planeta : planetas) {
			System.out.println(planeta.toString());
			for (Luna luna : planeta.getLunas()) {
				System.out.println(luna.toString());
			}
		}
	}
	
	public void adicionarPlaneta(Planeta planeta) {
		this.planetas.add(planeta);
	}
}
