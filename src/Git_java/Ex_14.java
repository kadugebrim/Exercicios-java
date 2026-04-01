package Git_java;

import java.util.Scanner;

public class Ex_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double altura, pesoAtual, pesoIdeal;
		char sexo;

		System.out.print("Altura: ");
		altura = sc.nextDouble();
		System.out.print("Peso atual: ");
		pesoAtual = sc.nextDouble();
		System.out.print("Sexo (M/F): ");
		sexo = sc.next().toUpperCase().charAt(0);

		if (sexo == 'M') {
		    pesoIdeal = (72.7 * altura) - 58;
		} else {
		    pesoIdeal = (62.1 * altura) - 44.7;
		}

		if (pesoAtual < pesoIdeal - 1) System.out.println("Abaixo do peso");
		else if (pesoAtual > pesoIdeal + 1) System.out.println("Acima do peso");
		else System.out.println("No peso ideal");
		}
	}


