package com;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Kindergarten {

    List<Child> listOfChildre= new ArrayList<Child>();

    public void createChildren() {
        listOfChildre.add(new Zene(1,"Retek"));
        listOfChildre.add(new Kényelmes(2,"Répa"));
        listOfChildre.add(new Eleven(3,"Banán"));

    }

    public Activity getRandomActivity() {
        int randomNum = new Random().nextInt(Activity.values().length);
        return Activity.values()[randomNum];
    }

    public void simulate() {
        for (Child child:listOfChildre) {
            child.changeSatisfaction(getRandomActivity());
            System.out.println(child.toString());
        }
    }

    public static void main(String[] args) {
        Kindergarten kindergarten = new Kindergarten();
        kindergarten.createChildren();
        kindergarten.simulate();

    }
}
