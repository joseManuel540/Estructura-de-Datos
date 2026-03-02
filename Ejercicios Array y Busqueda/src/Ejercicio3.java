/*3. Sensor de Temperatura (Control de Calidad)
Una máquina industrial registra la temperatura cada 10 minutos y guarda los datos en un arreglo.
El Problema: Al final del día, el supervisor quiere saber cuál fue la temperatura más alta 
registrada para asegurarse de que la máquina no se recalentó.
Algoritmo a usar: Búsqueda Lineal de Máximo. Debes recorrer todo el arreglo comparando cada 
valor para encontrar el mayor de todos. */

public class Ejercicio3 {
    public static void main(String[] args) {
        double[] temperatura = {35,28,35.5,40,30,60,80,45,45.4,39.7,43.8};
        double max = temperatura[0];

        for (int i = 0; i < temperatura.length; i++) {
            if (max < temperatura[i]) {
                max = temperatura[i];
            }
        }

        System.out.println("La temperatura mas alta es: " + max);
    }
}
