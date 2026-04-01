package Git_send;

import java.util.Scanner;

public class Vet13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int[] v = new int[10];
        int[] pares = new int[10];
        int cont = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Valor " + i + ": ");
            v[i] = sc.nextInt();
            if (v[i] % 2 == 0) {
                pares[cont] = v[i];
                cont++;
            }
        }

        System.out.print("Pares encontrados: ");
        for (int i = 0; i < cont; i++) System.out.print(pares[i] + " ");
    }
}