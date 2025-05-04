package edu.estatuas.ricksybusiness;

import java.util.ArrayList;

public class Receptivo {
    private ArrayList<GuestDispatcher> receptivos = new ArrayList<GuestDispatcher>();

    public void registra(GuestDispatcher observer){
        receptivos.add(observer);
    }

    public void dispatch(CreditCard cliente){
        for(GuestDispatcher servicio : receptivos){
            servicio.dispatch(cliente);
        }
    }
}
