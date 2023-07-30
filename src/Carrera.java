import java.util.Scanner;

public class Carrera {
	private int distancia;
	private int vueltas;
	private int nAutos;
    private double promedio = 0;
    private double velocidadPro = 0;
    private int tTotal = 0;
    private int [][]tiempo = new int[nAutos][vueltas];
    private Scanner scan = new Scanner(System.in);
	private Auto auto = new Auto();
	private String []competidor = new String[nAutos];
	private int []numAuto = new int[nAutos];
    
    public boolean datosCarrera(int nAutos, int vueltas, int distancia) {
    	this.nAutos = nAutos;
    	this.vueltas = vueltas;
    	this.distancia = distancia;
    	int contador =1;
    	
    	System.out.println("Control No. 1");
    	
	    for(int i=0; i<nAutos; i++){
  	      System.out.println("\nAuto No." + contador);
  	      auto.setCompetidor();
  	      competidor [i]= auto.getCompetidor();
  	      auto.setNumeroAuto(); 	      
  	      numAuto [i] = auto.getNumeroAuto();  
  	      for (int j = 1; j <= vueltas; j++) {
  	      		
  	      		System.out.println("Ingrese tiempo de vuelta " + j + " en segundos: ");
  	      		tiempo[i][j-1] = scan.nextInt();
  	      		tTotal = tTotal + tiempo[i][j-1];
  	      	}
  	      promedio = tTotal/vueltas;
  	      velocidadPro = (distancia/(promedio/3600));
  	      
  	      System.out.println("El promedio por vuelta en Km/h es: " + velocidadPro);
  	      System.out.println("");
  	      contador++;
  	    }
	return false;
    }
    
    public void resultadosCarrera(){
    	int contador = 1;
    	if (nAutos!= 0 && vueltas != 0){
    		for(int i=0; i<nAutos; i++){
      	      System.out.println("\nAuto No." + contador);
      	      System.out.println("Competidor: " + competidor[i]);
      	      System.out.println("Numero de auto: " + numAuto[i]);
      	      for (int j = 1; j <= vueltas; j++) {
      	        System.out.println("Vuelta " + j + ": " + tiempo[i][j-1]);
      	      }
      	      contador++;
      	    System.out.println("El promedio en Km/h es: " + velocidadPro);
    		}
		}else {
			System.out.println("Debe ingresar datos en la opcion No. 1");
		}
    }
	public void setDistancia() {
		System.out.println("Distancia de pista");
		distancia = scan.nextInt();
	}
	public void setVueltas() {
		System.out.println("Ingrese numero de vueltas");
	    vueltas = scan.nextInt();
	}
	public void setnAutos() {
		System.out.println("Ingrese numero de autos en competencia");
	    vueltas = scan.nextInt();
	}
	public int getnAutos() {
		return nAutos;
	}
	public int getVueltas() {
		return nAutos;
	}
	public int getDistancia() {
		return distancia;
	}
}
