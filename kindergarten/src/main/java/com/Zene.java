package com;

public class Zene extends Child {

    public Zene(int satisfaction, String name) {
        super(satisfaction, name);
    }

    public void changeSatisfaction(Activity activity) {
        if (Activity.SINGING == activity) {
            setSatisfaction(4);
        } else if (Activity.BOWLING== activity ||Activity.DRAWING ==activity ) {
            setSatisfaction(getSatisfaction()-1);
        }

    }
}
