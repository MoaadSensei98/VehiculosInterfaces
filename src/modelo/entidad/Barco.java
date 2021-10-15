package modelo.entidad;

public  class Barco extends Vehiculo {
	// Sobreescribimos este metodo que es el mimso que tenemos implementado en el
	// Movible para dar unas caracterísitcas específicas del objeto.
	public double mover(double distancia) {
		return distancia + this.getCv()*2; 
	}

	

}
