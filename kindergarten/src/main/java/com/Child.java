package com;

public abstract class Child {

    private int satisfaction;
    private String name;

    public Child(int satisfaction, String name) {
        this.satisfaction = satisfaction;
        this.name = name;
    }

    public void setSatisfaction(int satisfaction) {
        this.satisfaction = satisfaction;
    }

    public String getName() {
        return name;
    }

    public int getSatisfaction() {
        return satisfaction;
    }

    @Override
    public String toString() {
        return "Child{" +
                "satisfaction=" + satisfaction +
                ", name='" + name + '\'' +
                '}';
    }

    public abstract void changeSatisfaction(Activity activity);
}
