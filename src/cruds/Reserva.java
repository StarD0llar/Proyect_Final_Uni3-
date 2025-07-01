package cruds;

public class Reserva {
    String nombre, direccion;
    int dni, celular;
    Paquete paquete;
    Carros carro;

    public Reserva(String nombre, String direccion, int dni, int celular, Paquete paquete, Carros carro) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.dni = dni;
        this.celular = celular;
        this.paquete = paquete;
        this.carro = carro;
    }

    public int getDni() {
        return dni;
    }


    @Override
    public String toString() {
        return "Reserva{" + "nombre=" + nombre + ", direccion=" + direccion + ", dni=" + dni + ", celular=" + celular + ", paquete=" + paquete + ", carro=" + carro + '}';
    }
}
