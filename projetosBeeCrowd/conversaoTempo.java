package projetosBeeCrowd;
import java.io.IOException;
import java.util.Scanner;
 

public class conversaoTempo {

	    public static void main(String[] args) throws IOException {

	    Scanner sc = new Scanner(System.in);
	    
	    int N = sc.nextInt();
	    int horas = 0,minutos = 0,segundos = 0;
	    
	    if (N >= 3600){
	        horas = (N/3600);
	        N -= (horas * 3600);
	    }
	    
	    if(N >= 60){
	        minutos = (N/60);
	        N -= (minutos * 60);
	    }
	    segundos = N;
	    
	    System.out.println(horas + ":"+ minutos + ":" + segundos);
	    
	    sc.close();
	 
	    }
	}
	 
