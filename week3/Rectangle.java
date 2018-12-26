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
public class Rectangle {

    private double height;
    private double width;

    public Rectangle() {
        this(1);
    }

    public Rectangle(double side) {
        this(side, side);
    }

    public Rectangle(double h, double w) {
        this.height = h;
        this.width = w;
    }

    public double getArea() {
        return this.height * this.width;
    }

    public double getPerimeter() {
        return (this.height + this.width) * 2;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public String getRectangle() {
        return "Area of Rectangle is " + getArea() + " and Perimeter of Rectangle is " + getPerimeter() + ".\n";
    }
}
