package Git_send;

import java.util.Scanner;

public class Vet11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int[] v = new int[8];

        for (int i = 0; i < 8; i++) {
            System.out.print("Valor " + i + ": ");
            v[i] = sc.nextInt();
        }

        System.out.print("Informe o primeiro índice para trocar (0-7): ");
        int i1 = sc.nextInt();
        System.out.print("Informe o segundo índice: ");
        int i2 = sc.nextInt();

        int temp = v[i1];
        v[i1] = v[i2];
        v[i2] = temp;

        System.out.print("Vetor após troca: ");
        for (int x : v) System.out.print(x + " ");
    }
}