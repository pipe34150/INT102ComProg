/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.int102.week3;

/**
 *
 * @author INT102
 */
public class TestDice {
    public static void main(String[] args) {
        Dice d1 = new Dice();
        Dice d2 = new Dice();
        System.out.println(d1.getFace());
        d1.roll();
        System.out.println(d1.getFace());
    }
}
