package controle_de_estoque;

public class POO_exercicio_2_Product {

	public String name;
	public double price;
	public double quantity;
	
	public double adicionar;
	public double remover;
	
	public double totalPrice() {
		double calculo1 = quantity * price;
	return calculo1;	
	}
	
	public double totalPriceAdd() {
		double calculo2 = ((adicionar + quantity) * price);
	return calculo2;
	}
	
	public double quantityAdd() {
		double calculo3 = adicionar + quantity;
	return calculo3;
	}
	
	public double totalPriceRemoved() {
		double calculo4 = ((quantity - remover) * price);
	return calculo4;
	}
	
	public double quantityRemoved() {
		double calculo5 = quantity - remover; 
	return calculo5;
	}
	
}
	
