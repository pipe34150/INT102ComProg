/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.int102.week5;

import sit.int102.week4.BankAccount;

/**
 *
 * @author INT102
 */
public class TestGC {
    public static void main(String[] args) {
        Runtime rt = Runtime.getRuntime();
        System.out.printf("Free Memory = %d\n",rt.freeMemory());
        
        BankAccount ba,bb,bc,bd,be,bf,bg;
        ba = new BankAccount(1001,"Somchai",9500);
        bb = new BankAccount(1002,"Somsak",9900);
        bc = new BankAccount(1003,"Somkiet",9400);
        bd = new BankAccount(1004,"Somchart",500);
        be = new BankAccount(1005,"Somsri",500);
        bf = new BankAccount(1006,"Somrak",9500);
        bg = new BankAccount(1007,"Somnamnha",900);
        ba.deposit(9000);
        
        System.out.printf("Free Memory = %d\n",rt.freeMemory());
        ba = bb = bc = bd = be = bf = bg = null;
        System.gc();
        
        System.out.printf("Free Memory = %d\n",rt.freeMemory());
        
        int a = 0;
        System.out.println(a);
        method2(a);
        System.out.println(a);
    
    }

    static int method2(int a) {
        a = a+1;
        System.out.println(a);
        return a;
    }
}
