package com.sg.m3mouseislandsim.dto;


public class cat implements simActions {

    /*fields*/

    //game scores
    private int eats=0;
    
    /*ctor*/
    
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
    
    //cat NEVER DROWNS (=CAN'T MOVE ON WATER), ESCAPES (=CAN'T MOVE ON BRIDGE)
}
