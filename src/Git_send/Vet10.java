package Git_send;

import java.util.Scanner;

public class Vet10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Tamanho N: ");
        int n = sc.nextInt();
        int[] v = new int[n];

        for(int i = 0; i < n; i++) v[i] = 10; 

        System.out.print("Somar quanto? ");
        int num = sc.nextInt();
        v[0] += num;
        v[n-1] += num;

        for(int x : v) System.out.print(x + " ");
    }
}