package estrutura_condicional_if_else;

import java.util.Locale;
import java.util.Scanner;

public class Impar_Par {
	
	public static void main(String [] args){
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double a;
		
		System.out.println("Insira um número: ");
		a = sc.nextDouble();
		
		if(a/2==0){
			System.out.println("PAR !");
		}else{
			System.out.println("ÍMPAR !");
		}
		
		sc.close();
	}

}
