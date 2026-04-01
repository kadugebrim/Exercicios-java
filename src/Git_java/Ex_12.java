package Git_java;

import java.util.Scanner;

public class Ex_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int num;
        int numdois;
        int numtres;
       int menor;
       Scanner sc = new Scanner(System.in);
       System.out.println("Digite um numero inteiro ");
       num = sc.nextInt();
       System.out.println("Digite um numero inteiro ");
       numdois = sc.nextInt();
       System.out.println("Digite um numero inteiro ");
       numtres = sc.nextInt();
       menor = num;
       if (menor > numdois) {
    	   menor = numdois;
    	}
       if (menor > numtres) {
    	   menor = numtres;
       }
     System.out.printf("O menor número dos três é o número %d ", menor);
    	   
       }
       
     
	}


