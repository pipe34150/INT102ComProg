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
public class Date {
   int day,month,year;
   
   int getDay(){
       return this.day;
   }
   
   int getMonth(){
       return this.month;
   }
   
   int getYear(){
       return this.year;
   }
   
   void setDay(int d){
       this.day = d;
   }
   
   void setMonth(int m){
       this.month = m;
   }
   
   void setYear(int y){
       this.year = y;
   }
   
   void setDate(int d,int m,int y){
       this.day = d;
       this.month = m;
       this.year = y;
   }
   String getDate(){
       return this.day + "/" + this.month + "/" + this.year;  
   }
   
}
