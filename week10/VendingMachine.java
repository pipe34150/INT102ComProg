/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package int102week9project;

import java.util.Scanner;

/**
 *
 * @author INT102
 */
public class VendingMachine {
    private double moneyInserted;
    private double moneyInTheMachine = 0;
    private int productInTheMachine;
    private double productPrice;
    
    Scanner sc = new Scanner(System.in);
    
    public VendingMachine(){
        
    }
    
    public VendingMachine(int productInMachine, double productPrice){
        this.productInTheMachine = productInMachine;
        this.productPrice = productPrice;
    }
    
    public double getMoneyInserted() {
        return moneyInserted;
    }
    public void setMoneyInserted(double moneyInserted) {
        this.moneyInserted = moneyInserted;
    }
    public double getMoneyInTheMachine() {
        return moneyInTheMachine;
    }
    public void setMoneyInTheMachine(double moneyInTheMachine) {
        this.moneyInTheMachine = moneyInTheMachine;
    }
    public int getProductInTheMachine() {
        return productInTheMachine;
    }
    public void setProductInTheMachine(int productInTheMachine) {
        this.productInTheMachine = productInTheMachine;
    }
    public int getProduct() {
        return productInTheMachine;
    }
    public void setProduct(int product) {
        this.productInTheMachine = product;
    }
    
    public void receiveMoney(double moneyInserted){
        this.moneyInserted += moneyInserted;
        System.out.printf("Insert %.1f baht Total %.1f\n",moneyInserted,this.moneyInserted);
    }
    
    public void selectProduct(){
        System.out.printf("You select a product @ %.1f\n",productPrice);
        if(moneyInserted>=productPrice){
            giveProduct();
  
        }
        else{
            System.out.println("Please Insert More Money");
        }
    }
    
    public void cancelProduct(){
        System.out.println("You cancel product");
        returnMoney();
    }
    
    private void giveProduct(){
        if(productInTheMachine>0){
            this.setProductInTheMachine(--productInTheMachine);
            this.setMoneyInTheMachine(moneyInTheMachine+productPrice);
            System.out.println("You receive a product");
            this.setMoneyInserted(moneyInserted-productPrice);
            returnChange();
        }
        else{
            System.out.println("Out of stock");
            returnMoney();
        }
    }
    
    private void returnChange(){
        if(moneyInserted > 0)
        System.out.printf("Return change %.1f baht\n\n",moneyInserted);
        else System.out.println("No change\n");
        resetMoney();
    }

    private void returnMoney() {
        if(this.moneyInserted>0)
        System.out.printf("Return money %.1f baht\n\n",moneyInserted);
        else System.out.println("No money return");
        resetMoney();
    }
    
    private void resetMoney(){
        this.setMoneyInserted(0);
    }
    
    private void resetProduct(){
        this.setProduct(0);
        this.setProductInTheMachine(0);
    }
    
    public void insertMoneyMenu(){
        System.out.println("Insert Money Menu :");
        int[] moneyArray = {5,10,20,25,30};
        for(int i = 0 ; i < 5 ; i++){
            System.out.println(i+1 + ". Insert " + moneyArray[i] + " baht");
        }
        System.out.println("6. Cancel Product");
        System.out.print("Please Enter Number : ");
        int number;
        number = sc.nextInt();
        if(number == 6) cancelProduct();
        else if(number > 0 && number < 6 ){
            this.moneyInserted += moneyArray[number-1];
            System.out.printf("Total Money Inserted " + this.moneyInserted + " baht\n");
        }
        else System.out.println("Wrong Number,You should select number 1-6");
    }
    
    public void productMenu(){
        System.out.println("Select Product Menu");
        System.out.println("21. Lay @ " + productPrice + "baht");
        System.out.println("22. Cancel Product");
        System.out.print("Please Enter Product's number : ");
        int number;
        number = sc.nextInt();
        if(number == 21){
            selectProduct();
        }
        else if(number == 22){
            cancelProduct();
        }
        else{
            System.out.println("Wrong Number,Select again");
            cancelProduct();
        }
    }
    
    @Override
    public String toString() {
        return "VendingMachine{" + "productInTheMachine=" + productInTheMachine + "@" + productPrice + " ,Money in machine " + moneyInTheMachine + '}';
    }
    
    
    
}
