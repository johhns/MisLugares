package com.developer.johhns.mislugaress;

import java.util.List;

public class LugaresLista implements RepositorioLugares  {

    protected List<Lugar> listaLugares ;

    @Override
    public Lugar elemento(int id) {
        return listaLugares.get( id ) ;
    }

    @Override
    public void adiciona(Lugar lugar) {
       listaLugares.add( lugar ) ;
    }

    @Override
    public int nuevo() {
        Lugar lugar = new Lugar() ;
        listaLugares.add( lugar ) ;
        return listaLugares.size() -1 ;
    }

    @Override
    public void borrar(int id) {
       listaLugares.remove( id ) ;
    }

    @Override
    public int size(int id) {
        return listaLugares.size() ;
    }

    @Override
    public void actualiza(int id, Lugar lugar) {
       listaLugares.set( id , lugar ) ;
    }

    public void insertaEjemplos(){

    }

}
