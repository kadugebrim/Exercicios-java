package Git_send;

import java.util.Scanner;

public class Vet15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Quantos números primos deseja gerar? ");
        int n = sc.nextInt();
        int[] primos = new int[n];
        int encontrados = 0, num = 2;

        while (encontrados < n) {
            boolean ehPrimo = true;
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    ehPrimo = false;
                    break;
                }
            }
            if (ehPrimo) {
                primos[encontrados] = num;
                encontrados++;
            }
            num++;
        }

        System.out.print("Primos: ");
        for (int p : primos) System.out.print(p + " ");
    }
}