/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.int102.week7;

/**
 *
 * @author INT102
 */
public class TestCalculator {

    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        c1.setNum1(1022);
        c1.setNum2(20);
        c1.setOperator("%");
        System.out.printf("number1 : %.2f, number2 : %.2f , operator : %s",c1.getNum1(),c1.getNum2(),c1.getOperator());
        System.out.printf("\nResult : %.2f\n",c1.getResult());
        
    }
}
