package estudos_programacao;
import java.util.Scanner;

public class exercicio_1_while_tentativas_de_acesso {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a Senha:");
		int senha = sc.nextInt();
		
		while (senha != 2002) {
			System.out.println("Senha Inválida. Tente Novamente.");
			System.out.println("Digite a Senha:");
			senha = sc.nextInt();
			
			/* enquanto "senha" for diferente de 2002, eu vou mandar ler novamente.
			 * por isso aparece o scanner dentro e fora do "while", mas dentro não precisa repetir o tipo "int".*/
		}
		
		System.out.println("Acesso Permitido.");
		
		sc.close();
	}

}
