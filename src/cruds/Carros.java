package cruds;

public class Carros {
   String Modelo,Capacidad; 

    public Carros(String Modelo, String Capacidad) {
        this.Modelo = Modelo;
        this.Capacidad = Capacidad;
        
    }

    public String getModelo() {
        return Modelo;
    }

    public String getCapacidad() {
        return Capacidad;
    }

    @Override
    public String toString() {
        return "Carros{" + "Modelo =" + Modelo + ", Capacidad=" + Capacidad + '}';
        
    }
}