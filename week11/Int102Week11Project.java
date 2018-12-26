/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package int102week11project;

import java.util.Scanner;

/**
 *
 * @author INT102
 */
public class Int102Week11Project {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your grade : ");
        char grade = sc.next().toUpperCase().charAt(0);
        
        //if(grade >= 'a' && grade <= 'f') grade-=32;
        boolean check = true;
        switch(grade){
            case 'A' : System.out.println("Excellent"); break;
            case 'B' : 
            case 'C' : System.out.println("Well Done");  break;
            case 'D' : System.out.println("You Passed"); 
            case 'F' : System.out.println("Better Try Again");  break;
            default : System.out.println("Invalid Grade "); check=false;
        }
        if(check) System.out.println("You grade is " + grade);
        
    }
    
}
