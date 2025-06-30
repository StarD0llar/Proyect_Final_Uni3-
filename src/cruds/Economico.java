package cruds;

public class Economico {
    String Num,Transporte,Equipaje,Tour;
    double Precio;

    public Economico(String Num, String Transporte, String Equipaje, double Precio) {
        this.Num = Num;
        this.Transporte = Transporte;
        this.Equipaje = Equipaje;
        this.Precio = Precio;
    }

    public String getNum() {
        return Num;
    }

    public String getTransporte() {
        return Transporte;
    }

    public String getEquipaje() {
        return Equipaje;
    }

    public double getPrecio() {
        return Precio;
    }
    

    @Override
    public String toString() {
        return String.format(
                "+--------- ECONÓMICO ---------+%n"
                + "| • Num: %-18s |%n"
                + "| • Transporte: %-13s |%n"
                + "| • Equipaje: %-15s |%n"
                + "| • Precio: $%-14.2f |%n" 
                + "+---------------------------+",
                getNum(),
                getTransporte(),
                getEquipaje(),
                getPrecio() 
        );
    }
    
}
