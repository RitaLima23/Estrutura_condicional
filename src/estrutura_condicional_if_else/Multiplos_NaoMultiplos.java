package estrutura_condicional_if_else;

import java.util.Locale;
import java.util.Scanner;

public class Multiplos_NaoMultiplos {
	public static void main(String [] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int A;
		int B;
		
		System.out.println("Insira o primeiro valor:");
		A = sc.nextInt();
		System.out.println("Insira o segundo valor:");
		B = sc.nextInt();
		
		if(A % B == 0 || B % A == 0) {
			System.out.println("MULTÍPLOS!");
		}else {
			System.out.println("NÃO MULTIPLOS!");
		}
		sc.close();
	}

}
