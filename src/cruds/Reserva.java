package cruds;

public class Reserva {
    String nombre, direccion,dni, celular, fecha;
    Paquete paquete;
    int personas;
    Carros carro;

    public Reserva(String nombre, String direccion, String dni, String celular,String fecha, Paquete paquete, int personas, Carros carro) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.dni = dni;
        this.celular = celular;
        this.fecha = fecha;
        this.paquete = paquete;
        this.personas = personas;        
        this.carro = carro;
    }

    public String getDni() {
        return dni;
    }

@Override
public String toString() {
    double total = paquete.getPrecio() * personas;
    String categoria = paquete.getCategoria().toLowerCase();
    String fechaEmision = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new java.util.Date());
    
    return String.format(
        "+------------------------------------------------------------+%n" +
        "|               SHAYANDERO TOURS - COMPROBANTE               |%n" +
        "+------------------------------------------------------------+%n" +
        "| CLIENTE: %-49s |%n" +
        "| DNI: %-53s |%n" +
        "| TELEFONO: %-48s |%n" +
        "| DIRECCION: %-47s |%n" +
        "| FECHA RESERVA: %-44s |%n" +
        "+------------------------------------------------------------+%n" +
        "| PAQUETE: %-49s |%n" +
        "| CATEGORIA: %-46s |%n" +
        "| DURACION: %-48s |%n" +
        "| PERSONAS: %-47d |%n" +
        "+------------------------------------------------------------+%n" +
        "%s" + 
        "+------------------------------------------------------------+%n" +
        "| VEHICULO: %-48s |%n" +
        "| MODELO: %-50s |%n" +
        "| CAPACIDAD: %-46d |%n" +
        "+------------------------------------------------------------+%n" +
        "| TOTAL: $%-49.2f |%n" +
        "+------------------------------------------------------------+%n" +
        "%s" + 
        "|                                                          |%n" +
        "| Fecha emisión: %-42s |%n" +
        "+------------------------------------------------------------+%n",
        nombre,
        dni,
        celular,
        direccion,
        fecha,
        paquete.getNombre(),
        paquete.getCategoria(),
        paquete.getDuracion(),
        personas,
        getDetallesCategoria(categoria),
        carro.getNum(),
        carro.getModelo(),
        carro.getCapacidad(),
        total,
        getNotasCategoria(categoria),
        fechaEmision  
    );
}

private String getDetallesCategoria(String categoria) {
    switch(categoria) {
        case "premium":
            return String.format(
                "| INCLUYE:%-48s |%n" +
                "|   - Transporte ejecutivo con chofer%-25s |%n" +
                "|   - Hospedaje 4 estrellas%-34s |%n" +
                "|   - Alimentacion buffet premium%-27s |%n",
                "", "", "");
            
        case "vip":
            return String.format(
                "| INCLUYE:%-48s |%n" +
                "|   - Transporte privado 24/7%-30s |%n" +
                "|   - Suite en hotel 5*%-37s |%n" +
                "|   - Chef personalizado%-34s |%n",
                "", "", "");
        case "economico":
            return String.format(
                "| INCLUYE:%-48s |%n" +
                "|   - Transporte compartido%-33s |%n" +
                "|   - Alojamiento basico%-36s |%n" +
                "|   - Desayuno continental%-32s |%n",
                "", "", "");
            
        default: 
            return String.format(
                "| INCLUYE:%-48s |%n" +
                "|   - Transporte compartido%-33s |%n" +
                "|   - Alojamiento basico%-36s |%n" +
                "|   - Desayuno continental%-32s |%n",
                "", "", "");
    }
}

private String getNotasCategoria(String categoria) {
    switch(categoria) {
        case "premium":
            return "| NOTA: Presentar tarjeta Premium al check-in%-23s |%n";
        case "vip":
            return "| NOTA: Acceso exclusivo con identificacion VIP%-20s |%n";
        case "economico":
            return "| NOTA: Presentar DNI y comprobante de pago%-21s |%n";
        default:
            return "| NOTA: Presentar DNI y comprobante de pago%-21s |%n";
    }
}







}