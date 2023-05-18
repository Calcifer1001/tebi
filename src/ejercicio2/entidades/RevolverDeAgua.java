package ejercicio2.entidades;

import java.util.Random;

public class RevolverDeAgua {
	
	private Integer posActual;
	private Integer posAgua;
	
	private Random r;
	
	public RevolverDeAgua() {
		r = new Random();
		this.llenarRevolver();
	}

	public void llenarRevolver() {
		this.posActual = r.nextInt(6);
		this.posAgua = r.nextInt(6);
	}
	
	public boolean mojar() {
		return this.posActual == this.posAgua;
	}
	
	public void siguienteChorro() {
		this.posActual++;
		this.posActual = this.posActual % 6;
	}
	
	@Override
	public String toString() {
		return "El revolver está en la posición " + this.posActual + " y tiene el agua en " + this.posAgua;
	}
}
