/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package x19358953;

/**
 * JavaStudentApp.java
 * 03/01/2021
 * @author x19358953
 */
public class JavaStudentApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //The main class is needed to run the application
        
        StudentsGUI myGUI = new StudentsGUI(); //Creating an object of the GUI class and naming it as myGUI
        myGUI.setVisible(true); //Setting myGUI visible, so it will be seen when the application is executed
    }
    
}
