import java.util.Locale;
import java.util.Scanner;

public class exercicio_2_estrutura_sequencial {

	public static void main(String[] args) {
	
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Qual é o raio desse círculo? ");
	double raio = sc.nextDouble();
	double pi = 3.14159;
	double raio2;
	
	raio2 = Math.pow(raio, 2);
	
	double area = pi * raio2;
	
	System.out.printf("A área do seu círculo é: %.4f", area);
	
	sc.close();

	}

}
