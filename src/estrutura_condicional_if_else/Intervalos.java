package estrutura_condicional_if_else;

import java.util.Locale;
import java.util.Scanner;

public class Intervalos {
	public static void main(String [] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double valor;
		
		System.out.println("Insira um valor:");
		valor = sc.nextDouble();
		
		if(valor <= 25.0){
			System.out.println("Intervalo : [0,25]");
		
		}else if (valor <= 50.0){
			System.out.println("Intervalo : [25,50]");			
		
		}else if ( valor <= 75.0){
			System.out.println("Intervalo : [50,75]");
			
		}else if (valor <= 100.0){
			System.out.println("Intervalo : [75,100]");	
		
		}else if (valor < 0.0 || valor > 100.0){
			System.out.println("FORA DE INTERVALO!");
		}
		
		sc.close();
	}
}
