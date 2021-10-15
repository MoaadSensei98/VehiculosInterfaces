package modelo.entidad;

public class Avion extends Vehiculo { 
	public double mover(double distancia) {
		 
 		return distancia + this.getCv()*3;
	}
}
