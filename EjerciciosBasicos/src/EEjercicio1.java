public class EEjercicio1 {
    public static void main(String[] args) throws Exception {
        /*Ejercicio 1 — Ficha de un estudiante
        Un sistema universitario necesita registrar la 
        información básica de un estudiante: nombre completo, 
        código (número entero), semestre actual, promedio
        acumulado y si está matriculado o no. */

        String nombre = "Jose Manuel Salazar Ropero";
        int codigo = 1065878828;
        int semestre = 4;
        double promedio = 3.85;
        Boolean matriculado = true;
        
        System.out.println("======== Ficha estudiante ========");
        System.out.println("nombre: "+ nombre);
        System.out.println("codigo: "+ codigo);
        System.out.println("semestre: "+ semestre);
        System.out.println("promedio: "+ promedio);
        System.out.println("matriculado: "+ matriculado);
    
    }
}
