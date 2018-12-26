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
public class SimpleCalculator {
    
    private double num1;
    private double num2;
    private String operator;
    
    
    public SimpleCalculator(){
        
    }
    
    public SimpleCalculator(double num1,double num2,String operator){
        this.num1 = num1;
        this.num2 = num2;
        this.operator = operator;
    }
    
    public double compute(){
        switch(operator){
            case "+" : return num1+num2;
            case "-" : return num1-num2;
            case "x" : return num1*num2;
            case "avg" : return (num1+num2)/2;
            case "pow" : return Math.pow(num1, num2);
            case "/" : if(num2!=0) return num1/num2;
            case "%" : if(num2!=0) return num1%num2; else System.out.println("Divisor cannot be zero"); return 0;
            default: ; System.out.println("Invalid Operator"); return 0;
        }
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    @Override
    public String toString() {
        return "\nSimpleCalculator : " + "Num 1 = " + num1 + "\nOperator = " + operator + "\nNum 2 = " + num2  + "\nResult = " + compute();
    }
    
    
}
