package Git_java;

import java.util.Scanner;



public class Ex_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		      int n;
		      int n1;
		      int n2;		    
		      int media;
		      Scanner sc = new Scanner(System.in);
		      System.out.print("Digite um numero inteiro ");
		      n = sc.nextInt();
		      System.out.print("Digite um numero inteiro ");
		      n1 = sc.nextInt();
		      System.out.print("Digite um numero inteiro ");
		      n2 = sc.nextInt();
		      media = ( n * 2 + n1 * 3 + n2 * 5 ) / ( 2 + 3 + 5 );
		      System.out.printf("A média ponderada com os pesos 2, 3, 5 é %d%n", media);
		      
		      
		      
		      
		    	

	}

}
