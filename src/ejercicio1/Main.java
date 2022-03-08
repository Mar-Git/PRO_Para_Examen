package ejercicio1;

public class Main {

    private static final String NOMBRE_FICH_CONTENEDOR_MENSAJE_DESENCRIPTADO =
            "MensajeDesencriptado";
    private static final String ALGORITMO = "DESede";
    private static AccessFileClaveSimetricas accessFile = new AccessFileClaveSimetricas();

    public static void main(String[] args) {


        String nombreFichConMensajeEnCriptado=menus.Vista.introNombreFicheroEncriptado();
        String nombreFichConClavePrivada = menus.Vista.introNombreFicheroConClavePrivada();

        accessFile.desencriptarArchivo
                (nombreFichConMensajeEnCriptado,
                        NOMBRE_FICH_CONTENEDOR_MENSAJE_DESENCRIPTADO,
                        nombreFichConClavePrivada,
                        ALGORITMO
                );
    }
}
