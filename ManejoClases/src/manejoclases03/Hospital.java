package manejoclases03;

public class Hospital {
    private String nombre;
    private int numeroCamas;
    private double presupuesto;
    
    // métodos establecer para cada atributo
    public void establecerNombre(String n){
        nombre = n;
    }
    
    public void establecerNumeroCamas(int nC){
        numeroCamas = nC;
    }
    
    public void establecerPresupuesto(double p){
        presupuesto = p;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public int obtenerNumeroCamas(){
        return numeroCamas;
    }
    
    public double obtenerPresupuesto(){
        return presupuesto;
    }
    
}
