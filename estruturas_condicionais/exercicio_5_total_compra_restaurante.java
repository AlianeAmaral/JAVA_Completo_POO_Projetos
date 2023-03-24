import java.util.Scanner;

public class exercicio_5_total_compra_restaurante {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
		
	System.out.println("Item 1: Cachorro-Quente - R$ 4,00.");
	System.out.println("Item 2: X-Salada - R$ 4,50.");
	System.out.println("Item 3: X-Bacon - R$ 5,00.");
	System.out.println("Item 4: Torrada Simples - R$ 2,00.");
	System.out.println("Item 5: Refrigerante - R$ 1,50.");
	System.out.println();
	
	System.out.println("Insira o código do item desejado: ");
	int item = sc.nextInt();

	System.out.println("Quantidade que será comprada desse item: ");
	int quantidade = sc.nextInt();
	
	double total = 0;
	boolean invalido = false;
	
	if (item == 1) {
		total = (4 * quantidade);
	}
	
	else if (item == 2) {
		total = (4.50 * quantidade);
	}
	
	else if (item == 3) {
		total = (5 * quantidade);
	}
	
	else if (item == 4) {
		total = (2 * quantidade);
	}
	
	else if (item == 5) {
		total = (1.50 * quantidade);
	}
	
	else {
		invalido = true;
		System.out.println("Código Inválido. Digite o código de um produto existente de 1 até 5.");
	}
	
	if (invalido == false) {
		System.out.printf("Valor total da compra: R$ %.2f %n", total);
	}
	
	sc.close();
	}
}
