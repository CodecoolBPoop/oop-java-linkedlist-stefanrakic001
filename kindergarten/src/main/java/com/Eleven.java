package com;

public class Eleven extends Child {
    public Eleven(int satisfaction, String name) {
        super(satisfaction, name);
    }

    public void changeSatisfaction(Activity activity) {
        if (Activity.BOWLING == activity) {
            setSatisfaction(3);
        } else if (Activity.SINGING == activity || Activity.DRAWING==activity) {
            setSatisfaction(getSatisfaction()-1);
        }

    }
}
