package com.besysoft.bootcamp.utilidad;

public class ValidacionGeneralUtilidad {

    public static boolean validarQueContengaLetras(String texto){
        return texto.matches("^[a-zA-Z]+$");
    }

    public static boolean validarEdad(Byte edad){
        return edad > 0;
    }

}
