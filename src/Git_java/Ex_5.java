package Git_java;

import java.util.Scanner;

public class Ex_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nasc;
		int idade;
		int dias;
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o ano do seu nascimento ");
	      nasc= sc.nextInt();
	      idade = 2026 - nasc;
	      dias = 365 * idade;
	      System.out.printf("Sua idade em anos é de %d e sua idade em dias é %d%n ", idade, dias );
	      
		 
			

	}

}
