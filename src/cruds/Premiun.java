package cruds;

public class Premiun {
    String Num,Transporte,Equipaje,Hospedaje,Alimentacion;
    double Precio;

    public Premiun(String Num, String Transporte, String Equipaje, String Hospedaje, String Alimentacion, double Precio) {
        this.Num = Num;
        this.Transporte = Transporte;
        this.Equipaje = Equipaje;
        this.Hospedaje = Hospedaje;
        this.Alimentacion = Alimentacion;
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

    public String getHospedaje() {
        return Hospedaje;
    }

    public String getAlimentacion() {
        return Alimentacion;
    }

    public double getPrecio() {
        return Precio;
    }


    @Override
    public String toString() {
        return String.format(
                "+----------- PREMIUM ------------+%n"
                + "| • Numero: %-18s |%n"
                + "| • Transporte: %-15s |%n"
                + "| • Equipaje: %-17s |%n"
                + "| • Hospedaje: %-16s |%n"
                + "| • Alimentacion: %-13s |%n"
                + "| • Precio: $%-16.2f |%n"
                + "+-------------------------------+",
                getNum(),
                getTransporte(),
                getEquipaje(),
                getHospedaje(),
                getAlimentacion(),
                getPrecio()
        );
    }
    
}
