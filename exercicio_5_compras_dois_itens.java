import java.util.Locale;
import java.util.Scanner;

public class exercicio_5_estrutura_sequencial {

	public static void main(String[] args) {
	
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);

	System.out.println("Insira o código do primeiro produto: ");
	int C1 = sc.nextInt();
	System.out.println("Quantidade: ");
	int Q1 = sc.nextInt();
	System.out.println("Valor do produto por unidade: ");
	double V1 = sc.nextDouble();
	
	System.out.println("Insira o código do segundo produto: ");
	int C2 = sc.nextInt();
	System.out.println("Quantidade: ");
	int Q2 = sc.nextInt();
	System.out.println("Valor do produto por unidade: ");
	double V2 = sc.nextDouble();
	
	double total = (Q1 * V1 + Q2 * V2);
	
	System.out.println();
	System.out.printf("TOTAL DA COMPRA: R$ %.2f %n", total);
	
	sc.close();
	
	}

}
