package estudos_programacao;
import java.util.Scanner;

public class FOR_exercicio_2_numeros_in_out_do_intervalo {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	int numerosLidos = 0;
	
	int in = 0;
	int out = 0;
	
	System.out.println("Quantos números serão lidos agora? ");
	int repeticoes = sc.nextInt();
	
	for (int i=1; i <= repeticoes; i++) { //se começar com "i=0", vai contar uma vez a mais, 3x e não 2x, por exemplo.
		System.out.println("Digite um número: ");
		numerosLidos = sc.nextInt();
	
			if (10 >= numerosLidos || numerosLidos <= 20) {
				in = in + 1;
			}
			else {
				out = out + 1;
			}
	}
	
	System.out.println("Quantidade de Números In: " + in);
	System.out.println("Quantidade de Números Out: " + out);
	
	sc.close();

	}

}
