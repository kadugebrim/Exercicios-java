package Git_send;

public class Vet9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] v = {3, 5, 9, 12, 14};
        int[] novo = new int[5];
        int cont = 0;

        for (int i = 0; i < 5; i++) {
            if (v[i] % 3 == 0) {
                novo[cont] = v[i];
                cont++;
            }
        }
        System.out.print("Múltiplos de 3: ");
        for (int i = 0; i < cont; i++) System.out.print(novo[i] + " ");
    }
}