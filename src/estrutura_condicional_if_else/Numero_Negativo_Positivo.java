package estrutura_condicional_if_else;

import java.util.Locale;
import java.util.Scanner;

public class Numero_Negativo_Positivo {
	
	public static void main(String [] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double a;
		
		System.out.println("Insira o valor correspondente: ");
		a = sc.nextDouble();
		
		if (a>0) {
			System.out.println("POSITIVO!");
		}else{
			System.out.println("NEGATIVO!");
		}
		
		sc.close();
		
	}

}
