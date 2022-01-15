package com.company;

public class Daughter extends Grandmother{
    private int x;
    private String y;

    public Daughter(int age, String name) {
        super(age, name);
    }

    public void changeX(int x){
        this.x=x;
    }
    public void changeY(String y,int a, Family family){
        this.y=y;
        family.name();

    }
}
