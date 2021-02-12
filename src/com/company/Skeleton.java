package com.company;

public class Skeleton extends Boss {
    private int numOfArrows;

    public void setNumOfArrows(int numOfArrows) {
        this.numOfArrows = numOfArrows;
    }

    public int getNumOfArrows() {
        return numOfArrows;
    }

    public String printInfo() {

        return " Number of Skeleton's arrows is " + getNumOfArrows() + "."
                + " His health is "+getHealth()+ "." + " His damage is "+getDamage();


    }
}
