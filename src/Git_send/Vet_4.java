package Git_send;

import java.util.Scanner;

public class Vet_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Digite cinco numeros inteiros ");
		Scanner sc = new Scanner(System.in);
        int[] vetor = new int[5]; 
        int soma = 0;

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o valor para a posição " + i + ": ");
            vetor[i] = sc.nextInt();
            soma += vetor[i];
        }

        System.out.println("\nSoma total: " + soma);
        sc.close();
    }
}