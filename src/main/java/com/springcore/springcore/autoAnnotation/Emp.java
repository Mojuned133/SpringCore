package com.springcore.springcore.autoAnnotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Emp {
    @Autowired
    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Emp(Address address) {
        this.address = address;
    }

    public Emp(){

    }

    @Override
    public String toString() {
        return "Emp{" +
                "address=" + address +
                '}';
    }
}
