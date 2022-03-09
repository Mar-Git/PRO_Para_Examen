package ejercicio6;

import ejercicio4.AccessFileClaveAsimetrica;

import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;

public class Main {


    private static AccessFileClavesSimetricas accessFile = new AccessFileClavesSimetricas();

    public static void main(String[] args)  {

        String nombreFichConClavePrivada=menus.Vista.introNombreFicheroGuardarClavePrivada();
        String algoritmo= menus.Vista.elegirOpcionAlgoritmo();

        accessFile.generarArchivoClave(nombreFichConClavePrivada,algoritmo);
    }
}
