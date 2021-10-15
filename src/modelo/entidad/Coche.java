package modelo.entidad;

public   class Coche extends Vehiculo {
	public double mover(double distancia) {
		return distancia  + this.getCv(); //La velocidad va en funcion de los caballos
	}
	 
}
