package modelo.entidad;

import modelo.persistencia.interfaz.Movible;

public abstract class Vehiculo implements Movible, Runnable {// TODO como no instanciamos la clase vehiculo en ningun
																// momento lo ponemos abstracto
	private int id;
	private double cv;
	private String nombre;
	private double meta;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getCv() {
		return cv;
	}

	public void setCv(int cv) {
		this.cv = cv;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getMeta() {
		return meta;
	}

	public void setMeta(double meta) {
		this.meta = meta;
	}
 

	@Override
	public void run() { 
		try {
System.out.println(this.mover(this.meta));
			for (double i = 0; i <= this.meta; i += this.mover(this.meta) / 100) {
				Thread.sleep(100); 
				System.out.println(this.nombre + " lleva: " + (int) i + " km"); 
				 
			}
			System.out.println(this.nombre + " ha llegado a : " + (int)this.meta + " km");

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
