package ejercicio2;

import ejercicio2.entidades.Juego;
import ejercicio2.servicios.JuegoServicio;

public class Main {
	
	public static void main(String[] args) throws Exception {
		JuegoServicio servicio = new JuegoServicio();
		
		Juego j = servicio.nuevoJuego();
		while(j.estanJugando()) {
			j.ronda();
		}
		
		System.out.println("La partida ha finalizado. El jugador mojado es " + j.getJugadorMojado().getNombre());
	}

}
