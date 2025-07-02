package cruds;

public class Reserva {
    String nombre, direccion,dni, celular;
    Paquete paquete;
    int personas;
    Carros carro;

    public Reserva(String nombre, String direccion, String dni, String celular, Paquete paquete, int personas, Carros carro) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.dni = dni;
        this.celular = celular;
        this.paquete = paquete;
        this.personas = personas;        
        this.carro = carro;
    }

    public String getDni() {
        return dni;
    }

    @Override
    public String toString() {
        return "Reserva{" + "nombre=" + nombre + ", direccion=" + direccion + ", dni=" + dni + ", celular=" + celular + ", paquete=" + paquete + ", personas=" + personas + ", carro=" + carro + '}';
    }







}