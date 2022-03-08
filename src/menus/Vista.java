package menus;

import java.util.Scanner;

public class Vista {
    private static Scanner sc = new Scanner(System.in);

    private static final String INTRO_NOMBRE_FICH_CON_MENSAJE_ENCRIPTADO =
            "Introduzca el nombre del fichero que desee desencriptar";
    private static final String INTRO_NOMBRE_FICH_CON_MENSAJE_NO_ENCRIPTADO =
            "Introduzca el nombre del fichero que desee encriptar";
    private static final String INTRO_NOMBRE_FICH_CLAVE_PRIVADA =
            "Introduzca el nombre del fichero que contiene el valor de la clave privada";
    private static final String INTRO_NOMBRE_FICH_CLAVE_PUBLICA =
            "Introduzca el nombre del fichero que contiene el valor de la clave publica";

    public static String introNombreFicheroEncriptado(){
        String nombreFichero;
        do{
            System.out.println(INTRO_NOMBRE_FICH_CON_MENSAJE_ENCRIPTADO);
            nombreFichero=sc.nextLine();
        }while (nombreFichero.isEmpty());
        return nombreFichero;
    }

    public static String introNombreFicheroNoEncriptado(){
        String nombreFichero;
        do{
            System.out.println(INTRO_NOMBRE_FICH_CON_MENSAJE_NO_ENCRIPTADO);
            nombreFichero=sc.nextLine();
        }while (nombreFichero.isEmpty());
        return nombreFichero;
    }

    public static String introNombreFicheroConClavePrivada(){
        String nombreFichero;
        do{
            System.out.println(INTRO_NOMBRE_FICH_CLAVE_PRIVADA);
            nombreFichero=sc.nextLine();
        }while (nombreFichero.isEmpty());
        return nombreFichero;
    }

    public static String introNombreFicheroConClavePublica(){
        String nombreFichero;
        do{
            System.out.println(INTRO_NOMBRE_FICH_CLAVE_PUBLICA);
            nombreFichero=sc.nextLine();
        }while (nombreFichero.isEmpty());
        return nombreFichero;
    }
}
