package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        Skeleton skeleton1 = new Skeleton();
        skeleton1.setDamage(30);
        skeleton1.setHealth(100);
        skeleton1.setNumOfArrows(40);

        Skeleton skeleton2 = new Skeleton();
        skeleton2.setDamage(25);
        skeleton2.setHealth(115);
        skeleton2.setNumOfArrows(45);

        System.out.println(boss.printInfo());
        System.out.println(skeleton1.printInfo());
        System.out.println(skeleton2.printInfo());
    }
}
