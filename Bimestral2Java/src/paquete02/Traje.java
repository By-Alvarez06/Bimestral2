package paquete02;

public abstract class Traje {
    protected double valorBase;
    protected double valorFinal;
    
    public Traje(double valB){
        valorBase = valB;
    }
    
    public void establecerValorBase(double v){
        valorBase = v;
    }
    
    public abstract void calcularValorFinal();
    
    public double obtenerValorBase(){
        return valorBase;
    }
    
    public double obtenerValorFinal(){
        return valorFinal;
    }
}
