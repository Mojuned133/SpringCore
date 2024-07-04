package com.springcore.springcore.ref;

public class A {
    private int x;
    private B ob;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public B getOb() {
        return ob;
    }

    public void setOb(B ob) {
        this.ob = ob;
    }
    public A() {
        // Default constructor
    }

    public A(int x, B ob) {
        this.x = x;
        this.ob = ob;
    }

    @Override
    public String toString() {
        return "A{" +
                "x=" + x +
                ", ob=" + ob +
                '}';
    }
}
