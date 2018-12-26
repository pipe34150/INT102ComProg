/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package int102week11project;

import java.util.Scanner;

/**
 *
 * @author INT102
 */
public class TestCal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        double num1 = sc.nextDouble();
        System.out.print("Enter Second Number : ");
        double num2 = sc.nextDouble();
        System.out.print("Enter Operator {+,-,x,/,%,avg,pow} : ");
        String operator = sc.next();
        
        SimpleCalculator cal = new SimpleCalculator(num1,num2,operator);
        System.out.println(cal);
        
        cal.setNum1(4.0);
        cal.setNum2(8.0);
        cal.setOperator("x");
        System.out.printf("\n\n %.2f %s %.2f = %.2f \n",cal.getNum1(),cal.getOperator(),cal.getNum2(),cal.compute());
        
    }
}
