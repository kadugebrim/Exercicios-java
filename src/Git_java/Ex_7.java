package Git_java;

import java.util.Scanner;

public class Ex_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int ant;
			int num;
			int pos;
			Scanner sc = new Scanner(System.in);
			System.out.print("Digite um numero para descobrir seu sucessor e antecessor ");
			num = sc.nextInt();
			ant = num - 1;
			pos = num + 1;
			System.out.printf("O sucessor é %d e o antecessor é %d%n ", pos, ant);

	}

}
