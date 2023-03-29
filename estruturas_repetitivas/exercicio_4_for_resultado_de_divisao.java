package estudos_programacao;
import java.util.Scanner;

public class exercicio_4_for_resultado_de_divisao {

	public static void main(String[] args) {

	Scanner sc = new Scanner (System.in);
	
	System.out.println("Digite quantas vezes deseja fazer a operação: ");
	int repeticoes = sc.nextInt();
	
	for (int i=0; i < repeticoes; i++) {
		System.out.println("Digite o primeiro número: ");
		int x = sc.nextInt();

		System.out.println("Digite o segundo número: ");
		int y = sc.nextInt();
		
			if (y == 0) { 
				System.out.println("Divisão Impossível.");
			}
			else {
				double resultado = (double) x / y; //por que entra esse (double)? ele altera o resultado.
				System.out.printf("Resultado da Divisão: %.1f%n", resultado);
			}
	}
	
	sc.close();	

	}

}
