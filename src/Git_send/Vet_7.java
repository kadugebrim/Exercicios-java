package Git_send;

import java.util.Scanner;

public class Vet_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        float[] vetor = new float[6];
        System.out.print("Informe o valor para todas as posições: ");
        float valor = sc.nextFloat();

        for (int i = 0; i < 6; i++) {
            vetor[i] = valor;
        }

        System.out.print("Vetor: ");
        for (float f : vetor) System.out.print(f + " ");
    }
}
