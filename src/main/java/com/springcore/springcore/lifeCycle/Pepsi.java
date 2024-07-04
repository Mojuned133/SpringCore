package com.springcore.springcore.lifeCycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.security.auth.Destroyable;

public class Pepsi implements InitializingBean, DisposableBean {
    private double Price;

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public Pepsi(double price) {
        Price = price;
    }
    public Pepsi(){

    }

    @Override
    public String toString() {
        return "Pepsi{" +
                "Price=" + Price +
                '}';
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("in init method");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("in destroy method");
    }
}
