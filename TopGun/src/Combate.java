
public class Combate extends Avion {
	
	private boolean esFurtivo;
	
	public Combate() {
		
	}
	
	public Combate(String modAvion, int capAvion, Piloto piloto, boolean esFurtivo) {
		super(modAvion, capAvion, piloto);
		this.esFurtivo=esFurtivo;
	}
	
	public void setEsFurtivo(String esFurtivo) {
		
		if(esFurtivo.equalsIgnoreCase("si") || esFurtivo.equalsIgnoreCase("sí")) {
			
			this.esFurtivo=true;
		}
		else {
			
			this.esFurtivo=false;
		}
	}
	
	public boolean getEsFurtivo() {
		
		return esFurtivo;
	}
	
	public String mostrarDatosFurtivo() {
		
		if (esFurtivo) {
			return "El avión cuenta con tecnología furtiva para minimizar la visibilidad de radares.";
		}
		else {
			return "El avión no dispone de tecnología furtiva.";
		}
	}
}
