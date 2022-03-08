package ejercicio2;

import ejercicio1.AccessFileClaveSimetricas;

public class Main {
    private static final String NOMBRE_FICH_CONTENEDOR_MENSAJE_ENCRIPTADO =
            "MensajeEncriptado";
    private static final String ALGORITMO = "DESede";
    private static ejercicio1.AccessFileClaveSimetricas accessFile = new AccessFileClaveSimetricas();

    public static void main(String[] args) {


        String nombreFichConMensajeDesenCriptado=menus.Vista.introNombreFicheroNoEncriptado();
        String nombreFichConClavePrivada = menus.Vista.introNombreFicheroConClavePrivada();

        accessFile.encriptarArchivo
                (nombreFichConMensajeDesenCriptado,
                        NOMBRE_FICH_CONTENEDOR_MENSAJE_ENCRIPTADO,
                        nombreFichConClavePrivada,
                        ALGORITMO
                );
    }
}
