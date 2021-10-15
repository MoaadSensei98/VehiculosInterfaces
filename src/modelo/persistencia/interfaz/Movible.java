package modelo.persistencia.interfaz;

 
public interface Movible {
	default public double mover(double distancia) { 
 		return distancia; //Distancia que recorrer� cada vehiculo en funcion de sus cv y la distancia
	}
}

//La interfaz sirve para dar un comportamiento y en este caso es �nico para todos. 
//En este caso todos los vehiculos se pueden mover, pero no todos se mueven igual. 

