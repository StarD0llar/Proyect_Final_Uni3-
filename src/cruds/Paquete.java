package cruds;

public class Paquete {
    String Nombre,Descripcion,Duracion,Categoria;
    int Precio;

    public Paquete(String Nombre, String Descripcion, String Duracion, String Categoria, int Precio) {
        this.Nombre = Nombre;
        this.Descripcion = Descripcion;
        this.Duracion = Duracion;
        this.Categoria = Categoria;
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

    public String getCategoria() {
        return Categoria;
    }

    public int getPrecio() {
        return Precio;
    }

@Override
public String toString() {
    String incluyeContent;
    
    switch(getCategoria().toLowerCase()) {
        case "economico":
            incluyeContent = "|   - Transporte básico             |%n"
                          + "|   - Mapa turístico                |%n"
                          + "|   - Desayuno continental          |";
            break;
            
        case "vip":
            incluyeContent = "|   - Transporte privado           |%n"
                          + "|   - Guía turístico personal      |%n"
                          + "|   - Cena gourmet                 |%n"
                          + "|   - Acceso a lounges exclusivos  |";
            break;
            
        case "premium":
            incluyeContent = "|   - Limusina con chofer         |%n"
                          + "|   - Tour personalizado          |%n"
                          + "|   - Chef privado                |%n"
                          + "|   - Spa y masajes incluidos     |%n"
                          + "|   - Asistente personal 24/7    |";
            break;
            
        default:
            incluyeContent = "|   - Servicios estándar          |";
    }

    return String.format(
            "----------------------- PAQUETE -------------------%n"
          + "| Nombre: %-40s |%n"
          + "| Descripcion: %-37s |%n"
          + "| Duracion: %-38s |%n"
          + "| Precio: $%-37.2f |%n"
          + "| Categoria: %-36s |%n"
          + "| Incluye:                                      |%n"
          + incluyeContent + "%n"
          + "--------------------------------------------------",
            getNombre(), 
            getDescripcion(), 
            getDuracion(), 
            getCategoria(),
            getPrecio()
    );

}
}
