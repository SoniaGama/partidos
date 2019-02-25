package futbol;

import java.util.Collection;
import java.util.Iterator;

public class EliminarPartidos implements InterfaceFutbol {	

	@Override
	public void EliminarPartidos(Collection<PartidosFutbol> partidos) {	
		Iterator<PartidosFutbol> iterator = partidos.iterator();
		while(iterator.hasNext()) {
	        PartidosFutbol partido = iterator.next();
	        //System.out.println(goles.getGolesLocal());
	        //System.out.println(goles.getGolesVisitante());
	        if(!partido.getGolesLocal().equals(partido.getGolesVisitante())) {
	        	iterator.remove();
	        }
	    }	
		
	}

}
