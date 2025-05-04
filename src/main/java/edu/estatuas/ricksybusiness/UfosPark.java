package edu.estatuas.ricksybusiness;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class UfosPark {
    private final double fee = 500d;
    private HashMap<String, String> flota = new HashMap<>();

    public void add(String ufoID){
        flota.put(ufoID, null);
    }

    public void dispatch(CreditCard cliente){

        // podría hacerse en un sólo elif.
        if (flota.containsValue(null)){
            if (!flota.containsValue(cliente.number())){
                if (cliente.pay(fee)){
                    for (String ufoID : flota.keySet()) {
                        if (flota.get(ufoID) == null){
                            flota.put(ufoID, cliente.number());
                            System.out.println("Altoke mister, el UFO " + ufoID + " va a por ud.");
                            break;
                        }
                    }
                } else {
                    System.out.println("No tienes ni un duro, paria. A patita a casa.");
                }
            } else {
                System.out.println("Ya tienes un UFO, mascapajas.");
            }
        } else {
            System.out.println("No hay UFOs libres.");
        }

    }

    public String getUfoOf(String clientNUMBER){
        String UFO = null;

        // barricada
        if (!flota.containsValue(clientNUMBER)){
            return UFO;
        }

        for (String ufoID : flota.keySet()) {
            if (flota.get(ufoID) == clientNUMBER){
                UFO = flota.get(ufoID);
            }
        }
        return UFO;
    }

    @Override
    public String toString() {
        // copiado directamente de Gelpi
        String[] ufosID = this.flota.keySet().toArray(new String[flota.size()]);
        Arrays.sort(ufosID);
        return List.of(ufosID).toString();
    }

}

