package Git_java;

import java.util.Scanner;

public class Ex_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sal;
		double aumento;
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o seu salário atual ");
	      sal = sc.nextDouble();
	      aumento = sal + (sal * 0.15);
	      System.out.printf("O seu novo salário é %.2f%n ", aumento);
	      

	}

}
