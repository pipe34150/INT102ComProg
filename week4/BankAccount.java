/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.int102.week4;

/**
 *
 * @author INT102
 */
public class BankAccount {
    private int accountNumber;
    private String accountName;
    private double balance;
    
    public BankAccount(){
        
    }
    
    public BankAccount(int accountNumber){
        this(accountNumber,"Unknown");
    }
    
    public BankAccount(int accountNumber,String name){
        this(accountNumber,name,100.00);
    }
    
    public  BankAccount(int accountNumber,String name,double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountName = name;
    }
    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public double getBalance() {
        return balance;
    }

    private void setBalance(double balance) {
        if(balance < 0){
            throw new RuntimeException("Balance not enough !");
        }
        this.balance = balance;
    }

    public void withdraw(double amount) {
        /*if(balance>=amount){
            setBalance(this.balance - amount);
            System.out.println("Transaction Successful");
            }
        else{
            System.out.println("Not enough money");
        }*/
        setBalance(this.balance-amount);
        System.out.printf("Withdraw amount : %.2f\n",amount);
    }
   
    public void deposit(double amount){
        if(amount>0){
            setBalance(this.balance + amount);
        }
        else{
            throw new RuntimeException("Deposit amount must higher than 0");
        }
        
    }

        
}
