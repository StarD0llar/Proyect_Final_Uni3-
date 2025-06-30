package cruds;

public class Economic {
    String Nombre,Descripcion,Duracion;
    int Precio;

    public Economic(String Nombre, String Descripcion, String Duracion, int Precio) {
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
            "---------------- PAQUETE ECONÓMICO ----------------%n"
          + "| Nombre: %-40s |%n"
          + "| Descripción: %-37s |%n"
          + "| Duración: %-38s |%n"
          + "| Precio: $%-37.2f |%n"
          + "| Incluye:                                      |%n"
          + "|   - Transporte                                |%n"
          + "|   - Mapa                                      |%n"
          + "|   - Alimentación                              |%n"
          + "--------------------------------------------------",
            getNombre(), getDescripcion(), getDuracion(), getPrecio()
            
    );
}
}
