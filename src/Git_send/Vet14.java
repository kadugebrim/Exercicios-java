package Git_send;

import java.util.Scanner;

public class Vet14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int[] v = new int[10];
        int soma = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Valor " + i + ": ");
            v[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i += 2) {
            soma += v[i];
        }
        System.out.println("Soma dos valores nos índices 0, 2, 4, 6, 8: " + soma);
    }
}