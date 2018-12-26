/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package int102week9project;

/**
 *
 * @author INT102
 */
public class TestVend {
    public static void main(String[] args) {
        vend2();
    }
    
    public static void vend(){
        VendingMachine vc = new VendingMachine(2,25.00);
        System.out.println(vc);
        vc.receiveMoney(20);
        vc.selectProduct();
        vc.receiveMoney(5);
        vc.selectProduct();
        System.out.println(vc);
        vc.receiveMoney(50);
        vc.selectProduct();
        System.out.println(vc);
        vc.receiveMoney(30);
        vc.selectProduct();
        System.out.println(vc);
        vc.receiveMoney(500);
        vc.cancelProduct();
        System.out.println(vc);
    }
    
    public static void vend2(){
        VendingMachine vc = new VendingMachine(3,25);
        System.out.println(vc);
        vc.insertMoneyMenu();
        vc.productMenu();
        System.out.println(vc);
    }
}   
