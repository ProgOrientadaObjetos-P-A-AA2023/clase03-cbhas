package manejoclases03;

public class Ejecutable03 {
    
    public static void main(String[] args) {
    
        Hospital h1 = new Hospital();
        Hospital h2 = new Hospital();
        Hospital h3 = new Hospital();
        
        h1.establecerNombre("Vaca Ortíz");
        h2.establecerNombre("Militar");
        // h3.establecerNombre("Manuel IM");
        
        System.out.printf("%s - %d - %.2f\n", h3.obtenerNombre(), 
                h3.obtenerNumeroCamas(), h3.obtenerPresupuesto());
        
        
    }
}
