public class Mezcla {
    //Merge sort
	public static void ordenar(int[] arr, int izq, int der) {
		if (izq < der) {
			int medio = izq + (der - izq) / 2;

			// Ordenar primera y segunda mitad
			ordenar(arr, izq, medio);
			ordenar(arr, medio + 1, der);

			// Fusionar las mitades ordenadas
			fusionar(arr, izq, medio, der);
		}
	}

	private static void fusionar(int[] arr, int izq, int medio, int der) {
		int n1 = medio - izq + 1;
		int n2 = der - medio;

		int L[] = new int[n1];
		int R[] = new int[n2];

		for (int i = 0; i < n1; ++i)
			L[i] = arr[izq + i];

		for (int j = 0; j < n2; ++j)
			R[j] = arr[medio + 1 + j];

		int i = 0, j = 0;
		int k = izq;

		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			} else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}

		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}

		while (j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}
}