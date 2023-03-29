//essa é aparesentação da sintaxe com função.
package estudos_programacao;
import java.util.Scanner;
  
public class FUNCOES_com_funcao_maior_entre_tres_numeros {
  
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three numbers:");
  
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
  
        int higher = max(a, b, c);
        showResult(higher);

        sc.close();
    }
    
    public static int max(int x, int y, int z) {
        int aux;
        if (x > y && x > z) {
            aux = x;
        } else if (y > z) {
            aux = y;
        } else {
            aux = z;
        }
    return aux;
    }
    
    public static void showResult(int value) {
        System.out.println("Higher = " + value);
    }
}
