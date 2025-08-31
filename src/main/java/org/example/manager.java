package org.example;

public class manager extends Staff{
    private String cashier;
    public String resume(){
        return "i will be resuming work everyday by 6am";

    }

    public void setcashier(String cashier){
        this.cashier = cashier;
    }

    public String getcashier(){

        return cashier + " you are employed as the new cashier";
    }
}
