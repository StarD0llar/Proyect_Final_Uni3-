package security;

import development.Operaciones;
import util.Lectura;

public class Login {
    private static Lectura leer = new Lectura();
    private static Operaciones op = new Operaciones();

    public static void password() {

        String usuario = "", contraseña = "";

        System.out.println("\nIngrese Usuario: ");
        usuario = leer.cadena();

        System.out.println("\nIngrese Contraseña: ");
        contraseña = leer.cadena();

        datos(usuario, contraseña);
    }

    public static void datos(String us, String co) {

        switch (us) {
            case "josias":
                if (co.equals("josho2007") && us.equals("josias")) {
                    System.out.printf("\n++++++  BIENVENIDO, %s   ++++++\n", us.toUpperCase());

                    op.inicio();
                } else {
                    System.out.println("Contraseña Incorrecta");

                    password();
                }
                break;

            case "doriann":
                if (co.equals("stardollar") && us.equals("doriann")) {
                    System.out.printf("\n++++++  BIENVENIDO, %s   ++++++\n", us.toUpperCase());
                    op.inicio();
                } else {
                    System.out.println("Contraseña Incorrecta");
                    password();
                }
                break;

            case "Russell":
                if (co.equals("russell") && us.equals("Russell")) {
                    System.out.printf("\n++++++  BIENVENIDO, %s   ++++++\n", us.toUpperCase());
                    op.inicio();
                } else {
                    System.out.println("Contraseña Incorrecta");
                    password();
                }
                break;

            case "alonso":
                if (co.equals("coldes069") && us.equals("alonso")) {
                    System.out.printf("\n++++++  BIENVENIDO, %s   ++++++\n", us.toUpperCase());
                    op.inicio();
                } else {
                    System.out.println("Contraseña Incorrecta");
                    password();
                }
                break;

            default:
                System.out.println("Usuario no encontrado");
                password();
        }

    }
}
