package com;

public class Kényelmes extends Child {
    public Kényelmes(int satisfaction, String name) {
        super(satisfaction, name);
    }

    public void changeSatisfaction(Activity activity) {
        if (Activity.DRAWING==activity) {
            setSatisfaction(4);
        } else if (Activity.DANCING == activity) {
            setSatisfaction(1);
        } else if (Activity.BOWLING==activity){
            setSatisfaction(getSatisfaction()-2);
        }
    }
}
