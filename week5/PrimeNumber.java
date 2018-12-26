/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.int102.week5;

/**
 *
 * @author INT102
 */
public class PrimeNumber {
    public static boolean isPrime(int x){
        int sort;
        if(x==1 || x ==0){
            return false;
        }
        for (int i=2;i<x;i++){
            if(x%i==0){
                return false;
            }
        }
        return true;
    }
    
    
}
