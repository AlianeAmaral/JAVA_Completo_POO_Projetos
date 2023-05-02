package construtores;
import java.util.Locale;
import java.util.Scanner;

public class exercicio_3_encapsulamento_app {

		public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		
		Produto product = new Produto(name, price);
		
		//se agora eu quiser dar outro nome para o atributo "name", ele não vai deixar, porque agora mudamos para "private".
		//product.name = "Computer";
		//devemos então na classe "Produto", após os construtores, inserir os códigos setName;
		product.setName("Computer");
		//o mesmo servirá para acessar, mas criando o método get.
		System.out.println("Updated Name: " + product.getName());
		
		//o mesmo sendo feito para alterar o preço do produto.
		product.setPrice(1200.00);
		System.out.println("Updated Price: " + product.getPrice());
		
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
