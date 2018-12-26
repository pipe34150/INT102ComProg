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
public class TestBankAccount {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount(9000125,"Somchai",5100.02);
        
        ba.deposit(52);
        ba.withdraw(500.0);
        System.out.printf("Total : %.2f\n",ba.getBalance());
        
    }
}
