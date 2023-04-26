package manejoclases03;

import java.util.Scanner;
import java.util.Locale;

public class Ejecutable05 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        Hospital miHospital = new Hospital();
        
        String nHospital;
        int nCamas;
        double cPresupuesto;
        
        System.out.println("Ingrese el nombre del hospital:");
        nHospital = entrada.nextLine();
        miHospital.establecerNombre(nHospital);
        
        System.out.println("Ingrese el número de camas:");
        nCamas = entrada.nextInt();
        miHospital.establecerNumeroCamas(nCamas);
        
        System.out.println("Ingrese el presupuesto:");
        cPresupuesto = entrada.nextDouble();
        miHospital.establecerPresupuesto(cPresupuesto);
        
        System.out.printf("\n%s - %d - %.2f\n", miHospital.obtenerNombre(), 
                miHospital.obtenerNumeroCamas(), miHospital.obtenerPresupuesto());

    }

}
