package estrutura_condicional_if_else;

import java.util.Locale;
import java.util.Scanner;

public class Codigo_Quantidade_Valor {
	public static void main(String [] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double valor1 = 4.00;
		double valor2 = 4.50;
		double valor3 = 5.00;
		double valor4 = 2.00;
		double valor5 = 1.50;
		int item;
		int quantidade;
		double valor;
		
		System.out.println("------------Menu------------");
		System.out.println("\n 1 - Cachorro-Quente - R$4,00");
		System.out.println("\n 2 - X-Salada - R$4,50");
		System.out.println("\n 3 - X-Bacon - R$5,00");
		System.out.println("\n 4 - Torrada Simples - R$2,00");
		System.out.println("\n 5 - Refrigerante - R$1,50");
		System.out.println("------------FIM MENU------------");
		
		System.out.println("\n Insira o código do item: ");
		item = sc.nextInt();
		System.out.println("Insira a quantidade: ");
		quantidade = sc.nextInt();
		
		if(item == 1 && quantidade >= 1) {
			valor = quantidade * valor1;
			System.out.printf("Valor do pedido: R$ %.2f", valor);
		
		}else if(item == 2 && quantidade >= 1) {
			valor = quantidade * valor2;
			System.out.printf("Valor do pedido: R$ %.2f", valor);
			
		}else if (item == 3 && quantidade >= 1) {
			valor = quantidade * valor3;
			System.out.printf("Valor do pedido: R$ %.2f", valor);
			
		}else if (item == 4 && quantidade >= 1) {
			valor = quantidade * valor4;
			System.out.printf("Valor do pedido: R$ %.2f", valor);
			
		}else if (item == 5 && quantidade >= 1) {
			valor = quantidade * valor5;
			System.out.printf("Valor do pedido: R$ %.2f", valor);
		}
		
		sc.close();
		
	}
}
