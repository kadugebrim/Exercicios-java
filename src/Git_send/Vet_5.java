package Git_send;

import java.util.Scanner;

public class Vet_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int[] vetor = {10, 25, 30, 45, 50, 65, 70, 85, 90, 105};
        
        System.out.print("Informe um valor para buscar: ");
        int busca = sc.nextInt();
        boolean encontrado = false;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == busca) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) System.out.println("Valor encontrado.");
        else System.out.println("Valor não encontrado.");
    }
}