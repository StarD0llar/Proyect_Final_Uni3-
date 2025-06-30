package util;

import java.util.Scanner;


public class Lectura {
      private Scanner sc = new Scanner(System.in);

    public String cadena() {
        return sc.nextLine();
    }

    public String cadenaMayuscula() {
        return cadena().toUpperCase();
    }

    public String cadenaMinuscula() {
        return cadena().toLowerCase();
    }

    public int entero() {
        return Integer.parseInt(cadena());
    }

    public double decimal() {
        return Double.parseDouble(cadena());
    }

    public char letra() {

        return cadena().charAt(0);
    }

    public void cerrar() {
        sc.close();
    }
}
