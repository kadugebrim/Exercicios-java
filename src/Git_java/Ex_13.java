package Git_java;

import java.util.Scanner;

public class Ex_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número inteiro ");
        num = sc.nextInt();
        if (num % 2 == 0 ) {
        	System.out.println(" Seu número é par");
        } else { System.out.println(" Seu número é ímpar");
        } 
        
	} 

}
