package manejoclases02;

public class Hospital {

    private String nombre;
    private int numeroCamas;
    private double presupuesto;

    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerNumeroCamas(int nC) {
        numeroCamas = nC;
    }

    public void establecerPresupuesto(double p) {
        presupuesto = p;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public int obtenerNumeroCamas() {
        return numeroCamas;
    }

    public double obtenerPresupuesto() {
        return presupuesto;
    }
}
