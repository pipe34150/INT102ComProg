/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradereport;

/**
 *
 * @author INT102
 */
public class Report {
    Course[] courses;
    private int courseCount;

    public Report(int maxCourse) {
        courses = new Course[maxCourse];
    }
    
    public boolean isFull(){
        return courseCount == courses.length;
    }
    public boolean addNewCourse(String code,String title,double credit,double grade){
        if(credit <= 0 || grade < 0 || grade > 4.0 || isFull()){
            System.out.println("Add Course Error");
            return false;
        }
        courses[courseCount++] = new Course(code, title, credit, grade);
        return true;
    }
    
    public double computeGPA(){
        if(courseCount <= 0){
            return 0.0;
        }
        double sum = 0.0;
        double allCredit = 0.0;
        for(int i = 0; i < courseCount ; i++){
            sum += courses[i].getGrade()*courses[i].getCredit();
            allCredit += courses[i].getCredit();
        }
        return sum/allCredit;
        
    }
    
    public String getCourseInfoAtSlot(int i){
        if(i > courseCount || i < 0){
            return "Not Found";
        }
        return courses[i].toString();
        
    }
    
    public int getCourseCount(){
        return courseCount;
    }
    @Override
    public String toString() {
        return "Report{" + "courses=" + courses + ", courseCount=" + courseCount + '}';
    }
    
    
    
}
