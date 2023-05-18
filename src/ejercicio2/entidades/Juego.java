package ejercicio2.entidades;

import java.util.ArrayList;
import java.util.List;

public class Juego {
	
	private Integer indiceTurno;
	private List<Jugador> jugadores;
	private RevolverDeAgua revolver;
	private Boolean estanJugando;
	private Jugador jugadorMojado; 
	
	public Juego(List<Jugador> jugadores, RevolverDeAgua r) {
		this.indiceTurno = 0;
		this.llenarJuego(jugadores, r);
		this.estanJugando = true;
	}
	
	public void llenarJuego(List<Jugador> jugadores, RevolverDeAgua r) {
		this.jugadores = jugadores;
		this.revolver = r;
	}
	
	public void ronda() throws Exception {
		if(!this.estanJugando) throw new Exception("La partida ya terminó");
		this.estanJugando = !this.jugadores.get(this.indiceTurno++).disparo(this.revolver);
		if(!this.estanJugando) this.jugadorMojado = this.jugadores.get(this.indiceTurno - 1);
		this.indiceTurno = this.indiceTurno % this.jugadores.size();
		
	}
	
	public boolean estanJugando() {
		return this.estanJugando;
	}
	
	public Jugador getJugadorMojado() {
		return this.jugadorMojado;
	}

}
