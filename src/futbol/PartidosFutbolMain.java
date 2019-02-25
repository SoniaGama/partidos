package futbol;

import java.util.Set;
import java.util.HashSet;

public class PartidosFutbolMain {

	public static void main(String[] args) {

		EliminarPartidos eliminar = new EliminarPartidos();
		
		PartidosFutbol partido1 = new PartidosFutbol("Equipo Local 1", "Equipo Visitante 1", 3, 3);
		PartidosFutbol partido2 = new PartidosFutbol("Equipo Local 2", "Equipo Visitante 2", 5, 1);
		PartidosFutbol partido3 = new PartidosFutbol("Equipo Local 3", "Equipo Visitante 3", 2, 2);
		PartidosFutbol partido4 = new PartidosFutbol("Equipo Local 4", "Equipo Visitante 4", 4, 3);
		
		Set<PartidosFutbol> partidos = new HashSet<PartidosFutbol>();
		
		partidos.add(partido1);
		partidos.add(partido2);
		partidos.add(partido3);
		partidos.add(partido4);
		
		for(PartidosFutbol partidosLoop : partidos) {
			System.out.println(partidosLoop.getEquipoLocal());
		}
		
		eliminar.EliminarPartidos(partidos);
		System.out.println("\n");
		
		for(PartidosFutbol partidosLoop : partidos) {
			System.out.println(partidosLoop.getEquipoLocal());
		}
		

	}

}
