import java.util.Scanner;

public class Gestion {

	public static void main(String[] args) {
		
		String pilotoEscogido="";
		Scanner entrada=new Scanner(System.in);
		
		Piloto piloto1=new Piloto("Pete Maverick", 10000, "Capitán");
		Piloto piloto2=new Piloto("Natasha Phoenix", 3000, "Teniente");
		Piloto piloto3=new Piloto("Bradley Rooster", 3500, "Teniente");
		Piloto piloto4=new Piloto();
		Piloto piloto5=new Piloto();
		piloto4.setIdPiloto();
		piloto5.setIdPiloto();
	
						  
		System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+- \n");
		System.out.println("Introduce los datos de 2 pilotos: \n");
		
		System.out.println("Datos del primer piloto:");
		System.out.println("Nombre:");
		piloto4.setNomPiloto(entrada.nextLine());
		
		System.out.println("Horas de vuelo:");
		piloto4.setHorasVueloPiloto(Integer.parseInt(entrada.nextLine()));
		
		System.out.println("Rango:");
		piloto4.setRangoPiloto(entrada.nextLine());
		
		
		System.out.println("\n" + "Datos del segundo piloto:");
		System.out.println("Nombre:");
		piloto5.setNomPiloto(entrada.nextLine());
		
		System.out.println("Horas de vuelo:");
		piloto5.setHorasVueloPiloto(Integer.parseInt(entrada.nextLine()));
		
		System.out.println("Rango: ");
		piloto5.setRangoPiloto(entrada.nextLine());
		
		
		System.out.println();
		System.out.println(piloto1.mostrarPiloto());
		System.out.println(piloto3.mostrarPiloto());
		System.out.println(piloto4.mostrarPiloto());
		System.out.println(piloto5.mostrarPiloto());
		
		
		Entrenamiento avion1 = new Entrenamiento("Airbus C-101 Aviojet", 1, piloto2, true);
		Combate avion2 = new Combate("F-35 Lightning II", 1, piloto1, false);
		Combate avion3 = new Combate("F-22 Raptor", 1, piloto3, true);
		Entrenamiento avion4 = new Entrenamiento();
		Entrenamiento avion5 = new Entrenamiento();
		avion4.setIdAvion();
		avion5.setIdAvion();
		
		
		System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-\n");
		System.out.println("Introduce los datos de 2 aviones de Entrenamiento: \n");
		
		System.out.println("Datos del primer avión:");
		System.out.println("Modelo:");
		avion4.setModAvion(entrada.nextLine());
		
		System.out.println("Plazas máximas:");
		avion4.setCapAvion(Integer.parseInt(entrada.nextLine()));
		
		System.out.println("Piloto: piloto4 (" + piloto4.getNomPiloto() + "), piloto5 (" + piloto5.getNomPiloto() + "):");
		pilotoEscogido=entrada.nextLine();
		
		if(pilotoEscogido.equalsIgnoreCase("piloto4")) {
			avion4.setPiloto(piloto4);
			avion5.setPiloto(piloto5);
		}
		else {
			avion4.setPiloto(piloto5);
			avion5.setPiloto(piloto4);
		}
		
		System.out.println("Doble mando (si/no):");
		avion4.setTieneDobleMando(entrada.nextLine());
		
		
		System.out.println("\n" + "Datos del segundo avión: \n");
		System.out.println("Modelo:");
		avion5.setModAvion(entrada.nextLine());
		
		System.out.println("Plazas máximas:");
		avion5.setCapAvion(Integer.parseInt(entrada.nextLine()));
		
		System.out.println("Doble mando (si/no):");
		avion5.setTieneDobleMando(entrada.nextLine());
		
		if(pilotoEscogido.equalsIgnoreCase("piloto4")) {
			System.out.println("Se ha asignado el piloto5 automáticamente ya que es el piloto que quedaba libre. \n");
		}
		else {
			System.out.println("Se ha asignado el piloto4 automáticamente ya que es el piloto que quedaba libre. \n");
		}
		
		
		System.out.println();
		System.out.println(avion1.mostrarAvion() + avion1.mostrarDatosMando());
		System.out.println(avion2.mostrarAvion() + avion2.mostrarDatosFurtivo());
		System.out.println(avion3.mostrarAvion() + avion3.mostrarDatosFurtivo());
		System.out.println(avion4.mostrarAvion() + avion4.mostrarDatosMando());
		System.out.println(avion5.mostrarAvion() + avion5.mostrarDatosMando());		
		
		entrada.close();
	}
}
