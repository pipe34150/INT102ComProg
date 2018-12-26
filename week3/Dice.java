/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.int102.week3;

/**
 *
 * @author INT102
 */
public class Dice {
    private int face;
    public final static int NO_OF_FACE = 6;

    public Dice() {
        roll();
    }
    
    public void roll(){
        this.face = (int)(Math.random()*NO_OF_FACE+1);
    }
    
    public void setFace(int f){
        if(f < 1 || f > NO_OF_FACE){
            throw new RuntimeException("Error");
        }
        this.face = f;
    }
    
    public int getFace(){
        return this.face;
    }
    
}
