package Git_java;

import java.util.Scanner;

public class Ex_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
              Scanner sc = new Scanner(System.in);
              System.out.print("Digite seu peso em kg " ); 
              double peso = sc.nextDouble();
              System.out.print("Digite sua altura em metros " );
              double altura = sc.nextDouble();
              double imc = peso / (altura * altura); 
              System.out.printf("Seu imc é %.2f", imc);
              
  
	}

}
