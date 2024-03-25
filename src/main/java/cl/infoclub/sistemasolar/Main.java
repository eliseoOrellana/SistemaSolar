package cl.infoclub.sistemasolar;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Planeta mercurio=new Planeta("Mercurio", 4880, 	57910000);
		
		Planeta venus =new Planeta("Venus", 12104, 108200000);
		
		Planeta tierra =new Planeta("Tierra", 12756 , 149600000);
		Luna luna=new Luna("Luna", 3476, 27322);
		tierra.setLunas(luna);
		
		Planeta marte =new Planeta("Marte", 6794, 227940000);
		Luna lunaMarte1=new Luna("Deimos", 8, 1263);
		Luna lunaMarte2=new Luna("Phobos", 560, 319);
		marte.setLunas(lunaMarte1);
		marte.setLunas(lunaMarte2);
		
		
		Planeta jupiter =new Planeta("Jupiter", 142984, 778330000);
		Luna lunaJupiter1= new Luna("Adrastea", 416, 298);
		Luna lunaJupiter2= new Luna("Aitne", 3, 736);
		jupiter.setLunas(lunaJupiter1);
		jupiter.setLunas(lunaJupiter2);
		
		Planeta saturno =new Planeta("Saturno", 108728, 1429400000);
		Luna lunaSaturno1= new Luna("Aegir", 6, 1116);
		Luna lunaSaturno2= new Luna("Albiorix", 30, 783);
		saturno.setLunas(lunaSaturno1);
		saturno.setLunas(lunaSaturno2);
		
		
		Planeta urano=new Planeta("Urano", 	51118,287099000);
		Luna lunaUrano1= new Luna("Ariel", 1160, 624);
		Luna lunaUrano2= new Luna("Caliban", 80, 579);
		urano.setLunas(lunaUrano1);
		urano.setLunas(lunaUrano2);
		
		Planeta neptuno=new Planeta("Neptuno",49532,450430000 );
		Luna lunaNeptuno1=new Luna("Halimede", 60, 1874);
		Luna lunaNeptuno2=new Luna("Laomedeia", 38, 2980);
		neptuno.setLunas(lunaNeptuno1);
		neptuno.setLunas(lunaNeptuno2);
		
		SistemaSolar sistemaSolar=new SistemaSolar();
		sistemaSolar.adicionarPlaneta(mercurio);
		sistemaSolar.adicionarPlaneta(venus);
		sistemaSolar.adicionarPlaneta(tierra);
		sistemaSolar.adicionarPlaneta(marte);
		sistemaSolar.adicionarPlaneta(jupiter);
		sistemaSolar.adicionarPlaneta(saturno);
		sistemaSolar.adicionarPlaneta(urano);
		sistemaSolar.adicionarPlaneta(neptuno);
		
		sistemaSolar.mostrarPlanetasLunas();
	}

}
