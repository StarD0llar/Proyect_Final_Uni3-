package cruds;

public class Paquete {
    String Num,Nombre,Descripcion,Duracion,Categoria;
    double Precio;

    public Paquete(String Num,String Nombre, String Descripcion, String Duracion, String Categoria, double Precio) {
        this.Num = Num;
        this.Nombre = Nombre;
        this.Descripcion = Descripcion;
        this.Duracion = Duracion;
        this.Categoria = Categoria;
        this.Precio = Precio;
    }

    public String getNum() {
        return Num;
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

    public double getPrecio() {
        return Precio;
    }

@Override
public String toString() {
    return String.format(
            "----------------------- PAQUETE -------------------%n"
          + "| Num: %-43s |%n"
          + "| Nombre: %-40s |%n"
          + "| Descripcion: %-37s |%n"
          + "| Duracion: %-38s |%n"
          + "| Categoria: %-36s |%n"
          + "| Precio: $%-37.2f |%n"                    
          + "--------------------------------------------------",
            getNum(),
            getNombre(), 
            getDescripcion(), 
            getDuracion(), 
            getCategoria(),
            getPrecio()
    );

}
}
