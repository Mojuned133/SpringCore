package com.springcore.springcore.lifeCycle;

public class Samosa {
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        System.out.println("setting Property");
        this.price = price;
    }

    public Samosa(double price) {
        this.price = price;
    }
    public Samosa() {
        // Default constructor
    }

    public void hey(){
        System.out.println("you are inside init method: Hey how are you");
    }

    public void bye(){
        System.out.println("you are inside destroy method: Bye Bye");
    }


    @Override
    public String toString() {
        return "Samosa{" +
                "price=" + price +
                '}';
    }
}
