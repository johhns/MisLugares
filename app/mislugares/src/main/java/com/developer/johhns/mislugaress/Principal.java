package com.developer.johhns.mislugaress;

public class Principal {

    public static void main(String[] main) {
        Lugar lugar = new Lugar("Ingenio El Angel",
                "Apopa, San Salvador, El Salvador",
                -89.1991472222,
                13.8011166666666,
                 TipoLugar.OTROS,
                25252525,
                "iea.com",
                "ingenio azucarero"
        );
        System.out.println("Lugar : " + lugar.toString());
    }

}
