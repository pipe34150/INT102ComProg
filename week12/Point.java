/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplicationarray;

/**
 *
 * @author INT102
 */
public class Point {
    private int x;
    private int y;
    
    public Point(){
        
    }
    
    public Point(int x,int y){
        
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int[] getXY() {
        int[] xy;
        xy = new int[2];
        xy[0] = this.x;
        xy[1] = this.y;
        return xy;
    }

    public void setXY(int[] xy) {
        this.x = xy[0];
        this.y = xy[1];
    }
    
//    public String distance(){
//        return "Point(" + getX() + "," + getY() + ")";
//}
    
    public double distance(Point anotherPoint){
        int diffX = this.x - anotherPoint.x;
        int diffY = this.y - anotherPoint.y;
        double distance = Math.sqrt(Math.pow(diffX,2) + Math.pow(diffY,2));
        System.out.println(diffX);
        System.out.println(diffY);
        return distance;
    }
}
