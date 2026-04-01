package Git_java;
import java.util.Scanner;
public class Ex_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numA, numB;
		Scanner sc = new Scanner(System.in);
		System.out.print("Dois numeros: ");
		numA = sc.nextInt();
		numB = sc.nextInt();
		if (numA > 0 && numB > 0) {
		    System.out.println("Resultado (Mult): " + (numA * numB));
		} else {
		    System.out.println("Resultado (Soma): " + (numA + numB));
		}

	}

}
