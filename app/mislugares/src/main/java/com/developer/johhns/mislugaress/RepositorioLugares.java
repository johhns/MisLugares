package com.developer.johhns.mislugaress;

public interface RepositorioLugares {

        Lugar elemento( int id )      ; // devuelve el elemento dado su id
        void  adiciona( Lugar lugar ) ; // adiciona un lugar
        int   nuevo()  ;                // adiciona un elemento en blanco y retorna el id
        void  borrar( int id ) ;        // elimina el elemeno indicado x el id
        int   size( int id )   ;        // devuelve el numero de elementos
        void  actualiza( int id , Lugar lugar) ;  // reemplaza un elemento

}
