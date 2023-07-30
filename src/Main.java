import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Menu menu = new Menu();
		Scanner scan = new Scanner(System.in);
		Carrera carrera = new Carrera();
		
		int opcion = 0;
		
	    while(opcion != 3) {
	        menu.mostrarMenu();
	    	opcion = scan.nextInt();
	    	switch (opcion) {
	    	case 1:
	    		carrera.setnAutos();
	    		carrera.setVueltas();
	    		carrera.setnAutos(); 
	    		carrera.setDistancia();
	    		
	    		carrera.datosCarrera(carrera.getnAutos(), carrera.getVueltas(), carrera.getDistancia());
	    		
	    	    break;
	    	case 2:
	    		carrera.resultadosCarrera();
	    		break;
	    	case 3:
	    		break;
	    	default:
	    		System.out.println("Opcion invalida.");
	    	}
	    }
	    scan.close();
	}
}