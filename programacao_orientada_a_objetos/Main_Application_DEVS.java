package controle_de_estoque;
import java.util.Scanner;
import controle_de_estoque.Product;
import java.util.Locale;

public class Main_Application_DEVS {

	public static void main(String[] args) {

	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner (System.in);
	
	Product product = new Product();
	System.out.println("Enter product data: ");
	
	System.out.print("Name: ");
	product.name = sc.nextLine();
	
	System.out.print("Price: ");
	product.price = sc.nextDouble();
	
	System.out.print("Quantity In Stock: ");
	product.quantity = sc.nextInt();
	
	System.out.println();
	System.out.println("Product data: " + product); //chamando apenas product com o toString, substitui ter que escrever tudo aqui chamando todas as variáveis, o código fica mais limpo.
	
	System.out.println();
	System.out.print("Enter the number of products to be added in stock: ");
	int quantity = sc.nextInt();
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