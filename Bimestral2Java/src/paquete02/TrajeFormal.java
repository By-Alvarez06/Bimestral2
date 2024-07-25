package paquete02;

import paquete01.Cliente;

public class TrajeFormal extends Traje{
    private Cliente cliente;
    private double porcentajeDescuento;
    private double valorDescuento;
    private double valorSueter;
    private double valorPantalon;
    private double valorCamisa;
    private double valorCorbata;
    
    public TrajeFormal(double valB, Cliente c, double porc, 
            double valS, double valP, double valCa, double valCo){
        super(valB);
        cliente = c;
        porcentajeDescuento = porc;
        valorSueter = valS;
        valorPantalon = valP;
        valorCamisa = valCa;
        valorCorbata = valCo;
    }

    public void establecerCliente(Cliente n) {
        cliente = n;
    }

    public void establecerPorcentajeDescuento(double n) {
        porcentajeDescuento = n;
    }

    public void calcularValorDescuento() {
        valorDescuento = valorBase * (porcentajeDescuento / 100);
    }

    public void establecerValorSueter(double n) {
        valorSueter = n;
    }
    
    public void establecerValorPantalon(double n) {
        valorPantalon = n;
    }
    
    public void establecerValorCamisa(double n) {
        valorCamisa = n;
    }
    
    public void establecerValorCorbata(double n) {
        valorCorbata = n;
    }
    
    @Override
    public void calcularValorFinal(){
        valorFinal = valorBase + valorCamisa + valorCorbata 
                + valorPantalon + valorSueter - valorDescuento;
    }

    public Cliente obtenerCliente() {
        return cliente;
    }

    public double obtenerPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public double obtenerValorDescuento() {
        return valorDescuento;
    }

    public double obtenerValorSueter() {
        return valorSueter;
    }

    public double obtenerValorPantalon() {
        return valorPantalon;
    }

    public double obtenerValorCamisa() {
        return valorCamisa;
    }

    public double obtenerValorCorbata() {
        return valorCorbata;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("\nTraje Formal Secundaria:%s"
                + "\nValor Base: %.2f"
                + "\nPorcentaje Descuento: %.2f"
                + "\nValor Descuento: %.2f"
                + "\nValor Sueter: %.2f"
                + "\nValor Pantalon: %.2f"
                + "\nValor Camisa: %.2f"
                + "\nValor Corbata: %.2f"
                + "\nValor Final: %.2f\n", 
                cliente.toString(), valorBase, porcentajeDescuento, 
                valorDescuento, valorSueter, valorPantalon, valorCamisa, 
                valorCorbata, valorFinal);
        return cadena;
    }
}
