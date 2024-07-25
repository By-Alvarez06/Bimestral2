package paquete01;

public class Cliente {
    private String nombres;
    private String cedula;
    private String ciudad;
    private int edad;
    
    public Cliente(String n, String ced, String ciu, int e){
        nombres = n;
        cedula = ced;
        ciudad = ciu.toLowerCase();
        edad = e;
    }

    public void establecerNombres(String n) {
        nombres = n;
    }

    public void establecerCedula(String n) {
        cedula = n;
    }

    public void establecerCiudad(String n) {
        ciudad = n.toLowerCase();
    }

    public void establecerEdad(int n) {
        edad = n;
    }

    public String obtenerNombres() {
        return nombres;
    }

    public String obtenerCedula() {
        return cedula;
    }

    public String obtenerCiudad() {
        return ciudad;
    }

    public int obtenerEdad() {
        return edad;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("\nCliente:"
                + "\nNombres: %s"
                + "\nCedula: %s"
                + "\nCiudad: %s"
                + "\nEdad: %d", 
                nombres, cedula, ciudad, edad);
        return cadena;
    }
}
