package edu.estatuas.ricksybusiness.products;

import edu.estatuas.ricksybusiness.payment.CreditCard;

public class CrystalExpender implements GuestDispatcher{
    private int stock;
    private final double itemCost;

    CrystalExpender(int stock, double itemCost) {
        this.stock = stock;
        this.itemCost = itemCost;
    }

    public int stock() {
        return stock;
    }

    @Override
    public void dispatch(CreditCard cliente){
        //barricada
        if (stock <= 0){
            System.out.println("No queda lo que sea que vende este expendedor");
            return;
        }

        if (cliente.pay(itemCost)){
            stock--;
            System.out.println("1 pack menos");
        } else {
            System.out.println("Sin guita no hay brillante.");
        }
    }

    @Override
    //copiado de Gelpi
    public String toString() {
        return "stock: " + this.stock +
                "\ncost: " + this.itemCost;
    }
}
