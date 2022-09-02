package com.company;

public class Main {
    public static void main(String[] args) {
 Boss boss = new Boss();
 boss.setHeals (24);
 boss.setDamag(7);
 boss.setBossDeffenseTipe("пофик на все");
        System.out.println(boss.getHeals() + " " + boss.getDamag() + " " + boss.getBossDeffenseTipe());
    }
}

