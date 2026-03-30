/*Ejercicio 8 — Historial de mensajes
Un chat guarda el último mensaje enviado. Se usan dos variables String:
ultimoMensaje = "Hola"
copiaTexto = ultimoMensaje
Luego copiaTexto se cambia a "¿Cómo estás?"
Muestra ambas variables y explica en un comentario por qué ultimoMensaje
no cambió (inmutabilidad de String). */

public class EEjercicio8 {
    public static void main(String[] args) {  

        String ultimoMensaje = "Hola";
        String copiaTexto = ultimoMensaje;
        copiaTexto = "¿Como estas?";

        System.out.println(ultimoMensaje);
        System.out.println(copiaTexto);

        //String se comporta como un valor por referencia, es inmutable, 
        //al cambiar copia texto se crea un nuevo objeto y no modifica el original
        //que seria "ultimoMensaje"
    }
}
