package org.example;

public class cashier extends Staff implements products{

    public Object product(String name, int money){


        return "you paid $"+money+" and here is the "+name;
    }
    public String resume(){
        return "i will be resuming work everyday";

    }
    public String receipt(){
        return "here is your receipt";
    }
}
