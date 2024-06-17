package entity;

import java.util.Random;

public class Dice {

    int numberOfDice;

    public Dice(int numberOfDice) {
        this.numberOfDice = numberOfDice;
    }


    public int rollDice(){

        return ((int) (Math.random()*(6*numberOfDice- numberOfDice))+1);
//        Random rand = new Random();
//        return rand.nextInt(this.numberOfDice) + 1;
    }
}
