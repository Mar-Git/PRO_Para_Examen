package ejercicio4;

import ejercicio1.AccessFileClaveSimetricas;

public class Main {
    private static final String NOMBRE_FICH_CONTENEDOR_MENSAJE_ENCRIPTADO =
            "MensajeEncriptado";
    private static final String ALGORITMO = "DESede";
    private static AccessFileClaveAsimetrica accessFile = new AccessFileClaveAsimetrica();

    public static void main(String[] args) {


        String nombreFichConMensajeDesenCriptado=menus.Vista.introNombreFicheroNoEncriptado();
        String nombreFichConClavePublica= menus.Vista.introNombreFicheroConClavePublica();

        accessFile.encriptarMensajeRSA
                (nombreFichConMensajeDesenCriptado,
                        NOMBRE_FICH_CONTENEDOR_MENSAJE_ENCRIPTADO,
                        nombreFichConClavePublica
                );
    }
}
