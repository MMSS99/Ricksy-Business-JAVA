package edu.estatuas.ricksybusiness.products;

import edu.estatuas.ricksybusiness.payment.CreditCard;

import java.util.ArrayList;

public class RickMenu implements GuestDispatcher {
    private int stock;
    private final double itemCost;
    private ArrayList<String> purchaseLog = new ArrayList<String>();

    RickMenu(int stock, double itemCost) {
        this.stock = stock;
        this.itemCost = itemCost;
    }

    public int stock() {
        return stock;
    }

    public String getPurchaseLog() {
        StringBuilder outputLog = new StringBuilder();
        outputLog.append("Log de compras: ");
        for (String entrance: purchaseLog) {
            outputLog.append(entrance).append(" ");
        }

        return outputLog.toString();
    }

    @Override
    public void dispatch(CreditCard cliente){
        if (stock <= 0){
            System.out.println("No quedan menús");
            return;
        }

        if (cliente.pay(itemCost)){
            stock--;
            purchaseLog.add(cliente.owner());
            System.out.println("1 menú menos");
        } else {
            System.out.println("No tienes pasta para pagar el papeo.");
        }
    }

    @Override
    public String toString() {
        return "stock: " + this.stock +
                "\ncost: " + this.itemCost;
    }
}
