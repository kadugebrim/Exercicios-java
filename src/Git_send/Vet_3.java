package Git_send;

import java.util.Scanner;

public class Vet_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
				float [] vetor = new float[4];
				float mult = 1.0f;
		for(int i = 0; i < 4; i++ ) {
			System.out.println("Digite um numero flutuante ");
			 vetor[i] = sc.nextFloat();
			 mult *= vetor[i];
		}
		System.out.println("O valor do produto dos valores armazenados é " +mult);
		
				

	}

}
