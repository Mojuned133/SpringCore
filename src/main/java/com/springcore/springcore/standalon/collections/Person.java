package com.springcore.springcore.standalon.collections;

import java.util.List;

import java.util.Map;

public class Person {
    private List<String>friends;
    private Map<String, String>feestructure;

    public Map<String, String> getFeestructure() {
        return feestructure;
    }

    public void setFeestructure(Map<String, String > feestructure) {
        this.feestructure = feestructure;
    }

    public List<String> getFriends() {
        return friends;
    }

    public void setFriends(List<String> friends) {
        this.friends = friends;
    }

    public Person(List<String> friends) {
        this.friends = friends;
    }

    public Person(){

    }

    @Override
    public String toString() {
        return "Person{" +
                "friends=" + friends +
                ", feestructure=" + feestructure +
                '}';
    }
}
