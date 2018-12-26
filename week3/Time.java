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
public class Time {
    int hour,minute,second;
    
    void setTime(int h,int m,int s){
        this.hour = h;
        this.minute = m;
        this.second = s;
    }
    
    String getTime(){
        return "Time is " + this.hour + ":" + this.minute + ":" + this.second;
    }
   
}
