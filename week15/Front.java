/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradereport;

import java.util.Scanner;

/**
 *
 * @author INT102
 */
public class Front {
    Report report;
    
    public Front(int size){
        report = new Report(size);
    }
    
    public void mainMenu(){
        Scanner sc = new Scanner(System.in);
        int count,answer;
        boolean ok;
        do {
            count = report.getCourseCount();
            for(int i = 0 ; i < count ; i++){
                System.out.println(report.getCourseInfoAtSlot(i));
            }
            System.out.println("What do you want to do ?");
            System.out.println("1. Add a new Course");
            System.out.println("2. Compute GPA");
            System.out.println("3. Exit");
            System.out.print("Please type number 1-3 : ");
            answer = sc.nextInt();
            switch(answer){
                case 1: 
                    addCourse();
                    break;
                case 2 :
                    computeGPA();
                    break;
                case 3 : break;
                default: 
                    System.out.println("Invalid Number, Please try again");
            }
        }
        while(answer!=3);
    }
    
    public boolean addCourse(){
        Scanner sc = new Scanner(System.in);
        String code,title;
        double credit,grade;
        System.out.print("Please type code of new course : ");
        code = sc.nextLine();
        System.out.print("Please type title of new course : ");
        title = sc.nextLine();
        do{
            System.out.print("Please type credit of new course : ");
            credit = sc.nextDouble();
        }
        while(credit<=0);
        do{
            System.out.print("Please type grade of new course : ");
            grade = sc.nextDouble();
        }
        while(grade<0 || grade > 4);
        return report.addNewCourse(code, title, credit, grade);
    }

    private void computeGPA() {
        System.out.printf("The GPA is %.2f\n" , report.computeGPA() );
    }
    
}
