package Git_java;
import java.util.Scanner;
public class Ex_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int idade;

        System.out.print("Digite a idade: ");
        idade = sc.nextInt();

        if (idade <= 9) System.out.println("Categoria: Mirim");
        else if (idade <= 13) System.out.println("Categoria: Infantil");
        else if (idade <= 17) System.out.println("Categoria: Juvenil");
        else System.out.println("Categoria: Adulto");
    }
}
       
	
