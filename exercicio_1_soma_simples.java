import java.util.Scanner; 

public class exercicio_1_estrutura_sequencial {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	int x;
	int y;
	int soma;

	System.out.println("Insira o primeiro número: ");
	x = sc.nextInt();
	System.out.println("Insira o segundo número: ");
	y = sc.nextInt();
	
	soma = x + y;
	System.out.println("A soma dos dois números é " + soma);
	
	sc.close();

	}

}
