package dados_de_esfera;

import java.util.Locale;
import java.util.Scanner;

public class versao_1_dados_de_esfera {

	public static double PI = 3.14159; 
	
	public static void main(String[] args) {

	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter radius: ");
	double radius = sc.nextDouble();
	
	double c = circumference(radius); //vamos supor que seja criada uma função chamada "circumference" com "radius" de argumento.
	
	double v = volume(radius);
	
	System.out.printf("Circumference: %.2f%n", c);
	System.out.printf("Volume: %.2f%n", v);	
	System.out.printf("PI Value: %.2f%n", PI);
	
	sc.close();
	
	}
	
	public static double circumference(double radius) { //será double porque essa função RETORNA um valor DOUBLE, a circumference recebe um raio double como argumento ou parâmetro.
		return 2.0 * PI * radius;
		//retornar a fórmula da circunferência.
	}
	
	public static double volume(double radius) { 
		return 4.0 * PI * radius * radius * radius / 3.0;
		//não precisa colocar parênteses, porque quando há a mesma precedência/prioridade, então seguirá a sequência que está e a divisão será por último.
	}
}
