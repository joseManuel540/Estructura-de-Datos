/*3. Sensor de Temperatura (Control de Calidad)
Una máquina industrial registra la temperatura cada 10 minutos y guarda los datos en un arreglo.
El Problema: Al final del día, el supervisor quiere saber cuál fue la temperatura más alta 
registrada para asegurarse de que la máquina no se recalentó.
Algoritmo a usar: Búsqueda Lineal de Máximo. Debes recorrer todo el arreglo comparando cada 
valor para encontrar el mayor de todos. */

public class Ejercicio3 {
    public static void main(String[] args) {
        double[] temperatura = {35 ,28 ,35.5 ,40 ,30 ,60 ,80 ,45 ,45.4 ,39.7 ,43.8};
        double max = temperatura[0];

        for (int i = 0; i < temperatura.length; i++) {
            if (max < temperatura[i]) {
                max = temperatura[i];
            }
        }

        System.out.println("La temperatura mas alta es: " + max);
    }

    public static int busquedaInterpolacion(int[] arr, int objetivo) {
int low = 0;
int high = arr.length - 1;
while (low <= high && objetivo >= arr[low] && objetivo <= arr[high]) {
if (low == high) {
if (arr[low] == objetivo) return low;
return -1;
}
// Estimación de posición por interpolación
int pos = low + ((objetivo - arr[low]) * (high - low))
/ (arr[high] - arr[low]);
if (arr[pos] == objetivo) {
return pos;
} else if (arr[pos] < objetivo) {
low = pos + 1;    
// buscar a la derecha
} else {
high = pos - 1;   // buscar a la izquierda
}
}
return -1;
}

}
