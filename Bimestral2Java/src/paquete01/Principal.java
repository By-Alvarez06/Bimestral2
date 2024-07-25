package paquete01;
import java.util.ArrayList;
import paquete02.*;
import paquete03.*;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Traje> listaTrajes = new ArrayList<>();
        
        Cliente cliente1 = new Cliente("Erick Toledo", "1101", "Loja", 20);
        Cliente cliente2 = new Cliente("Byron Alvarez", "1102", "Cuenca", 18);
        Cliente cliente3 = new Cliente("Andres Cardenas", "1103", "Quito", 21);
        
        TrajeInformal informal1 = new TrajeInformal(50, cliente1, 20, 25, 30);
        TrajeInformal informal2 = new TrajeInformal(60, cliente2, 30, 35, 40);
        informal1.calcularValorFinal();
        informal2.calcularValorFinal();
        listaTrajes.add(informal1);
        listaTrajes.add(informal2);
        
        TrajeFormal formal1 = new TrajeFormal(60, cliente2, 15, 32, 40, 25, 10);
        TrajeFormal formal2 = new TrajeFormal(60, cliente3, 25, 42, 50, 60, 15);
        formal1.calcularValorDescuento();
        formal1.calcularValorFinal();
        formal2.calcularValorDescuento();
        formal2.calcularValorFinal();
        listaTrajes.add(formal1);
        listaTrajes.add(formal2);
        
        TrajeActividadesFisicas fisica1 = new TrajeActividadesFisicas(30, cliente1, 28, 8);
        TrajeActividadesFisicas fisica2 = new TrajeActividadesFisicas(60, cliente3, 30, 10);
        fisica1.calcularValorFinal();
        fisica2.calcularValorFinal();
        listaTrajes.add(fisica1);
        listaTrajes.add(fisica2);
        
        Vendedor vendedor1 = new Vendedor("Daniel", "Campoverde");
        Venta venta1 = new Venta(vendedor1, listaTrajes);
        
        venta1.calcularValorFacturar();
        
        System.out.printf("%s", venta1);
    }
    
}
