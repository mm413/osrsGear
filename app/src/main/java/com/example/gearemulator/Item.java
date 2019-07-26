package com.example.gearemulator;

public class Item {
    private String type;
    private int stabAttack = 0;
    private int slashAttack = 0;
    private int crushAttack = 0;
    private int magicAttack = 0;
    private int rangedAttack = 0;
    private int stabDefence = 0;
    private int slashDefence = 0;
    private int crushDefence = 0;
    private int magicDefence = 0;
    private int rangedDefence = 0;
    private int meleeStrength = 0;
    private int rangedStrength = 0;
    private int magicStrength = 0;
    private int prayerBonus = 0;

    //setters
    public void setType(String type){
        this.type = type;
    }

    public void setStabAttack(int num){
        stabAttack = num;
    }

    public void setSlashAttack(int num){
        slashAttack = num;
    }

    public void setCrushAttack(int num){
        crushAttack = num;
    }

    public void setMagicAttack(int num){
        magicAttack = num;
    }

    public void setRangedAttack(int num){
        rangedAttack = num;
    }

    public void setstabDefence(int num){
        stabDefence = num;
    }

    public void setSlashDefence(int num){
        slashDefence = num;
    }

    public void setCrushDefence(int num){
        crushDefence = num;
    }

    public void setMagicDefence(int num){
        magicDefence = num;
    }

    public void setRangedDefence(int num){
        rangedDefence = num;
    }

    public void setMeleeStrength(int num){
        meleeStrength = num;
    }

    public void setRangedStrength(int num){
        rangedStrength = num;
    }

    public void setMagicStrength(int num){
        meleeStrength = num;
    }

    public void setPrayerBonus(int num){
        prayerBonus = num;
    }

    //getters
    public int getStabAttack(){
        return stabAttack;
    }

    public int getSlashAttack(){
        return slashAttack;
    }

    public int getCrushAttack(){
        return crushAttack;
    }

    public int getMagicAttack(){
        return magicAttack;
    }

    public int getRangedAttack(){
        return rangedAttack;
    }

    public int getStabDefence(){
        return stabDefence;
    }

    public int getSlashDefence(){
        return slashDefence;
    }

    public int getCrushDefence(){
        return crushDefence;
    }

    public int getMagicDefence(){
        return magicDefence;
    }

    public int getRangedDefence(){
        return rangedDefence;
    }

    public int getMeleeStrength(){
        return meleeStrength;
    }

    public int getRangedStrength(){
        return rangedStrength;
    }

    public int getMagicStrength(){
        return magicStrength;
    }

    public int getPrayerBonus(){
        return prayerBonus;
    }
}
