package cruds;

public class Vip {
    String Nombre,Descripcion,Duracion;
    int Precio;

    public Vip(String Nombre, String Descripcion, String Duracion, int Precio) {
        this.Nombre = Nombre;
        this.Descripcion = Descripcion;
        this.Duracion = Duracion;
        this.Precio = Precio;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public String getDuracion() {
        return Duracion;
    }

    public int getPrecio() {
        return Precio;
    }

@Override
public String toString() {
    return String.format(
            "---------------- PAQUETE VIP ----------------------%n"
          + "| Nombre: %-40s |%n"
          + "| Descripcion: %-37s |%n"
          + "| Duracion: %-38s |%n"
          + "| Precio: $%-37.2f |%n"
          + "| Incluye:                                      |%n"
          + "|   - Transporte 24/7                           |%n"
          + "|   - Mapa                                      |%n"
          + "|   - Hospedaje (5 Estrellas O Suites)          |%n"
          + "|   - Alimentacion (Chef Privado)               |%n"
          + "|   - Kit Viajero + Asistencia personalizada    |%n"
          + "--------------------------------------------------",
            getNombre(), getDescripcion(), getDuracion(), getPrecio()
            
    );
}
}
