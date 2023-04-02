package estudos_programacao;
import java.util.Scanner;

public class POO_exercicio_de_apresentacao {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner (System.in);
	
	System.out.println("ENTER PRODUCT DATA");
	
	System.out.println("Name: ");
	String name = sc.next();
	
	System.out.println("Price: ");
	double price = sc.nextDouble();
	
	System.out.println("Quantity in Stock: ");
	double quantityInStock = sc.nextDouble();
	
	double totalPrice = (quantityInStock * price);
	
	System.out.println("Product Data: " + name + " / Price: $"+  price + " / Quantity: " + quantityInStock + " units. Total in Stock: " + totalPrice);
	
	System.out.println("Enter the number of products to be added in stock: ");
	int added = sc.nextInt();
	
	double totalQuantityUpdated = (added + quantityInStock);
	double totalPriceUpdated = (totalQuantityUpdated * price);
	
	System.out.println("Updated	Data: " +name + " / Price: $ " +price+ " / Quantity: " +totalQuantityUpdated+ " units. Total in Stock: " +totalPriceUpdated);
	
	System.out.println("Enter the number of products to be removed from stock: ");
	int removed = sc.nextInt();
	
	double totalQuantityUpdatedAgain = (totalQuantityUpdated - removed);
	double totalPriceUpdatedAgain = (totalPriceUpdated - (price * removed));
	
	System.out.println("Updated	Data: " +name + " / Price: $ " +price+ " / Quantity: " +totalQuantityUpdatedAgain+ " units. Total in Stock: " +totalPriceUpdatedAgain);
	
	
	
	sc.close();
	}

}
