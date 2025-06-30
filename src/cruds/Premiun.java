package cruds;

public class Premiun {
    String Nombre,Descripcion,Duracion;
    int Precio;

    public Premiun(String Nombre, String Descripcion, String Duracion, int Precio) {
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
            "---------------- PAQUETE PREMIUN ------------------%n"
          + "| Nombre: %-40s |%n"
          + "| Descripcion: %-37s |%n"
          + "| Duracion: %-38s |%n"
          + "| Precio: $%-37.2f |%n"
          + "| Incluye:                                      |%n"
          + "|   - Transporte                                |%n"
          + "|   - Mapa                                      |%n"
          + "|   - Hospedaje 3-4 Estrellas                   |%n"
          + "|   - Alimentacion                              |%n"
          + "|   - Kit Viajero                               |%n"
          + "--------------------------------------------------",
            getNombre(), getDescripcion(), getDuracion(), getPrecio()
            
    );
}
}
