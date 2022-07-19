import java.util.Locale;
import java.util.Scanner;

public class exercicio_6_estrutura_sequencial {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, B, C;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		double triangulo, circulo, trapezio, quadrado, retangulo;
		double pi = 3.14159;
		 
		triangulo = A * C / 2;
		circulo = (C * C) * pi;
		trapezio = (A + B) / 2.0 * C;
		quadrado = B * B;
		retangulo = A * B;
		
		System.out.printf("A área do triângulo é: %.3f %n", triangulo);
		System.out.printf("A área do círculo é: %.3f %n", circulo);
		System.out.printf("A área do trapezio é: %.3f %n", trapezio);
		System.out.printf("A área do quadrado é: %.3f %n", quadrado);
		System.out.printf("A área do retângulo é: %.3f %n", retangulo);
		
		sc.close();

	}

}
