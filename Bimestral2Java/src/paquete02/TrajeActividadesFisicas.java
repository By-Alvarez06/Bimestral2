package paquete02;

import paquete01.Cliente;

public class TrajeActividadesFisicas extends Traje{
    private Cliente cliente;
    private double valorCalentador;
    private double valorMedias;
    
    public TrajeActividadesFisicas(double valB, Cliente c, double valC, double valM){
        super(valB);
        cliente = c;
        valorCalentador = valC;
        valorMedias = valM;
    }

    public void establecerCliente(Cliente n) {
        cliente = n;
    }

    public void establecerValorCalentador(double n) {
        valorCalentador = n;
    }

    public void establecerValorMedias(double n) {
        valorMedias = n;
    }
    
    @Override
    public void calcularValorFinal(){
        if (cliente.obtenerCiudad().equals("loja") || 
                cliente.obtenerCiudad().equals("quito")) {
            valorMedias = valorMedias * 0.4;
        }
        valorFinal = valorBase + valorMedias + valorCalentador;
    }

    public Cliente obtenerCliente() {
        return cliente;
    }

    public double obtenerValorCalentador() {
        return valorCalentador;
    }

    public double obtenerValorMedias() {
        return valorMedias;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("\nTraje de Actividades Fisicas:%s"
                + "\nValor Base: %.2f"
                + "\nValor Calentador: %.2f"
                + "\nValor Medias: %.2f" 
                + "\nValor Final: %.2f\n", 
                cliente.toString(), valorBase, valorCalentador, valorMedias, 
                valorFinal);
        return cadena;
    }
}
