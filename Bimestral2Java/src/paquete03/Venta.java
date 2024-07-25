package paquete03;

import java.util.ArrayList;
import paquete02.*;

public class Venta {
    private Vendedor vendedor;
    private ArrayList<Traje> listaTrajes;
    private double valorFacturar;
    
    public Venta(Vendedor v, ArrayList<Traje> lista){
        vendedor = v;
        listaTrajes = lista;
    }

    public void establecerVendedor(Vendedor n) {
        vendedor = n;
    }

    public void establecerListaTrajes(ArrayList<Traje> n) {
        listaTrajes = n;
    }

    public void calcularValorFacturar() {
        for (Traje traje : listaTrajes) {
            valorFacturar += traje.obtenerValorFinal();
        }
    }

    public Vendedor obtenerVendedor() {
        return vendedor;
    }

    public ArrayList<Traje> obtenerListaTrajes() {
        return listaTrajes;
    }

    public double obtenerValorFacturar() {
        return valorFacturar;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("Lista de Trajes a Facturar"
                + "\nNombre del Vendedor: %s"
                + "\nApellido del Vendedor: %s"
                , vendedor.obtenerNombre(), vendedor.obtenerApellido());
        
        for (int i = 0; i < listaTrajes.size(); i++) {
            cadena = String.format("%s\n%s", cadena, listaTrajes.get(i));
        }
        
        cadena = String.format("%s"
                + "\nValor a Facturar Total: %.2f\n", cadena, valorFacturar);
        
        return cadena;
    }
}
