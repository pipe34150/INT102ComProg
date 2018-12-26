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
public class Course {
    private String code;
    private String title;
    private double credit;
    private double grade;
    
    public Course(String code,String title,double credit,double grade){
        this.code = code;
        this.credit = credit;
        this.title = title;
        this.grade = grade;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Course{" + "code=" + code + ", title=" + title + ", credit=" + credit + ", grade=" + grade + '}';
    }
    
    
    
    
}
