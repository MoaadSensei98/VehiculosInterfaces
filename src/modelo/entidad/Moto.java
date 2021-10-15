package modelo.entidad;

public   class Moto extends Vehiculo {
	public double mover(double distancia) {
		System.out.println("=========================");

		return distancia + this.getCv(); //La velocidad va en funcion de los caballos
	}

	 
}
