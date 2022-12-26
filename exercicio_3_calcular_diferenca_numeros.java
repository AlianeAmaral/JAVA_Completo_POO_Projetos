import java.util.Scanner;

public class exercicio_3_calcular_diferenca_numeros {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int A, B, C, D;
		
		System.out.println("Digite o primeiro número: ");
		A = sc.nextInt();
		System.out.println("Digite o segundo número: ");
		B = sc.nextInt();
		System.out.println("Digite o terceiro número: ");
		C = sc.nextInt();
		System.out.println("Digite o quarto número: ");
		D = sc.nextInt();
		
		int DIFERENCA = (A * B - C * D);
		
		System.out.println("A diferença entre esses números é: " + DIFERENCA);
		
		sc.close(); 
	}
}
