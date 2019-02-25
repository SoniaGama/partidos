package futbol;

public class PartidosFutbol{
	
	private String equipoLocal;
	private String equipoVisitante;
	private Integer golesLocal;
	private Integer golesVisitante;
	
	PartidosFutbol(){
		
	}
	
	PartidosFutbol(String equipoLocal, String equipoVisitante, Integer golesLocal, Integer golesVisitante){
		this.equipoLocal = equipoLocal;
		this.equipoVisitante = equipoVisitante;
		this.golesLocal = golesLocal;
		this.golesVisitante = golesVisitante;
	}

	public String getEquipoLocal() {
		return equipoLocal;
	}
	
	public void setEquipoLocal(String equipoLocal) {
		this.equipoLocal = equipoLocal;
	}
	
	
	public String getEquipoVisitante() {
		return equipoVisitante;
	}
	
	public void setEquipoVisitante(String equipoVisitante) {
		this.equipoVisitante = equipoVisitante;
	}
	
	public Integer getGolesLocal() {
		return golesLocal;
	}
	
	public void setGolesLocal(Integer golesLocal) {
		this.golesLocal = golesLocal;
	}
	
	public Integer getGolesVisitante() {
		return golesVisitante;
	}
	
	public void setGolesVisitante(Integer golesVisitante) {
		this.golesVisitante = golesVisitante;
	}
}
