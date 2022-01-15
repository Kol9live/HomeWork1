package com.company;

public class Main {

    public static void main(String[] args) {

        Daughter daughter = new Daughter(28,"Dasha");
        Granddaughter granddaughter = new Granddaughter(7,"Sasha");
        Granddaughter granddaughter2 = new Granddaughter(7,"Sasha");


        System.out.println(daughter.getAge());
        System.out.println(daughter.getName());
        daughter.changeY("DADA",45,Family.NAME);


	// write your code here
    }
}
