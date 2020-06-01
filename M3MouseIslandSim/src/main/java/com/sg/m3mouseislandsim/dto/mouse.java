package com.sg.m3mouseislandsim.dto;

public class mouse implements simActions {

    /*fields*/
    private boolean alive;
    private int starvationCounter; //if this hits 100 - dies, cheese resets to 0

    //game scores
    private int drowned = 0;
    private int eaten = 0;
    private int escaped = 0;
    private int starved = 0;

    /*ctor*/
    public mouse() {
        this.alive = true;
        this.starvationCounter = 0;
    }

    /*overrides*/
    @Override
    public void move() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eat() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /*behaviors*/
    
}
