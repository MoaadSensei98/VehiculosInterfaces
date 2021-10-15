package main;
 
 
import modelo.entidad.Avion;
import modelo.entidad.Barco;
import modelo.entidad.Coche;
import modelo.entidad.Moto;
import modelo.entidad.Vehiculo;

public class Main {
	public static void main(String[] args) {
 		
 		Vehiculo moto = new Moto();
		Vehiculo coche = new Coche();
		Vehiculo barco = new Barco();
		Vehiculo avion = new Avion();
		
 		Thread t1 = new Thread(moto);
		Thread t2 = new Thread(coche);
		Thread t3 = new Thread(barco);
		Thread t4 = new Thread(avion);
		
 		moto.setNombre("Moto");
		moto.setCv(47); 
	    moto.setMeta(1000);//Cuantos km va a recorrer la moto 
	    
		coche.setNombre("Coche");
		coche.setCv(95); 
		coche.setMeta(1000);//Cuantos km va a recorrer el coche

		barco.setNombre("Barco");
		barco.setCv(300); 
		barco.setMeta(1000);//Cuantos km va a recorrer el barco

		avion.setNombre("Avion");
		avion.setCv(250);  
		avion.setMeta(1000);//Cuantos km va a recorrer el avion
  
		t1.start();
		t2.start();
		t3.start();
		t4.start();

	}
}
