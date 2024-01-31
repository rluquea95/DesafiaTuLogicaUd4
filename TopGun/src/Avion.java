
public class Avion {
	
	private int idAvion, capAvion;
	private static int idAvionSiguiente=0;
	private String modAvion;
	private Piloto piloto;
	
	public Avion() {
		
	}
	
	public Avion(String modAvion, int capAvion, Piloto piloto){
		idAvionSiguiente++;
		this.idAvion=idAvionSiguiente;
		this.modAvion=modAvion;
		this.capAvion=capAvion;
		this.piloto=piloto;
		
	}
	
	public void setIdAvion() {
		idAvionSiguiente++;
		this.idAvion=idAvionSiguiente;
	}
	
	public int getIdAvion(){
		
		return idAvion;
	}

	public void setModAvion(String modAvion) {
		
		this.modAvion=modAvion;
	}
	
	public String getModAvion() {
		
		return modAvion;
	}
	
	public void setCapAvion(int capAvion) {
		
		this.capAvion=capAvion;
	}
	
	public int getCapAvion() {
		
		return capAvion;
	}

	public void setPiloto(Piloto piloto) {
		
		this.piloto=piloto;
	}
	
	public Piloto getPiloto() {
		
		return piloto;
	}
	
	public String mostrarAvion() {
		
		return "-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.\n" +
				"El avión tiene las siguientes características: \n" +
				" Id: " + idAvion + "\n" +
				" Modelo: " + modAvion + "\n" +
				" Cantidad de pasajeros máxima: " + capAvion + "\n" +
				" El piloto tiene las siguientes características: \n" +
				"  Id: " + piloto.getIdPiloto() + "\n" +
				"  Nombre: " + piloto.getNomPiloto() + "\n" +
				"  Horas de vuelo: " + piloto.getHorasVueloPiloto() + "\n" +
				"  Rango: " + piloto.getRangoPiloto() + "\n";
	}
}

