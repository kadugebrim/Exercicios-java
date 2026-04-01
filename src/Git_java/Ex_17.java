package Git_java;
import java.util.Scanner;
public class Ex_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        double salario, novoSalario;

        System.out.print("Digite o salario do funcionario: ");
        salario = sc.nextDouble();

        if (salario < 1000.00) {
            novoSalario = salario * 1.10; 
        } else {
            novoSalario = salario * 1.05; 
        }

        System.out.printf("O novo salario e: R$ %.2f%n", novoSalario);
    }
}
