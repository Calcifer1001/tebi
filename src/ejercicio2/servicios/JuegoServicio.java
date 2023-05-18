package ejercicio2.servicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ejercicio2.entidades.Juego;
import ejercicio2.entidades.Jugador;
import ejercicio2.entidades.RevolverDeAgua;

public class JuegoServicio {
	
	private Scanner s = new Scanner(System.in);
	
	public Juego nuevoJuego() {
		try {
			List<Jugador> jugadores = new ArrayList<>();
			System.out.println("Ingrese la cantidad de jugadores. Si excede 6, se pondrán 6 jugadores");
			Integer cantJugadores = s.nextInt();
			if(cantJugadores > 6) cantJugadores = 6;
			if(cantJugadores < 1) cantJugadores = 1;
			
			for(int i = 0; i < cantJugadores; i++) {
				jugadores.add(new Jugador(i + 1));
			}
			
			RevolverDeAgua r = new RevolverDeAgua();
			
			return new Juego(jugadores, r);
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("Error creando nuevo juego: " + e.getMessage());
			throw e;
		}
	}

}
