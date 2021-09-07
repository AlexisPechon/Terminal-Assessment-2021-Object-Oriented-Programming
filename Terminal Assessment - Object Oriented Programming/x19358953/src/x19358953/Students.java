/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package x19358953;

import java.io.Serializable;

/**
 * Students.java
 * 03/01/2021
 * @author x19358953
 */
public class Students implements Serializable{ //Implementing Serializable so the file can save the objects stored in the ArrayList onto a file
    
    /*implements Serializable will only work for the super class as it can store everything from the subclasses if it is needed*/
    
    /*The Students class is the super class*/
    
    /*
      the PostgraduateStudents and UndergraduateStudents class will inherit, or extends,
      to the super class
    */
    
    //Data Members
    protected String studentName; //Variable used to store the studentName
    protected String studentNumber; //Variable used to store the studentNumber
    protected String programme; //Variable used to store the programme
    
    //Constructors
    
    //No-args Constructor
    /*The no-args constructor is needed to create an instance of this class in the GUI class*/
    public Students(){
        studentName = "";
        studentNumber = "";
        programme = "";
    }
    
    //Overloaded Constructor
    /*The overloaded constructor is needed for all of the subclasses to inherit the variables from the super class*/
    public Students(String studentName, String studentNumber, String programme) {
        this.studentName = studentName;
        this.studentNumber = studentNumber;
        this.programme = programme;
    }
    
    //Setters and Getters
    
    /*
      The setters will set all of the information that was given in the JTextFields in the GUI class and set it
      inside of the setters in this class
    */
    
    /*
      Likewise the getters will return the information back to the user when it has been called in the GUI class
     */
    
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getProgramme() {
        return programme;
    }

    public void setProgramme(String programme) {
        this.programme = programme;
    }
    
    //The getDetails method will return all of the necessary information back to the user when it's called in the GUI class
    //The getDetails method is an example of Polymorphism as it will return the student name, student number and programme back to the user
    //Likewise the getDetails method will be used again by the subclasses
    public String getStudentDetails(){
        return "\nStudent Name: " + studentName + "\nStudent Number: " + studentNumber + "\nProgramme: " + programme;
    }
    
    
}
