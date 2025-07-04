package cruds;

public class Carros {
   String Num,Modelo;
   int Capacidad,Disponible; 

    public Carros(String Num,String Modelo, int Capacidad, int Disponible) {
        this.Num = Num;
        this.Modelo = Modelo;
        this.Capacidad = Capacidad;
        this.Disponible = Disponible;
        
    }

    public String getNum() {
        return Num;
    }

    public String getModelo() {
        return Modelo;
    }

    public int getCapacidad() {
        return Capacidad;
    }

    public int getDisponible() {
        return Disponible;
    }
    public void asiento(){
        if(Disponible > 0) Disponible--;
        
        
    }    
    

    @Override
    public String toString() {
        return String.format(
                "+------------+------------------+----------------+----------------+%n"
                + "| Número: %-4s | Modelo: %-10s | Capacidad: %-4d | Disponible: %-4d |%n"
                + "+------------+------------------+----------------+----------------+",
                getNum(), getModelo(), getCapacidad(), getDisponible()
        );
    }

    
}