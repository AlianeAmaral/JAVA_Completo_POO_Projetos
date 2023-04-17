package controle_de_estoque;
import java.util.Scanner;

public class POO_exercicio_2_Main_Application { 

	public static void main(String[] args) {
		
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Deseja trabalhar com um novo produto (s/n)? ");
	    char resposta = sc.next().charAt(0);
	    
		while (resposta == 's') {
	    
	    System.out.println("Deseja adicionar (a) ou remover (r) uma quantidade? Para encerrar, inserir qualquer outro dígito.");
	    char repetir = sc.next().charAt(0);
	    
	    	if (repetir == 'a') {
	    	    Product produto;
	    	    produto = new Product();
	    	    
	    	    System.out.println("Entre com as informações do produto (nome/preço/quantidade): ");
	    	    produto.name = sc.next();
	    	    produto.price = sc.nextDouble();
	    	    produto.quantity = sc.nextDouble();
	    	    
	    	    System.out.println("Nome do Produto: " +produto.name+ " / Preço: $ "+produto.price+ " / Quantidade: " +produto.quantity+ " unidades. Valor Total no Estoque: " +produto.totalPrice());    
	    	
	    	    System.out.println("Quantidade que deseja adicionar: ");
	    	    produto.adicionar = sc.nextDouble();
	    	    
	    	    System.out.println("Nome do Produto: " +produto.name+ " / Preço: R$ "+produto.price+ " / Quantidade: " +produto.quantityAdd()+ " unidades. Valor Total no Estoque: R$ " +produto.totalPriceAdd());    
		    	 
	    	}
	    	else if (repetir == 'r') {
	    	    Product produto;
	    	    produto = new Product();
	    	    
	    	    System.out.println("Entre com as informações do produto (nome/preço/quantidade): ");
	    	    produto.name = sc.next();
	    	    produto.price = sc.nextDouble();
	    	    produto.quantity = sc.nextDouble();
	    	    
	    	    System.out.println("Nome do Produto: " +produto.name+ " / Preço: $ "+produto.price+ " / Quantidade: " +produto.quantity+ " unidades. Valor Total no Estoque: " +produto.totalPrice());    
	    	
	    	    System.out.println("Quantidade que deseja remover: ");
	    	    produto.remover = sc.nextDouble();
	    	    
	    	    System.out.println("Nome do Produto: " +produto.name+ " / Preço: R$ "+produto.price+ " / Quantidade: " +produto.quantityRemoved()+ " unidades. Valor Total no Estoque: R$ " +produto.totalPriceRemoved());    	
	    	}
	    
		System.out.println("Deseja trabalhar com um novo produto (s/n)? ");
		resposta = sc.next().charAt(0);
    	
		}
    	
		System.out.println("Aplicação Encerrada.");
		
	    sc.close();
	}
}
