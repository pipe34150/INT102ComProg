/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.int102.week7;

import java.util.Scanner;
import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author INT102
 */
public class Calculator {

    private double num1;
    private double num2;
    private String operator;
    private double result;

    public Calculator() {
        
    }
    
    public Calculator(double num1, double num2, String operator) {
        this.num1 = num1;
        this.num2 = num2;
        this.operator = operator;
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
        switch(operator){
            case "+" :
                this.result = this.num1 + this.num2;
                break;
            case "-" :
                this.result = this.num1 - this.num2;
                break;
            case "*" :
                this.result = this.num1 * this.num2;
                break;
            case "/" : 
                this.result = this.num1 / this.num2;
                break;
            case "%" :
                this.result = this.num1 % this.num2;
                break;
            case "avg" :
                this.result = (this.num1 + this.num2)/2;
                break;
            case "pow" :
                this.result = Math.pow(this.num1,this.num2);
                break;
            
            default:
                this.operator = "error";
        }
    }

    public double getResult() {
        return result;
    }

    private void setResult(double result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "Calculator{" + "num1=" + num1 + ", num2=" + num2 + ", operator=" + operator + '}';
    }
    
    
}
