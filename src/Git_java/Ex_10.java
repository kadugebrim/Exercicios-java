package Git_java;

import java.util.Scanner;
public class Ex_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double kg;
		double lbs;
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o peso em kg ");
		kg = sc.nextDouble();
		lbs = kg * 2.205;
		System.out.printf("Após a converão do peso de kg para lb ele é de aproximadamente %.2f%n", lbs);
		
		

	}

}
