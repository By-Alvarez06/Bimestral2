package paquete02;

import paquete01.Cliente;

public class TrajeInformal extends Traje{
    private Cliente cliente;
    private double valorGorra;
    private double valorCamiseta;
    private double valorPantaloneta;
    
    public TrajeInformal(double valB, Cliente c, double valG, double valC, double valP){
        super(valB);
        cliente = c;
        valorGorra = valG;
        valorCamiseta = valC;
        valorPantaloneta = valP;
    }

    public void establecerCliente(Cliente n) {
        cliente = n;
    }

    public void establecerValorGorra(double n) {
        valorGorra = n;
    }

    public void establecerValorCamiseta(double n) {
        valorCamiseta = n;
    }

    public void establecerValorPantaloneta(double n) {
        valorPantaloneta = n;
    }
    
    @Override
    public void calcularValorFinal(){
        if (cliente.obtenerEdad() >= 20) {
            valorGorra = valorGorra * 0.5;
        }
        valorFinal = valorBase + valorCamiseta + valorGorra + valorPantaloneta;
    }

    public Cliente obtenerCliente() {
        return cliente;
    }

    public double obtenerValorGorra() {
        return valorGorra;
    }

    public double obtenerValorCamiseta() {
        return valorCamiseta;
    }

    public double obtenerValorPantaloneta() {
        return valorPantaloneta;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("\nTraje Informal:%s"
                + "\nValor Base: %.2f"
                + "\nValor Gorra: %.2f"
                + "\nValor Camiseta: %.2f"
                + "\nValor Pantaloneta: %.2f"
                + "\nValor Final: %.2f\n", 
                cliente.toString(), valorBase, valorGorra, valorCamiseta, 
                valorPantaloneta, valorFinal);
        return cadena;
    }
}
