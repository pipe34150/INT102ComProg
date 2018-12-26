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
public class TestDate {
    public static void main(String[] args) {
        Date today = new Date();
        Date nextDay,previousDay;
        
        nextDay = new Date();
        nextDay.setDay(31);
        nextDay.setMonth(8);
        nextDay.setYear(18);
        
        previousDay = new Date();
        previousDay.setDate(29,8,18);
        today.setDate(30, 8, 18);
        
        System.out.println(today.getDate());
        System.out.printf("Today is %s\n",today.getDate());
        System.out.printf("Next day is %s\n",nextDay.getDate());
        System.out.printf("Previous day is %s\n",previousDay.getDate());
        
    }
}
