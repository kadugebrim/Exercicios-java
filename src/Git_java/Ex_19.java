package Git_java;
import java.util.Scanner;
public class Ex_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        double a, b, c;

        System.out.println("Digite tres numeros reais:");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        if (a <= b && a <= c) {
            if (b <= c) System.out.println(a + ", " + b + ", " + c);
            else System.out.println(a + ", " + c + ", " + b);
        } else if (b <= a && b <= c) {
            if (a <= c) System.out.println(b + ", " + a + ", " + c);
            else System.out.println(b + ", " + c + ", " + a);
        } else {
            if (a <= b) System.out.println(c + ", " + a + ", " + b);
            else System.out.println(c + ", " + b + ", " + a);
        }
    }
}

	