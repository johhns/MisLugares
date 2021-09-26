package com.developer.johhns.mislugaress;

import java.util.ArrayList;
import java.util.List;

public class LugaresLista implements RepositorioLugares  {

    protected List<Lugar> listaLugares ;

    public LugaresLista() {
        this.listaLugares = new ArrayList<Lugar>();
        insertaEjemplos();
    }

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
    public int size() {
        return listaLugares.size() ;
    }

    @Override
    public void actualiza(int id, Lugar lugar) {
       listaLugares.set( id , lugar ) ;
    }

    public void insertaEjemplos(){
        adiciona( new Lugar( "Lugar 1", "Direc 1",-89.191, 13.801, TipoLugar.OTROS,  1111, "lugar1.com","com 1" ) );
        adiciona( new Lugar( "Lugar 2", "Direc 2",-89.192, 13.802, TipoLugar.OTROS,  2222, "lugar1.com","com 2" ) );
        adiciona( new Lugar( "Lugar 3", "Direc 3",-89.193, 13.803, TipoLugar.OTROS,  3333, "lugar1.com","com 3" ) );
        adiciona( new Lugar( "Lugar 4", "Direc 4",-89.194, 13.804, TipoLugar.OTROS,  4444, "lugar1.com","com 4" ) );
        adiciona( new Lugar( "Lugar 5", "Direc 5",-89.195, 13.805, TipoLugar.OTROS,  5555, "lugar1.com","com 5" ) );
    }




}
