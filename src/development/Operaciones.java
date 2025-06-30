package development;

import security.Login;
import util.Lectura;

public class Operaciones {
    private static Lectura leer = new Lectura();
    private static Menus menu = new Menus();
    private static Login login = new Login();
    
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
        
    }
    public static void ver_paquetes(){
        
    }
    public static void actualizar_paquetes(){
        
    }
    public static void eliminar_paquetes(){
        
    }
    
    public static void crear_carros(){
        
    }
    public static void ver_carros(){
        
    }
    public static void actualizar_carros(){
        
    }
    public static void eliminar_carros(){
        
    }

    public static void crear_reservas(){
        
    }
    public static void ver_reservas(){
        
    }
    public static void actualizar_reservas(){
        
    }
    public static void eliminar_reservas(){
        
    }
    
    public static void gestion(){
        
    }
    public static void reservas(){
        
    }
    public static void cerrar_sesion(){
        
    }
    
    public static void error(){
        System.out.println("");
        System.out.println("> No es una opcion");
        System.out.println("");
        
    }
    
    public static void main(String[] args) {
        inicio();
    }
}
