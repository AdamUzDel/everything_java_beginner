
package com.bytebasetech.everything_java_beginner;

/**
 * + / - / 
 */
public class OPERATORS {
    // variables
    private int x, y;
    
    // set x
    public void setX(int x){
        this.x = x;
    }
    
    // set y
    public void setY(int y){
        this.y = y;
    }
    
    // addition
    public int addition(){
        return(x+y);
    }
    
    // subtraction
    public int subtraction(){
        return(x-y);
    }
    
    // division
    public int division(){
        return(x/y);
    }
    
    // multiplication
    public int multiplication(){
        return(x*y);
    }
    
    // remainder
    public int remainder(){
        return(x%y);
    }
    
    // increment x
    public int incrementX(){
        return(x++);
    }
    
    // decrement x
    public int decrement(){
        return(x--);
    }
    
}
