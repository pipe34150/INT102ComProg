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
        System.out.printf("Return change %.1f\n\n",moneyInserted);
        else System.out.println("No change\n");
        resetMoney();
    }

    private void returnMoney() {
        System.out.printf("Return money %.1f\n\n",moneyInserted);
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
        System.out.println("1. Insert 5 Baht");
        System.out.println("2. Insert 10 Baht");
        System.out.println("3. Insert 20 Baht");
        System.out.println("4. Insert 25 Baht");
        System.out.println("5. Insert 30 Baht");
        System.out.println("6. Cancel Product");
        System.out.println("Please Enter Number : ");
        int[] moneyArray = {5,10,20,25,30};
        int number;
        number = sc.nextInt();
        if(number == 6){
            cancelProduct();
        }
        else if(number > 0 && number < 6 )
        this.moneyInserted += moneyArray[number-1];
        else System.out.println("Wrong Number");
    }
    
    public void productMenu(){
        System.out.println("21. Lay @ " + productPrice + "Baht");
        System.out.println("22. Cancel Product");
        int number;
        number = sc.nextInt();
        if(number == 21){
            selectProduct();
        }
        else if(number == 22){
            cancelProduct();
        }
        else{
            System.out.println("Wrong Number");
        }
    }
    @Override
    public String toString() {
        return "VendingMachine{" + "productInTheMachine=" + productInTheMachine + "@" + productPrice + " ,Money in machine " + moneyInTheMachine + '}';
    }
    
    
    
}
