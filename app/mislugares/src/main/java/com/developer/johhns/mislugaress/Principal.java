package com.developer.johhns.mislugaress;

public class Principal {

    public static void main(String[] main) {

        LugaresLista lista = new LugaresLista();

        for ( int n = 0 ; n < lista.size() ; n++ ){
            System.out.println( lista.elemento(n).toString() );
            //System.out.println( "lista " + n );
        }

        /*
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
        */
    }

}
