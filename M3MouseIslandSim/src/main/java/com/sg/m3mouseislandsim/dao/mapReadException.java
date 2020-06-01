package com.sg.m3mouseislandsim.dao;

/**
 *
 * @author naris
 */
public class mapReadException extends Exception{

    public mapReadException(String msg){
        super(msg);
    }
    
    public mapReadException(String msg, Throwable cause){
        super(msg, cause);
    }
}
