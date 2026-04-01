package Git_send;

import java.util.Scanner;

public class Vet12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        float[] v = new float[10];
        float[] maiores = new float[10];
        int cont = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Float " + i + ": ");
            v[i] = sc.nextFloat();
            if (v[i] > 5) {
                maiores[cont] = v[i];
                cont++;
            }
        }

        System.out.print("Valores > 5: ");
        for (int i = 0; i < cont; i++) System.out.print(maiores[i] + " ");
    }

	}


