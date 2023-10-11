package com.JBCODEWARS;


import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        //System.out.println(Kata.createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
//        String testString0 = "aba";
//        String testString1 = "moose";
//        String testString2 = "Dermatoglyphics";
//        String testString3 = "moOse";
//        String testString4 = "thumbscrewjapingly";
//        String testString5 = "";
//        String testString6 = "mo0se";

        //isogram isogramObj = new isogram();
//        System.out.println( isogram.isIsogram(testString3));

        //Hearthstone "Climactic necrotic explosion" simulation
        int nrOfSims = 100;
        int nrOfCorspes = 5;
        int sumOfDamage = 0;
        for (int i = 0; i < nrOfSims; i++) {
            Hearthstone_Simulation sim = new Hearthstone_Simulation();
            LinkedList<Integer> cards = sim.calculateDamage(nrOfCorspes);
            System.out.println("Lifesteal: Deal " + cards.get(0) + " damage. Summon " + cards.get(1) +
                    " " + cards.get(2) + "/" + cards.get(3) +
                    " Souls. Randomly improved by Corpses you've spent");
            sumOfDamage = sumOfDamage + cards.get(0);
        }
        System.out.println("average damage with " + nrOfCorspes +" corspes: " + sumOfDamage/nrOfSims);


    }
}