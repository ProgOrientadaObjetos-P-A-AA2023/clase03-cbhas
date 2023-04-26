package manejoclases01;

public class Ejecutable {
    public static void main(String[] args) {
        // Se crea un objeto
        Hospital hospital = new Hospital();
        
        // Se asigna valores particulares al objeto
        hospital.nombre = "Isidro Ayora";
        hospital.numeroCamas = 100;
        hospital.presupuesto = 560340.43;
        
        // Se presenta valores en pantalla
        System.out.printf("%s - %d - %.1f\n", hospital.nombre,
                hospital.numeroCamas, hospital.presupuesto);
        
        // System.out.println(hospital.nombre + "-" + hospital.numeroCamas);
        
        Hospital hospitalLoja = new Hospital();
        
        hospitalLoja.nombre = "IESS";
        hospitalLoja.numeroCamas = 200;
        hospitalLoja.presupuesto = 1234567.89;
        
        System.out.printf("%s - %d - %.2f\n", hospitalLoja.nombre,
                hospitalLoja.numeroCamas, hospitalLoja.presupuesto);
    }
}

// Sebastián Calderón
