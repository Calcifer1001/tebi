package ejercicio2.entidades;

public class Jugador {
	
	private Integer id;
	private String nombre;
	private Boolean estaMojado;
	
	public Jugador(Integer id) {
		this.id = id;
		this.nombre = "Jugador " + id;
		this.estaMojado = false;
	}
	
	public Boolean disparo(RevolverDeAgua r) {
		this.estaMojado = r.mojar();
		r.siguienteChorro();
		return this.estaMojado;
	}
	
	public String getNombre() {
		return this.nombre;
	}

}
