/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplicationarray;

import java.awt.geom.Point2D;

/**
 *
 * @author INT102
 */
public class JavaApplicationArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Point a = new Point();
        Point b = new Point();
        int[] tmp = new int[2];
        tmp[0] = 9;
        tmp[1] = 7;
        a.setXY(tmp);
        tmp[0] = 3;
        tmp[1] = 2;
        b.setXY(tmp);
        System.out.println(a.distance(b));
        Point[] pointsja = new Point[5];
        



//        
//        int[] testa  = a.getXY();
//        int[] testb  = b.getXY();
//        for(int value:testa){
//            System.out.printf("Value = %d\n",value);
//        }
//        for(int value:testb){
//            System.out.printf("Value = %d\n",value);
//        }
        
    }
    
}
