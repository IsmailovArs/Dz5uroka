package com.company;

public class Hero {

    private int HP;
    private int Damag;

    private String superSkill;


    public Hero(int HP,int Damag) {
        this.HP = HP;
        this.Damag = Damag;


        }

    public Hero( int HP, int Damag, String superSkill) {
        this.HP = HP;
        this.Damag = Damag;
        this.superSkill = superSkill;

    }

    public int getHP() {
        return HP;
    }

    public int getDamag() {
        return Damag;
    }

    public String getSuperSkill() {
        return superSkill;
    }
}
