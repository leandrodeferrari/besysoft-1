package com.besysoft.bootcamp.utilidad;

public class ValidacionGeneralUtilidad {

    public static boolean contieneSoloLetras(String texto){
        return texto.matches("^[a-zA-Z]+$");
    }

    public static boolean validarEdad(Byte edad){
        return edad > 0;
    }

}
