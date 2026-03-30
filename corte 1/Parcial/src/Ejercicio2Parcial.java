import java.util.Scanner;

public class Ejercicio2Parcial {
    public static void main(String[] args) {
        Mascota mascota[] = new Mascota[5];
        Scanner sc = new Scanner(System.in);
        int encontrado = -1;
        double suma = 0;
        double prom = 0;

        System.out.println("Ingrese los datos de las mascotas");

        for (int i = 0; i < mascota.length; i++) {
            System.out.println("\nMascota #" + (i+1));
            System.out.println("Ingrese el historial: ");
            int historial = sc.nextInt();
            sc.nextLine();
            System.out.println("Ingrese el nombre: ");
            String nombre = sc.nextLine();
            System.out.println("Ingrese la edad: ");
            int edad = sc.nextInt();

            Mascota m = new Mascota(historial, nombre, edad);
            mascota[i] = m;
        }

        System.out.println("\nMascotas no ordenadas: ");
        System.out.println("");
        for (int i = 0; i < mascota.length; i++) {
            mascota[i].MostrarInformacion();
        }
        ordenar(mascota);

        System.out.println("\nMascotas ordenadas: ");
        System.out.println("");
        for (int i = 0; i < mascota.length; i++) {
            mascota[i].MostrarInformacion();
        }

        System.out.println("\nPorfavor ingrese el historial a buscar: ");
        int buscarH = sc.nextInt();
        int index = busquedaBinaria(mascota, buscarH);
        if (index != encontrado) {
            EncontrarNombre(mascota, index);
        } else  {
            System.out.println("Mascota no encontrada");
        }

        Promedio(mascota, suma, prom);
        sc.close();
    }

    public static void ordenar(Mascota[] arr) {
        //SelectionSort
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int indiceMinimo = i;
        for (int j = i + 1; j < n; j++) {
            if (arr[j].Historial < arr[indiceMinimo].Historial) {
                indiceMinimo = j;
                }
        }
        // Intercambiar el elemento mínimo encontrado con el primero
        Mascota temp = arr[indiceMinimo];
        arr[indiceMinimo] = arr[i];
        arr[i] = temp;
        }
    }

    public static int busquedaBinaria(Mascota[] arr, int objetivo) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;   // evita overflow
            if (arr[mid].Historial == objetivo) {
                return mid;
                
            } else if (arr[mid].Historial < objetivo) {
                low = mid + 1;    
                // buscar en mitad derecha
                
            } else {
                high = mid - 1;   // buscar en mitad izquierda
            }
        }
        return -1;
    }

    public static void Promedio(Mascota[] arr, double suma, double prom){
        for (int i = 0; i < arr.length; i++) {
            suma = suma + arr[i].Edad;
        }
        System.out.println("\nLa suma de edades es: " + suma);
        prom = suma/arr.length;
        System.out.println("El promedio de edades de todas las mascotas es: " + (prom) );
    }

    public static void EncontrarNombre(Mascota[] arr, int index){
        String nombre = arr[index].Nombre;
        System.out.println("La mascota se encontro con el nombre: " + nombre);
    }
}
