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
public class TestClass {
    public static void main(String[] args) {
        Circle c1 = new Circle(4);
        System.out.printf("Radius of Circle is %f\n",c1.getRadius());
        System.out.printf("Area of Circle is %f\n",c1.getArea());
        System.out.printf("Perimeter of Circle is %f\n",c1.getPerimeter());
        
        Rectangle r1 = new Rectangle(2,10);
        System.out.printf("Area of Rectangle is %f\n",r1.getArea());
        System.out.printf("Perimeter of Rectangle is %f\n",r1.getPerimeter());
        
        Time t1 = new Time();
        t1.setTime(12,30,22);
        System.out.println(t1.getTime());
    }
}
