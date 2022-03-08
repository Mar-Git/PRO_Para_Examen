package ejercicio3;



public class Main {
    private static final String NOMBRE_FICH_CONTENEDOR_MENSAJE_DESENCRIPTADO =
            "MensajeDesencriptado";
    private static AccessFileClaveAsimetrica gEncriptarAsim=new AccessFileClaveAsimetrica();

    public static void main(String[] args) {


        String nombreFichConMensajeEnCriptado=menus.Vista.introNombreFicheroEncriptado();
        String nombreFichConClavePrivada = menus.Vista.introNombreFicheroConClavePrivada();

        gEncriptarAsim.desencriptadoRSA(
                nombreFichConMensajeEnCriptado,
                NOMBRE_FICH_CONTENEDOR_MENSAJE_DESENCRIPTADO,
                nombreFichConClavePrivada
                );
    }
}
