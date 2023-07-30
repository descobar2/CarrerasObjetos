import java.util.Scanner;

public class Auto {
	private Scanner scan = new Scanner(System.in);
	private String  competidor;
	private int idAuto;

	
	
	public String getCompetidor() {
		return competidor;
	}

	public void setCompetidor() {
		System.out.println("Ingrese competidor");
	    competidor = scan.nextLine();
	}

	public int getNumeroAuto() {
		return idAuto;
	}

	public void setNumeroAuto() {
	    System.out.println("Ingrese identificador de autos");
	    idAuto = scan.nextInt();
	}
}
