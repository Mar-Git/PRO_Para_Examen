package ejercicio8;


public class Main {
    private static AccessFileClavesAsimetricas accessFile = new AccessFileClavesAsimetricas();

    public static void main(String[] args)  {

        String nombreFichConClavePublica=menus.Vista.introNombreFicheroGuardarClavePublica();
        String nombreFichConClavePrivada=menus.Vista.introNombreFicheroGuardarClavePrivada();

        accessFile.generarParClaves(nombreFichConClavePublica,nombreFichConClavePrivada);
    }
}
