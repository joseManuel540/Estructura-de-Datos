/*Ejercicio 6 — Turno en un banco
Un cajero de banco trabaja con el número del turno actual. Se crea una 
variable turnoActual y se asigna a turnoEnPantalla.

Demuestra con código que cambiar turnoEnPantalla no afecta a 
turnoActual (comportamiento por valor).
Explica en un comentario por qué ocurre esto.*/

public class EEjercicio6 {
    public static void main(String[] args) {  

        int turnoActual = 3;
        int turnoEnPantalla = turnoActual;

        //antes de cambio
        System.out.println("turno actual: "+turnoActual);
        System.out.println("Turno en pantalla: "+ turnoEnPantalla);
        turnoEnPantalla = 5;

        //despues de cambio
        System.out.println("turno actual: "+turnoActual);
        System.out.println("Turno en pantalla: "+ turnoEnPantalla);

        /*no cambia porque en variables primitivas (por valor) al asignar
        una variable se copia el valor de la variable que se asigna,
        entonces por eso al cambiar el valor de la variable no afecta a la 
        original
         */
    }
}
