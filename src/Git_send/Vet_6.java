package Git_send;
import java.util.Scanner;
public class Vet_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Informe o tamanho N do vetor: ");
        int n = sc.nextInt();
        int[] vetor = new int[n];
        int posicaoAtual = 0; 

        for (int i = 0; i < n; i++) {
            System.out.print("Informe um número inteiro: ");
            int novoNumero = sc.nextInt();
            
            
            boolean jaExiste = false;
            for (int j = 0; j < posicaoAtual; j++) {
                if (vetor[j] == novoNumero) {
                    jaExiste = true;
                    break;
                }
            }

       
            if (!jaExiste) {
                vetor[posicaoAtual] = novoNumero;
                posicaoAtual++;
            } else {
                System.out.println("Número repetido! Não será adicionado.");
            }
        }

       
        System.out.print("Vetor resultante: [");
        for (int i = 0; i < posicaoAtual; i++) {
            System.out.print(vetor[i] + (i < posicaoAtual - 1 ? ", " : ""));
        }
        System.out.println("]");
        
        sc.close();
    }
}