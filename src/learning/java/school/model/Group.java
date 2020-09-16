package learning.java.school.model;

import java.beans.beancontext.BeanContextServiceAvailableEvent;

public class Group {
    private Professor professor;
    private int availability;
    Student[] students;
    private int enrolled;

    public Group(int availability) {
        this.availability = availability;
        students = new Student[availability];
    }

    public Group(int availability, Professor professor) {
        this.availability = availability;
        students = new Student[availability];
        this.professor = professor;
        enrolled = 0;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Professor getProfessor() {
        return professor;
    }
    public int getAvailability(){
        return availability;
    }
    public int getEnrolled(){
        return enrolled;
    }
    public void addStudent(Student student) {
        if(enrolled < availability) {
            students[enrolled] = student;
            enrolled++;
        }
    }
    public void printStudentsList() {

        for(int i = 0 ; i < enrolled ; i++){
            System.out.println(students[i].getName());
        }
    }
}