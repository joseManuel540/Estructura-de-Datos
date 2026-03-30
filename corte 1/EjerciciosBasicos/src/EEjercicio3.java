/*Ejercicio 3 — Sensor de temperatura
Un sensor industrial registra temperaturas
Temperatura actual en Celsius (double)
Nombre del sensor (String)
Número de lectura (int)
Si la temperatura supera el límite de 80°C, una variable boolean 
llamada enAlarma debe ser true */

public class EEjercicio3 {
    public static void main(String[] args) {
        
        double TempAct = 90; //en celcius
        String NombreSen = "Alarma";
        int NumLectura = 2;
        boolean enAlarma;

        if (TempAct>80) {
            enAlarma = true;
        }
        else {
            enAlarma = false;
        }

        System.out.println("====== Estado del sensor ======");
        System.out.println("temperatura actual: "+ TempAct);
        System.out.println("nombre: "+ NombreSen);
        System.out.println("numero lectura: "+ NumLectura);
        System.out.println("Alarma activada: "+ enAlarma);
        
    }
}
