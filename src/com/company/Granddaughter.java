package com.company;

public final class Granddaughter extends Daughter{

    private int a;
    private String b;

    public int getA() {
        return a;
    }

    public String getB() {
        return b;
    }

    @Override
    public void changeX(int x) {
        super.changeX(x);
    }

    public Granddaughter(int age, String name) {
        super(age, name);
    }
}

