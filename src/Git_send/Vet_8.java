package Git_send;

public class Vet_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] v = {10, 5, 2, 40, 55, 3, 1, 9, 12, 18};
        int min = v[0], max = v[0];

        for (int i = 1; i < 10; i++) {
            if (v[i] < min) min = v[i];
            if (v[i] > max) max = v[i];
        }
        System.out.println("Mínimo: " + min + " | Máximo: " + max);
    }
}