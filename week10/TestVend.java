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
        
//        boolean t = true;
//        int num = 5;
//        if(t != (num%2 == 0)){
//            System.out.println("A");
//        }
//        else System.out.println("B");
//        
//       
//        double num1 = 1.0/3;
//        double num2 = -1.0+2.0/3;
//        if(num1 == num2){
//            System.out.println("Same");
//        }
//        else{
//            System.out.println("N");
//        }
//        
//        String a = new String("hello");
//        String b = new String("hello");
//        if(a==b){
//            System.out.println("T");
//        }
//        
//        char key = '1';
//        if(key-'0' == 1){
//            System.out.println("1");
//        }
    }
}   
