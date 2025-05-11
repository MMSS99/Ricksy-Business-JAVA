package edu.estatuas.ricksybusiness;

import java.util.ArrayList;

public class Receptivo {
    private static Receptivo receptivo = null;
    private ArrayList<GuestDispatcher> receptivos = new ArrayList<GuestDispatcher>();

    private Receptivo() {}

    public static Receptivo getReceptivo() {
        if(receptivo == null) {
            receptivo = new Receptivo();
        }
        return receptivo;
    }

    public void registra(GuestDispatcher observer){
        receptivos.add(observer);
    }

    public void dispatch(CreditCard cliente){
        for(GuestDispatcher servicio : receptivos){
            servicio.dispatch(cliente);
        }
    }
}
