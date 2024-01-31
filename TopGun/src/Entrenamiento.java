//Se crea la clase Entrenamiento la cual hereda de Avion
public class Entrenamiento extends Avion {
	
	private boolean tieneDobleMando;
	
	public Entrenamiento() {
		
	}

	public Entrenamiento(String modAvion, int capAvion, Piloto piloto, boolean tieneDobleMando) {
		super(modAvion, capAvion, piloto);
		this.tieneDobleMando=tieneDobleMando;
	}

	/*El método recibe una cadena de caracteres, la compara y 
	 *según la condición que cumpla la variable tieneDobleMando toma el valor 'true' o 'false'*/
	public void setTieneDobleMando(String tieneDobleMando) {
		
		if(tieneDobleMando.equalsIgnoreCase("si") || tieneDobleMando.equalsIgnoreCase("sí")) {
			
			this.tieneDobleMando=true;
		}
		else {
			
			this.tieneDobleMando=false;
		}
	}
	
	public boolean getTieneDobleMando() {
		
		return tieneDobleMando;
	}
	
	public String mostrarDatosMando() {
		
		if (tieneDobleMando) {
			return "El avión cuenta con doble mando, permitiendo al instructor tomar el control en caso necesario.";
		}
		else {
			return "El avión no está equipado con doble mando.";
		}
	}
}
