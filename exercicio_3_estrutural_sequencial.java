import java.util.Scanner;

public class exercicio_3_estrutural_sequencial {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int A, B, C, D;
		
		System.out.println("Digite o primeiro n�mero: ");
		A = sc.nextInt();
		System.out.println("Digite o segundo n�mero: ");
		B = sc.nextInt();
		System.out.println("Digite o terceiro n�mero: ");
		C = sc.nextInt();
		System.out.println("Digite o quarto n�mero: ");
		D = sc.nextInt();
		
		int DIFERENCA = (A * B - C * D);
		
		System.out.println("A diferen�a entre esses n�meros �: " + DIFERENCA);
		
		sc.close();

	}

}
