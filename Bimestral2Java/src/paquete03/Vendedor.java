package paquete03;

public class Vendedor {
    private String nombre;
    private String apellido;
    
    public Vendedor(String n, String a){
        nombre = n;
        apellido = a;
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerApellido(String n) {
        apellido = n;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerApellido() {
        return apellido;
    }
    
    
}
