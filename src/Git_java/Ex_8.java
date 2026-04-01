package Git_java;

import java.util.Scanner;

public class Ex_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int sal;
	 int dias;
	 int diaria;
	 Scanner sc = new Scanner(System.in);
	 System.out.print("Digite o número de dias que você trabalha ");
	 dias = sc.nextInt();
	 System.out.print("Digite o valor da sua diária ");
	 diaria = sc.nextInt();
	 sal = dias * diaria;
	 System.out.printf("O valor do seu salário é de %d",sal);
	 
	 
			 
		

	}

}
