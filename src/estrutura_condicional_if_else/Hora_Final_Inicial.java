package estrutura_condicional_if_else;

import java.util.Locale;
import java.util.Scanner;

public class Hora_Final_Inicial {
	public static void main(System [] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int Hora_inicial;
		int Hora_Final;
		int duracao;
		
		System.out.println("Insira a Primeira Hora:");
		Hora_inicial = sc.nextInt();
		System.out.println("Insira a Segunda Hora:");
		Hora_Final = sc.nextInt();
		
		if(Hora_inicial < Hora_Final) {
			duracao = Hora_inicial - Hora_Final;
		}else {
			duracao = Hora_inicial + Hora_Final;
		}
		
		System.out.println("O JOGO DUROU"+ duracao + "Hora(S)");
		
		sc.close();
	}

}
