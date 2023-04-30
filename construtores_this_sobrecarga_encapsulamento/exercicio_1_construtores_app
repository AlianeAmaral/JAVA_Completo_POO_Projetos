package construtores;
import java.util.Locale;
import java.util.Scanner;

public class exercicio_1_contrutores_app {

		public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		System.out.print("Quantity In Stock: ");
		int quantity = sc.nextInt();
		
		Produto product = new Produto(name, price, quantity);
		
		System.out.println();
		System.out.println("Product data: " + product); //chamando apenas product com o toString, substitui ter que escrever tudo aqui chamando todas as variáveis, o código fica mais limpo.
		
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		quantity = sc.nextInt();
		product.addProducts (quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product);
		
		System.out.println();
		System.out.print("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product);
		
		sc.close(); 
		}
	}
