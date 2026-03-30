public class Rapido {
    //Quicsort

	public static void ordenar(int[] arr, int inicio, int fin) {
		if (inicio < fin) {
			int indiceParticion = particion(arr, inicio, fin);

			ordenar(arr, inicio, indiceParticion - 1);
			ordenar(arr, indiceParticion + 1, fin);
		}
	}

	private static int particion(int[] arr, int inicio, int fin) {
		int pivote = arr[fin];
		int i = (inicio - 1);

		for (int j = inicio; j < fin; j++) {
			if (arr[j] < pivote) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}

		int temp = arr[i + 1];
		arr[i + 1] = arr[fin];
		arr[fin] = temp;

		return i + 1;
	}
}