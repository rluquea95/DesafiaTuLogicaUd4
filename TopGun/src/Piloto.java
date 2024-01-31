
public class Piloto {
	
	private int idPiloto, horasVueloPiloto;
	private static int idPilotoSiguiente=0;
		
	/*Es necesario crear idPilotoSiguiente como variable de tipo static para que sea
	 *una variable global de la clase y no sea distinta para cada objeto creado.*/
	
	private String nomPiloto, rangoPiloto;	
	
	//Método constructor por defecto.
	public Piloto () {
		
	}
	
	//Método constructor con parámetros.
	public Piloto(String nomPiloto, int horasVueloPiloto, String rangoPiloto) {
		idPilotoSiguiente++;
		this.idPiloto=idPilotoSiguiente;
		this.nomPiloto=nomPiloto;
		this.horasVueloPiloto=horasVueloPiloto;
		this.rangoPiloto=rangoPiloto;
	}
	
	//Método setter, establece un ID a cada objeto de forma automática
	public void setIdPiloto() {
		idPilotoSiguiente++;
		this.idPiloto=idPilotoSiguiente;
	}
	
	//Método getter, devuelve el valor almacenado en la variable.
	public int getIdPiloto() { 
		
		return idPiloto;
	}
	
	//Método setter, guarda el valor en la variable.
	public void setNomPiloto(String nomPiloto) {
		
		this.nomPiloto=nomPiloto;
	}
	
	public String getNomPiloto() { 
		
		return nomPiloto;
	}
	
	public void setHorasVueloPiloto(int horasVueloPiloto) { 
		
		this.horasVueloPiloto=horasVueloPiloto;
	}
	
	public int getHorasVueloPiloto() {  
		
		return horasVueloPiloto;
	}
	
	public void setRangoPiloto (String rangoPiloto) { 
		
		this.rangoPiloto=rangoPiloto;
	}
	
	public String getRangoPiloto() {  
		
		return rangoPiloto;
	}

	// Muestra todos los datos del piloto concatenados.
	public String mostrarPiloto() { 
		
		return "-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.\n" + 
				"El piloto tiene las siguientes características: \n" +
				" Id: " + idPiloto + "\n" +
				" Nombre: " + nomPiloto + "\n" +
				" Horas de vuelo: " + horasVueloPiloto + "\n" +
				" Rango: " + rangoPiloto + "\n";
	}
}
