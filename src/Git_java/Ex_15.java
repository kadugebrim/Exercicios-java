package Git_java;
import java.util.Scanner;
public class Ex_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n5;
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um numero: ");
		n5 = sc.nextInt();
		if (n5 % 3 == 0 && n5 % 5 == 0) {
		    System.out.println("Eh multiplo de 3 e 5 ao mesmo tempo");
		} else {
		    System.out.println("Nao eh multiplo de ambos");
		}

	}

}
