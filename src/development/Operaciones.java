package development;

import cruds.Carros;
import cruds.Paquete;
import cruds.Reserva;
import java.io.FileWriter;
import java.io.PrintWriter;
import security.Login;
import util.Lectura;

public class Operaciones {
    private static Lectura leer = new Lectura();
    private static Menus menu = new Menus();
    private static Login login = new Login();
    
    
    private static Paquete[] paquete=new Paquete[100];
    private static Reserva [] reserva = new Reserva[100];
    private static Carros[] carros=new Carros[100];
    static int paqueteIndex = 0,carrosIndex = 0, reservaIndex = 0;
    
    public static void inicio(){
        int op;
        do {            
            menu.principal();
            op=leer.entero();
            
            switch (op) {
                case 1:
                    ver_paquetes();
                    break;
                case 2:
                    ver_carros();
                    break;
                case 3:
                    gestion();
                    break;
                case 4:
                    reservas();
                    break;
                case 5:
                    cerrar_sesion();
                    break;
                default:
                    error();
            }
        } while (op!=5);
    }
    
    public static void crear_paquetes(){
        System.out.println("¿Cuantos paquetes va a registrar?");
        int n = leer.entero();
        for (int i = 0; i < n; i++) {
            System.out.println("=======================");
            System.out.println("\nPaquete "+(i+1));
            System.out.print("Codigo de Paquete:  ");
            String Num = leer.cadena();
            System.out.print("Destino: ");
            String Nombre = leer.cadena();
            System.out.print("Descripcion: ");
            String Descripcion = leer.cadena();
            String Categoria;
            do {
                System.out.print("Categoria (Economico,Premiun,Vip) \n");
                System.out.print("New Categoria: ");
                Categoria = leer.cadena().toLowerCase();
            } while (!Categoria.equals("economico") && !Categoria.equals("premiun") && !Categoria.equals("vip"));
            System.out.print("Duracion: ");
            String Duracion = leer.cadena();
            System.out.print("Costo: ");
            double Precio = leer.decimal();
            System.out.println("=======================");
            
            paquete[paqueteIndex++]=new Paquete(Num, Nombre, Descripcion, Duracion, Categoria, Precio);
            System.out.println(">> Paquete creado correctamente <<");
    }
    }
    public static void ver_paquetes(){
        if (paqueteIndex>0) {
            System.out.println("*** Registro de los paquete ***");
            for (int i = 0; i < paqueteIndex; i++) {
                System.out.println(paquete[i].toString());
            }
        } else {
            System.out.println("No existen paquetes registrados");
        }
    }
    public static void actualizar_paquetes(){
        if (paqueteIndex>0) {
            System.out.print("Ingrese el codigo de paquete a actualizar: ");
            String cod = leer.cadena();
            for (int i = 0; i < paqueteIndex; i++) {
                if (paquete[i].getNum().equals(cod)) {
                    System.out.println("=======================");
                    System.out.print("New Destino: ");
                    String Nombre = leer.cadena();
                    System.out.print("New Descripcion: ");
                    String Descripcion = leer.cadena();
                    String Categoria;
                    do {                        
                    System.out.print("Categoria (Economico,Premiun,Vip) \n");
                    System.out.print("New Categoria: ");
                    Categoria = leer.cadena().toLowerCase() ; 
                    } while (!Categoria.equals("economico")&&!Categoria.equals("premiun")&&!Categoria.equals("vip"));
                    System.out.print("New Duracion: ");
                    String Duracion = leer.cadena();
                    System.out.print("New Costo: ");
                    double Precio = leer.decimal();
                    System.out.println("=======================");
                    paquete[i] = new Paquete(cod, Nombre, Descripcion, Duracion, Categoria, Precio);
                    System.out.println(">> Paquete actualizado correctamente <<");
                    return;
                }
            }
        } else {
          System.out.println("No existen paquetes registrados");  
        }
        
    }
    public static void eliminar_paquetes(){
        if (paqueteIndex>0) {
           ver_paquetes();
        String palabra;
            do {                
                System.out.println("Va a eliminar un registro de paquete, ¿Está seguro? si/no");
                palabra = leer.cadena();
                if (palabra.equals("si")) {
                    System.out.print("\nCodigo de paquete a eliminar: ");
                    String cod = leer.cadena();
                    for (int i = 0; i < paqueteIndex; i++) {
                        if (paquete[i].getNum().equals(cod)) {
                            paquete[i] = paquete[--paqueteIndex];
                            System.out.println(">>> Pasaje eliminado con exito <<<");
                            return;
                        }
                    }
                } else if (palabra.equals("no")) {
                    System.out.println(">>> Volviendo al menu de pasajes <<<");
                    return;
                }        
                if (!palabra.equals("si")&& !palabra.equals("no")) {
                    System.out.println("solo si/no");
                }
            } while (!palabra.equals("si")&& !palabra.equals("no"));
        
        } else {
           System.out.println("No existen paquetes registrados"); 
        }
             
          
    }
    
    public static void crear_carros(){
        
        System.out.println("¿Cuantos carros va a registrar?");
        int n = leer.entero();
        for (int i = 0; i < n; i++) {
            System.out.println("=======================");
            System.out.println("\nCarro "+(i+1));
            System.out.print("Codigo de carro:  ");
            String Num = leer.cadena();
            String Modelo;
            do {                
                System.out.print("(Familiar, Mini van, Van, Autobus) \n");
                System.out.print("Tipo de carro: ");  
                Modelo = leer.cadena().toLowerCase();
            } while (!Modelo.equals("familiar")&& !Modelo.equals("mini van")&& !Modelo.equals("van") && !Modelo.equals("autobus"));
            System.out.print("Capacidad: ");
            int Capacidad = leer.entero();
            System.out.print("Disponible: ");
            int Disponible = leer.entero();
            System.out.println("=======================");
            carros[carrosIndex++]=new Carros(Num, Modelo, Capacidad, Disponible);
            System.out.println(">> Carro creado correctamente <<");
    }
    }
    public static void ver_carros(){
        if (carrosIndex>0) {
            System.out.println("*** Registro de los carros ***");
            for (int i = 0; i < carrosIndex; i++) {
                System.out.println(carros[i].toString());
            }
        } else {
            System.out.println("No existen carros registrados");
        }
    }
    public static void actualizar_carros(){
        if (carrosIndex>0) {
            System.out.print("Ingrese el codigo de paquete a actualizar: ");
            String cod = leer.cadena();
            for (int i = 0; i < carrosIndex; i++) {
                if (carros[i].getNum().equals(cod)) {
                    System.out.println("=======================");
                    String Modelo;
                    do {
                        System.out.print("(Familiar, Mini van, Van, Autobus) \n");
                        System.out.print("New Tipo de carro: ");
                        Modelo = leer.cadena().toLowerCase();
                    } while (!Modelo.equals("familiar") && !Modelo.equals("mini van") && !Modelo.equals("van") && !Modelo.equals("autobus"));
                    System.out.print("New Capacidad: ");
                    int Capacidad = leer.entero();
                    System.out.print("New Disponible: ");
                    int Disponible = leer.entero();
                    System.out.println("=======================");
                    carros[i] = new Carros(cod, Modelo, Capacidad, Disponible);
                    System.out.println(">> carro actualizado correctamente <<");
                    return;
                }
            }            
        } else {
            System.out.println("No existen carros registrados");
        }
        
    }
    public static void eliminar_carros(){
        if (carrosIndex>0) {
            ver_carros();
            String palabra;
            
            do {    
                System.out.println("Va a eliminar un registro de paquete, ¿Está seguro? si/no");
                palabra = leer.cadena();  
              if (palabra.equals("si")) {
                System.out.print("\nCodigo de paquete a eliminar: ");
                String cod = leer.cadena();
                for (int i = 0; i < carrosIndex; i++) {
                    if (carros[i].getNum().equals(cod)) {
                        carros[i] = carros[--carrosIndex];
                        System.out.println(">>> Pasaje eliminado con exito <<<");
                        return;
                    }
                }
            } else if (palabra.equals("no")) {
                System.out.println(">>> Volviendo al menu de pasajes <<<");
                return;
            }  
                if (!palabra.equals("si")&& !palabra.equals("no")) {
                    System.out.println("solo si/no");
                }
            } while (!palabra.equals("si")&& !palabra.equals("no"));
            
   
        } else {
            System.out.println("No existen carros registrados");
        }
        
    }

    public static void crear_reservas(){
        System.out.println("*** CREAR RESERVA ***");
        System.out.println("Datos del cliente:");
        System.out.print("Nombre Completo:");
        String nombre = leer.cadena();
        String dni;
        do {
            System.out.println("DNI: ");
            dni = leer.cadena();
            if (dni.length() < 8 || dni.length() == 0 || dni.length()>8) {
                System.out.println("Ingrese 8 digitos");
            }

        } while (dni.length() < 8 || dni.length() == 0 || dni.length()>8);
        
        System.out.print("Direccion:");
        String direccion= leer.cadena();
        System.out.print("Celular:");
        String celular= leer.cadena();
        System.out.println("Fecha:");
        String fecha = leer.cadena();
        ver_paquetes();
        System.out.print("Paquete:");
        String pnum=leer.cadena();
        Paquete p = null;
        for (int i = 0; i < paqueteIndex; i++) {
            if (paquete[i].getNum().equals(pnum)) {
                p = paquete[i];
                break;
            }
        }
        if (p == null) {
            System.out.println("Paquete no encontrado.");
            return;
        }
        System.out.print("Cuantas Personas:");
        int personas=leer.entero();
        
        ver_carros();
        System.out.print("Carro:");
        String cnum = leer.cadena();
        Carros c = null;
        for (int i = 0; i < carrosIndex; i++) {
            if (carros[i].getNum().equals(cnum)) {
                c = carros[i];
                break;
            }
        }
        if (c == null) {
            System.out.println("Carro no encontrado.");
            return;
        }
        
        if (c.getDisponible() <= 0) {
            System.out.println("No hay asientos disponibles");
            return;
        }
        
        if (personas > c.getDisponible()) {
    System.out.println("No hay suficientes asientos disponibles. Solicita " + personas 
        + " pero solo hay " + c.getDisponible() + " disponibles.");
    return;
}
        
        reserva[reservaIndex++]=new Reserva(nombre, direccion, dni, celular, fecha, p, personas, c);
        for (int i = 1 ; i <=personas; i++) {
            c.asiento();
        }
        System.out.println("Reserva exitosa");
        try {
            FileWriter file = new FileWriter("Reserva.txt", true);
            PrintWriter escritor = new PrintWriter(file);
            escritor.println(reserva[reservaIndex - 1].toString());
            escritor.println();
            escritor.close();
            System.out.println("< Reserva guardada en Reserva.txt >");

        } catch (Exception e) {
            System.out.println("error al guardar la reserva" + e.getMessage());
        }
    }
    public static void ver_reservas(){
        if (reservaIndex>0) {
            System.out.println("*** Registro de las reservas ***");
            for (int i = 0; i < reservaIndex; i++) {
                System.out.println(reserva[i].toString());
            }
        } else {
            System.out.println("No existen reservas registradas");
        }
    }

    public static void eliminar_reservas(){
        if (reservaIndex>0) {
            ver_reservas();
            String palabra;
            do {                
                System.out.println("Va a eliminar un registro de reserva, ¿Está seguro? si/no");
                palabra = leer.cadena();
                if (palabra.equals("si")) {
                    System.out.print("\nDni de usuario para eliminar reserva: ");
                    String cod = leer.cadena();
                    for (int i = 0; i < reservaIndex; i++) {
                        if (reserva[i].getDni().equals(cod)) {
                            reserva[i] = reserva[--reservaIndex];
                            System.out.println(">>> reserva eliminada con exito <<<");
                            return;
                        }
                    }
                } else if (palabra.equals("no")) {
                    System.out.println(">>> Volviendo al menu de pasajes <<<");
                    return;
                }        
                if (!palabra.equals("si")&& !palabra.equals("no")) {
                    System.out.println("solo si/no");
                }
            } while (!palabra.equals("si")&& !palabra.equals("no"));
                      
        } else {
           System.out.println("No existen reservas registradas"); 
        }
        

    }
    
    public static void gestion(){
        int op;
        do {            
            menu.gestion();
            op=leer.entero();
            
            switch (op) {
                case 1:
                    paquetes();
                    break;
                case 2:
                    carros();
                    break;
                case 3:
                    regresar();
                    break;
                default:
                    error();
            }
        } while (op!=3);
    }
    public static void reservas(){
         int op;
        do {            
            menu.reservas();
            op=leer.entero();
            
            switch (op) {
                case 1:
                    crear_reservas();
                    break;
                case 2:
                    ver_reservas();
                    break;
                case 3:
                    eliminar_reservas();
                    break;
                case 4:
                    regresar();
                    break;
                default:
                    error();
            }
        } while (op!=4);
    }
    
    public static void paquetes(){
        int op;
        do {            
            menu.paquetes();
            op=leer.entero();
            
            switch (op) {
                case 1:
                    crear_paquetes();
                    break;
                case 2:
                    actualizar_paquetes();
                    break;
                case 3:
                    eliminar_paquetes();
                    break;
                case 4:
                    regresar();
                    break;
                default:
                    error();
            }
        } while (op!=4);
    }
    public static void carros(){
        int op;
        do {            
            menu.carros();
            op=leer.entero();
            
            switch (op) {
                case 1:
                    crear_carros();
                    break;
                case 2:
                    actualizar_carros();
                    break;
                case 3:
                    eliminar_carros();
                    break;
                case 4:
                    regresar();
                    break;
                default:
                    error();
            }
        } while (op!=4);
    }
    
    public static void cerrar_sesion(){
        login.password();
    }
    
    public static void error(){
        System.out.println("");
        System.out.println("> No es una opcion");
        System.out.println("");
        
    }
    public static void regresar(){
        System.out.println("");
        System.out.println("> Regresando...");
        System.out.println("");
        
    }
    

}
