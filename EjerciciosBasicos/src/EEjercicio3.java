public class EEjercicio3 {
    public static void main(String[] args) throws Exception {
        //Ejercicio 3 — Sensor de temperatura
        //Un sensor industrial registra temperaturas
        
        //EJERCICIO #3
        
        double TempAct = 40; //en celcius
        String NombreSen = "Alarma";
        int NumLectura = 2;
        boolean enAlarma = false;

        if (TempAct>80) {
            enAlarma = true;
        }

        System.out.println("=== Estado del sensor ===");
        System.out.println("temperatura actual: "+ TempAct);
        System.out.println("nombre: "+ NombreSen);
        System.out.println("numero lectura: "+ NumLectura);
        System.out.println("Alarma activa: "+ enAlarma);
        
    }
}
