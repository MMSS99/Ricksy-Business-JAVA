package edu.estatuas.ricksybusiness.payment;

public class CreditCard {
    private final String owner;
    private final String number;
    private double credit;
    private final String SYMBOL = "EZI";


    public CreditCard(String owner, String PAN) {
        this.owner = owner;
        this.number = PAN;
        this.credit = 3000.0;
    }

    public CreditCard(String owner, String PAN, double credit) {
        this.owner = owner;
        this.number = PAN;
        this.credit = credit;
    }

    public String number(){
        return number;
    }

    public String owner(){
        return owner;
    }

    public double credit(){
        return credit;
    }

    public boolean pay(double precio){
        if(credit >= precio){
            credit -= precio;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "owner: " + owner + "\nPAN: " + number + "\nCredit: " + credit + " " + SYMBOL;
    }
}
