package com.JBCODEWARS;

import java.security.SecureRandom;
import java.util.LinkedList;

//Hearthstone "Climactic necrotic explosion" simulation
public class Hearthstone_Simulation {

    SecureRandom secRand = new SecureRandom();
    int damageDealt = 5;
    int minionsSummoned = 1;
    int statAttack = 1;
    int statHealth = 1;
    boolean maxNumMinions = false;
    int corpsesSpent = 0;

    public LinkedList<Integer> calculateDamage(int numCorpsesSpent){

            while (corpsesSpent < numCorpsesSpent){

                while (maxNumMinions == false && corpsesSpent < numCorpsesSpent){
                    int generatedNumber = secRand.nextInt(4) +1;
                    System.out.println("generated: " + generatedNumber);
                    switch (generatedNumber){

                        case 1 : { //dmg increase
                            damageDealt++;
                            corpsesSpent++;
                            System.out.println("corpses spent: " + corpsesSpent);
                            System.out.println("dmg++");
                            break;
                        }
                        case 2 : { //minions summoned
                            if (minionsSummoned < 7){
                                minionsSummoned++;
                                corpsesSpent++;
                                System.out.println("corpses spent: " + corpsesSpent);
                                System.out.println("minions++");
                            }
                            else {
                                maxNumMinions = true;
                            }
                            break;
                        }
                        case 3 : { // atk
                            statAttack++;
                            corpsesSpent++;
                            System.out.println("corpses spent: " + corpsesSpent);
                            System.out.println("atk++");
                            break;
                        }
                        case 4 :{ // health
                            statHealth++;
                            corpsesSpent++;
                            System.out.println("corpses spent: " + corpsesSpent);
                            System.out.println("hp++");
                            break;
                        }
                    }
                }

                if (corpsesSpent < numCorpsesSpent){

                    int generatedSecondNumber = secRand.nextInt(3) +1;
                    System.out.println("after 7 minions generated: " + generatedSecondNumber);
                    switch (generatedSecondNumber){
                        case 1 : {//dmg increase
                            damageDealt++;
                            corpsesSpent++;
                            System.out.println("corpses spent: " + corpsesSpent);
                            System.out.println("dmg++");
                            break;
                        }
                        case 2 : { // atk
                            statAttack++;
                            corpsesSpent++;
                            System.out.println("corpses spent: " + corpsesSpent);
                            System.out.println("atk++");
                            break;
                        }
                        case 3 : { // health
                            statHealth++;
                            corpsesSpent++;
                            System.out.println("corpses spent: " + corpsesSpent);
                            System.out.println("hp++");
                            break;
                        }
                    }
                }
            }

        LinkedList<Integer> card = new LinkedList<>();
            card.add(damageDealt);
            card.add(minionsSummoned);
            card.add(statAttack);
            card.add(statHealth);

            if (minionsSummoned != 7)
                System.out.println("woohooo");

        return card;
    }

}
