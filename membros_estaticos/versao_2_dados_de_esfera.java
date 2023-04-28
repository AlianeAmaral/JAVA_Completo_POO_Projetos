package dados_de_esfera;

import java.util.Locale;
import java.util.Scanner;

import utilitarios.Calculator;

public class versao_2_dados_de_esfera {

	public static void main(String[] args) {

	Calculator calc = new Calculator();
		
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter radius: ");
	double radius = sc.nextDouble();
	
	double c = calc.circumference(radius); 
	double v = calc.volume(radius);
	
	System.out.printf("Circumference: %.2f%n", c);
	System.out.printf("Volume: %.2f%n", v);	
	System.out.printf("PI Value: %.2f%n", calc.PI);
	
	sc.close();
	
	}
}
