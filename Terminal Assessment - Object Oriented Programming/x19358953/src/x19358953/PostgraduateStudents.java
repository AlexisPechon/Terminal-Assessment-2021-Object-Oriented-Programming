/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package x19358953;

/**
 * 03/01/2021
 * PostgraduateStudents.java
 * @author x19358953
 */
public class PostgraduateStudents extends Students{
    
    /*PostgraduateStudents is the subclass to the super class Students*/
    
    //Data Members
    private String qualifications; //Variable used to store the qualifications
    
    //Constructors
    //No-args Constructor
    /*The no-args constructor is needed to create an instance of this class in the GUI class*/
    public PostgraduateStudents(){
        qualifications = "";
    }
    
    //Overloaded Constructors
    /*Overloaded Constructor is needed to inherit the variables that are inside of the super class*/
    public PostgraduateStudents(String qualifications, String studentName, String studentNumber, String programme) {
        super(studentName, studentNumber, programme);
        this.qualifications = qualifications;
    }
    
    //Setters and Getters
    
     /*
      The setters will set all of the information that was provided in the JTextFields in the GUI class and set it
      inside of the setters in this class
    */
    
    /*
      Likewise the getters will return the information back to the user when it has been called in the GUI class
     */
    
    public String getQualifications() {
        return qualifications;
    }

    public void setQualifications(String qualifications) {
        this.qualifications = qualifications;
    }
    
    //The getDetails method will return all of the necessary information back to the user
    @Override
    public String getStudentDetails(){
        //the super keyword allows the class to inherit the getDetails method from the super class
        //meaning it will inherit everything that is inside of the getDetails method from the super class
        //the getDetails method in this class will add on the qualifications so it could be printed back to the user when called
        return super.getStudentDetails() + "\nQualifications: " + qualifications;
    }
    
}
