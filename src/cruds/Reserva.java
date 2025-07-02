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
        getDetallesCategoria(categoria) +
        "+------------------------------------------------------------+%n" +
        "| VEHICULO: %-48s |%n" +
        "| MODELO: %-50s |%n" +
        "| CAPACIDAD: %-46d |%n" +
        "+------------------------------------------------------------+%n" +
        "| TOTAL: $%-49.2f |%n" +
        "+------------------------------------------------------------+%n" +
        getNotasCategoria(categoria) +   
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
        carro.getNum(),
        carro.getModelo(),
        carro.getCapacidad(),
        total,
        fechaEmision  
    );
}

private String getDetallesCategoria(String categoria) {
    switch(categoria) {
        case "premium":
            return 
                "| INCLUYE:                                                   |%n" +
                "|   - Transporte ejecutivo con chofer                        |%n" +
                "|   - Hospedaje 4 estrellas                                  |%n" +
                "|   - Alimentacion buffet premium                            |%n";
            
        case "vip":
            return 
                "| INCLUYE:                                                   |%n" +
                "|   - Transporte privado 24/7                                |%n" +
                "|   - Suite en hotel 5*                                      |%n" +
                "|   - Chef personalizado                                    |%n";
            
        case "economico":
            return 
                "| INCLUYE:                                                   |%n" +
                "|   - Transporte compartido                                  |%n" +
                "|   - Alojamiento basico                                    |%n" +
                "|   - Desayuno continental                                  |%n";
            
        default: 
            return 
                "| INCLUYE:                                                   |%n" +
                "|   - Transporte compartido                                  |%n" +
                "|   - Alojamiento basico                                    |%n" +
                "|   - Desayuno continental                                  |%n";
    }
}

private String getNotasCategoria(String categoria) {
    switch(categoria) {
        case "premium":
            return "| NOTA: Presentar tarjeta Premium al check-in                |%n";
        case "vip":
            return "| NOTA: Acceso exclusivo con identificacion VIP              |%n";
        case "economico":
            return "| NOTA: Presentar DNI y comprobante de pago                 |%n";
        default:
            return "| NOTA: Presentar DNI y comprobante de pago                 |%n";
    }
}

}