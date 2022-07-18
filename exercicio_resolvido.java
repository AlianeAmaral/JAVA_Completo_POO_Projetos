import java.util.Locale;
import java.util.Scanner;

public class exercicio_resolvido {

	public static void main(String[] args) {		
	
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Qual � a largura do terreno? R: ");	
	double largura = sc.nextDouble();
	System.out.print("Qual � o comprimento do terreno? R: ");
	double comprimento = sc.nextDouble();
	System.out.print("Qual � o valor do terreno por metro quadrado? R: ");	
	double metro = sc.nextDouble();
	
	double area = (largura * comprimento);
	double total = (metro * area);
	
	System.out.println();
	System.out.printf("O terreno possui �rea de: %.2f metros quadrados.%n", area);
	System.out.printf("O terreno est� custando no total de: %.2f reais.%n", total);

	sc.close();

	}

}
