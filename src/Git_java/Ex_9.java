package Git_java;

import java.util.Scanner;

public class Ex_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double preco;
		double desconto;
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o preço do produto ");
		preco = sc.nextDouble();
		desconto = preco - (preco * 0.10);
		System.out.printf("O preço com o produto do desconto é %f", desconto);
		
		
		
		

	}

}
