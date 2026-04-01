package Git_send;


import java.util.Scanner;

public class Vet_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int soma = 0;
	  int[]vetor = new int[3];
	  for(int i = 0; i < 3; i++ ) {
		  System.out.println("Digite um numero inteiro ");
			 vetor[i] = sc.nextInt();
			 soma += vetor[i];
		 }
	
		  System.out.printf("A soma dos valores armazenados no vetor é igual a %d\n", soma);
	  }
	  
		
		

	}


