package Git_java;

import java.util.Scanner;

public class Ex_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           int num;
           int numdois;
           int maior;
           int menor;
           Scanner sc = new Scanner(System.in);
           System.out.println("Digite um número inteiro "); 
           num = sc.nextInt();
           System.out.println("Digite outro número inteiro ");
           numdois = sc.nextInt();
        	   if (num > numdois) {
        			  maior = num;
        	   } else { 
        		   maior = numdois; 
        		   }
        	   if (numdois > num) {
        		   menor = num;
        	   } else {
        		   menor = numdois;
        	   }
        
        	   System.out.println(menor+","+maior );
        	   
        	   
        	   }
           
          
	}


