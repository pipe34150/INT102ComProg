/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.int102.week5;

import sit.int102.week3.Circle;

/**
 *
 * @author INT102
 */
public class TestClassParameter {
    public static void main(String[] args) {
        int x = 5;
        modifyInt(x);
        System.out.printf("x in main after call modifyInt = %d\n",x);
        
        x = modify(x);
        System.out.printf("x in main after call modifyInt = %d\n",x);
        
        Circle c = new Circle(x);
        System.out.printf("(main)Area of circle (%.2f) = %.2f\n",c.getRadius(),c.getArea());
        
        modifyCircle(c);
        System.out.printf("(main)Area of circle (%.2f) = %.2f\n",c.getRadius(),c.getArea());
        
    }
    
    private static void modifyCircle(Circle c){
        c.setRadius(2.3);
        System.out.printf("(method)Area of circle (%.2f) = %.2f\n",c.getRadius(),c.getArea());
    }
    private static void modifyInt(int x) {
        x+= 900;
        System.out.printf("x in modifyInt = %d\n",x);
    }
    
    private static int modify(int x){
        x+=900;
        return x;
    }
}
