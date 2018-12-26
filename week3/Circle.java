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
public class Circle {
    double radius;
    double pi = 22.0/7.0;
    
    public Circle(){
        this.radius = 1.0;
    }
    
    public Circle(double r){
        this.radius = r;
    }
   
    public double getPi(){
        return this.pi;
    }
    
    public double setRadius(double c){
        return this.radius = c;
    }
    public double getRadius(){
        return this.radius;
    }
    
    public double getArea(){
        return pi*this.radius*this.radius;
    }
    
    public double getPerimeter(){
        return pi*2.0*this.radius;
    }
    
    String getCircle(){
        return "Radius of Circle is " + this.radius + ",Area of Circle is " + getArea() + " and Perimeter of Circle is " + getPerimeter() + ".\n";
    }
}  
