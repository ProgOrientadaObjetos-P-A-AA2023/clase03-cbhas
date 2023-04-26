package manejoclases02;

public class Ejecutable {

    public static void main(String[] args) {
        // Se crea un objeto
        Hospital hospital = new Hospital();

        // Se asigna valores particulares al objeto
        hospital.establecerNombre("Isidro Ayora");
        hospital.establecerNumeroCamas(100);
        hospital.establecerPresupuesto(560340.43);

        // Se presenta valores en pantalla
        System.out.printf("%s - %d - %.2f\n", hospital.obtenerNombre(),
                hospital.obtenerNumeroCamas(), hospital.obtenerPresupuesto());
    }
}
