package estudos_programacao;
import java.util.Scanner;

public class FOR_exercicio_1_impares_por_intervalo {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);

	System.out.println("Digite o valor inteiro de X: ");
	int X = sc.nextInt();
	
	for (int i=0; i <= X; i++) {
		// o i <= 0 determina o limite da operação, a condição para interromper.
		
		if (i % 2 != 0) {
			System.out.println(i);
			//o resto que for diferente de 0, vai entrar como "i", ou seja, os ímpares.
		}
	
	}
	
	sc.close();
	}

}
