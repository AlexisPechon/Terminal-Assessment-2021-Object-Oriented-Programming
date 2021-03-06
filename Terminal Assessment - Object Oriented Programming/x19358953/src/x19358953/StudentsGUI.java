/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package x19358953;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * 03/01/2021
 * StudentsGUI.java
 * @author x19358953
 * 
 * @reference https://www.softwaretestinghelp.com/webdriver-commands-selenium-tutorial-14/
 * @reference https://mymoodle.ncirl.ie/course/view.php?id=563#section-9
 * @reference https://www.tutorialspoint.com/java/util/arraylist_remove.htm
 */

public class StudentsGUI extends javax.swing.JFrame {

    /**
     * Creates new form StudentsGUI
     */
    
    //Importing the ArrayList
    private ArrayList <Students> studentsArr; //Declaring an instance of the ArrayList class
    
    public StudentsGUI() {
        initComponents();
      
        studentsArr = new ArrayList<>(); //Assigning the instance of the ArrayList as studentsArr
        
        /*
         Upon running the GUI in the main app class everything besides the radio buttons will be hidden from the user
         this is part of the app's functionality as the user clicks the radio buttons parts of the application will
         start to appear.
        */
        //Setting the visible boolean value to false allows everything besides the radio buttons to be hidden from the user
        studentNameLbl.setVisible(false);
        studentNameTf.setVisible(false);
        studentNumberLbl.setVisible(false);
        studentNumberTf.setVisible(false);
        programmeLbl.setVisible(false);
        programmeTf.setVisible(false);
        choiceLbl.setVisible(false);
        choiceTf.setVisible(false);
        
        addBtn.setVisible(false);
        printBtn.setVisible(false);
        saveBtn.setVisible(false);
        loadBtn.setVisible(false);
        deleteBtn.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        studentRb = new javax.swing.JRadioButton();
        undergraduateRb = new javax.swing.JRadioButton();
        postgraduateRb = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        studentNameLbl = new javax.swing.JLabel();
        studentNumberLbl = new javax.swing.JLabel();
        programmeLbl = new javax.swing.JLabel();
        studentNameTf = new javax.swing.JTextField();
        studentNumberTf = new javax.swing.JTextField();
        programmeTf = new javax.swing.JTextField();
        choiceLbl = new javax.swing.JLabel();
        choiceTf = new javax.swing.JTextField();
        addBtn = new javax.swing.JButton();
        printBtn = new javax.swing.JButton();
        saveBtn = new javax.swing.JButton();
        loadBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("I am a: ");

        buttonGroup1.add(studentRb);
        studentRb.setText("Student");
        studentRb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentRbActionPerformed(evt);
            }
        });

        buttonGroup1.add(undergraduateRb);
        undergraduateRb.setText("Undergraduate");
        undergraduateRb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                undergraduateRbActionPerformed(evt);
            }
        });

        buttonGroup1.add(postgraduateRb);
        postgraduateRb.setText("Postgraduate");
        postgraduateRb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                postgraduateRbActionPerformed(evt);
            }
        });

        jLabel2.setText("College App 2021");

        studentNameLbl.setText("Student Name: ");

        studentNumberLbl.setText("Student Number:");

        programmeLbl.setText("Programme:");

        choiceLbl.setText("Choice");

        addBtn.setText("Add");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        printBtn.setText("Print");
        printBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printBtnActionPerformed(evt);
            }
        });

        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        loadBtn.setText("Load");
        loadBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadBtnActionPerformed(evt);
            }
        });

        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(printBtn)
                        .addGap(12, 12, 12)
                        .addComponent(saveBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(loadBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(deleteBtn)
                        .addGap(0, 16, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(choiceLbl)
                            .addComponent(programmeLbl)
                            .addComponent(studentNumberLbl)
                            .addComponent(studentNameLbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(studentNumberTf, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(programmeTf, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(studentNameTf, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(choiceTf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(39, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(postgraduateRb)
                    .addComponent(undergraduateRb)
                    .addComponent(studentRb)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(studentRb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(undergraduateRb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(postgraduateRb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(studentNameTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(studentNameLbl))
                .addGap(18, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(studentNumberTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(studentNumberLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(programmeLbl)
                    .addComponent(programmeTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(choiceLbl)
                    .addComponent(choiceTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addBtn)
                    .addComponent(printBtn)
                    .addComponent(loadBtn)
                    .addComponent(deleteBtn)
                    .addComponent(saveBtn))
                .addGap(88, 88, 88))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void studentRbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentRbActionPerformed
        //When the student radio button is pressed, everything besides the choiceLbl and choiceTf will be displayed to the user
        
        //Student information and programe will be become visible to user when the click on this radio button
        studentNameLbl.setVisible(true);
        studentNameTf.setVisible(true);
        studentNumberLbl.setVisible(true);
        studentNumberTf.setVisible(true);
        programmeLbl.setVisible(true);
        programmeTf.setVisible(true);
        
        /*
         The choiceLbl and choiceTf will both serve as the method of getting the qualifications and
         secondary school name from the user.
        
         The purpose for this was to create a neater and more pleasing GUI for the user.
        */
        choiceLbl.setVisible(false);
        choiceTf.setVisible(false);
        
        //The different buttons will be made visible to the user when the click this radio button
        addBtn.setVisible(true);
        printBtn.setVisible(true);
        saveBtn.setVisible(true);
        loadBtn.setVisible(true);
        deleteBtn.setVisible(true);
    }//GEN-LAST:event_studentRbActionPerformed

    private void undergraduateRbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_undergraduateRbActionPerformed
        //When the undergraduate radio button is pressed, everything will become visible to the user
        studentNameLbl.setVisible(true);
        studentNameTf.setVisible(true);
        studentNumberLbl.setVisible(true);
        studentNumberTf.setVisible(true);
        programmeLbl.setVisible(true);
        programmeTf.setVisible(true);
        
        choiceLbl.setVisible(true);
        choiceTf.setVisible(true);
        
        /*
         Once the user clicks on the undergraduate radio button, the choice label will change it's text to say
         Secondary School Name, prompting the user to enter their secondary school name.
        */
        choiceLbl.setText("Secondary School Name: "); //Purpose of the .setText method is for the label to change the text to what is in the ""
        
        //The different buttons will be made visible to the user when the click this radio button
        addBtn.setVisible(true);
        printBtn.setVisible(true);
        saveBtn.setVisible(true);
        loadBtn.setVisible(true);
        deleteBtn.setVisible(true);
        
    }//GEN-LAST:event_undergraduateRbActionPerformed

    private void postgraduateRbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_postgraduateRbActionPerformed
        //When the postgraduate radio button is pressed, everything will become visible to the user
        studentNameLbl.setVisible(true);
        studentNameTf.setVisible(true);
        studentNumberLbl.setVisible(true);
        studentNumberTf.setVisible(true);
        programmeLbl.setVisible(true);
        programmeTf.setVisible(true);
        
        choiceLbl.setVisible(true);
        choiceTf.setVisible(true);
        
        /*
         When the user clicks on the postgraduate radio button, the choice label will change it's text to say
         Qualifications, prompting the user to enter their qualifications.
        */

        choiceLbl.setText("Qualifications: "); //Purpose of the .setText method is for the label to change the text to what is in the ""
        
        //The different buttons will be made visible to the user when the click this radio button
        addBtn.setVisible(true);
        printBtn.setVisible(true);
        saveBtn.setVisible(true);
        loadBtn.setVisible(true);
        deleteBtn.setVisible(true);
        
    }//GEN-LAST:event_postgraduateRbActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        //The following code will be executed when the addBtn has been triggered or pressed     
               
        /**
         *
         * @author Alexis Pechon, x19358953
         * @reference
         * https://www.softwaretestinghelp.com/webdriver-commands-selenium-tutorial-14/
         */
        
        if (studentRb.isSelected()) {
            //If the studentRb is selected, the following happens:
            if (studentNameTf.getText().equals("") || studentNumberTf.getText().equals("") || programmeTf.getText().equals("")) {
                //The application first checks if any of the text field is empty
                //An error message will be displayed if any of the text fields were found empty
                JOptionPane.showMessageDialog(null, "Empty field(s) detected");
            }
            else {
                //The code then checks if the first character is x or X, checking if the student id is valid or not
                if(studentNumberTf.getText().charAt(0) == 'x' || studentNumberTf.getText().charAt(0) == 'X'){
                    //if the student id is valid, the student's information
                    
                    Students s = new Students(); //creating an object of the Students class called s
                    
                    //the .getText() method allows the program to get the user's input from the text fields
                    s.setStudentName(studentNameTf.getText());
                    s.setStudentNumber(studentNumberTf.getText());
                    s.setProgramme(programmeTf.getText());

                    studentsArr.add(s); //Adds the data into the ArrayList

                    JOptionPane.showMessageDialog(null, "Data Successfully Added!"); //Success message will be printed to the user when data has been successfully added
                    
                    //The text fields will be cleared once the data was successfully added
                    studentNameTf.setText("");
                    studentNumberTf.setText("");
                    programmeTf.setText("");
                }
                else{
                    //if the student's id is not valid, this error message will appear on the screen
                    JOptionPane.showMessageDialog(null,"A valid student number must start with x or X");
                }
            }

        } 
        else if (undergraduateRb.isSelected()) {
            //If the undergraduateRb is selected, the following happens:
            if (studentNameTf.getText().equals("") || studentNumberTf.getText().equals("") || programmeTf.getText().equals("") || choiceTf.getText().equals("")) {
                //if any of the text fields are empty, the following error message will be displayed.
                JOptionPane.showMessageDialog(null, "Empty field(s) detected");
            }
            else {
                //The following line of code checks if the first character in the student ID is an x or X
                if(studentNumberTf.getText().charAt(0) == 'x' || studentNumberTf.getText().charAt(0) == 'X'){
                    //If it is a valid id, the student's information will be saved into the ArrayList,
                    //this would include the secondary school name
                    UndergraduateStudents u = new UndergraduateStudents(); //creating an object of the UndergraduateStudent class called u
                    
                    //the .getText() method allows the program to get the user's input from the text fields
                    u.setStudentName(studentNameTf.getText());
                    u.setStudentNumber(studentNumberTf.getText());
                    u.setProgramme(programmeTf.getText());
                    u.setSecondarySchoolName(choiceTf.getText());

                    studentsArr.add(u); //Adds the student's information to the ArrayList

                    JOptionPane.showMessageDialog(null, "Data Successfully Added!"); //Success message will be printed to the user when data has been successfully added
                    
                    //The text fields will be cleared once the data was successfully added
                    studentNameTf.setText("");
                    studentNumberTf.setText("");
                    programmeTf.setText("");
                    choiceTf.setText("");
                }
                else{
                    JOptionPane.showMessageDialog(null,"A valid student number must start with x or X"); //if the id doesn't start with an x or X, an error message is printed to the screen
                }
            }

        } 
        else if (postgraduateRb.isSelected()) {
            //the program checks if any of the text fields are left empty
            if (studentNameTf.getText().equals("") || studentNumberTf.getText().equals("") || programmeTf.getText().equals("") || choiceTf.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Empty field(s) detected"); //if it finds an empty text field, the following message will be printed to the user
            } 
            else {
                if(studentNumberTf.getText().charAt(0) == 'x' || studentNumberTf.getText().charAt(0) == 'X'){
                    PostgraduateStudents p = new PostgraduateStudents(); //creating an object of the PostgraduateStudents class called p
                    
                    //the .getText() method allows the program to get the user's input from the text fields
                    p.setStudentName(studentNameTf.getText());
                    p.setStudentNumber(studentNumberTf.getText());
                    p.setProgramme(programmeTf.getText());
                    p.setQualifications(choiceTf.getText());

                    studentsArr.add(p); //Adds the student information to the ArrayList

                    JOptionPane.showMessageDialog(null, "Data Successfully Added!"); //Success message will be printed to the user when data has been successfully added
                    
                    //The text fields will be cleared once the data was successfully added
                    studentNameTf.setText("");
                    studentNumberTf.setText("");
                    programmeTf.setText("");
                    choiceTf.setText("");
                }
                else{
                    JOptionPane.showMessageDialog(null,"A valid student number must start with x or X"); //Error message will be displayed if the id doesn't start with x or X
                }
            }

        }  
    }//GEN-LAST:event_addBtnActionPerformed

    private void printBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printBtnActionPerformed
        //When the printBtn is pressed it will print out everything inside of the ArrayList
        
        for(Students s : studentsArr){
            //for each loop used to cycle through the different content of the ArrayList
            JOptionPane.showMessageDialog(null,s.getStudentDetails());
        }
        
    }//GEN-LAST:event_printBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        //When the delete button is pressed it will delete the first index of the Array
        
        try{
            
            /**
             *
             * @author Alexis Pechon, x19358953
             * @reference
             * https://www.tutorialspoint.com/java/util/arraylist_remove.htm
             */

            //try statement executes the line of code
            studentsArr.remove(0); //code that deletes the first index of the array list. Index 0 represents the 1st index of the array
            //Success message will be printed back to the user, notifying that the first index has been removed
            JOptionPane.showMessageDialog(null, "The first content of the Array has been successfully deleted!");
        }
        catch(Exception e){
            //catches any errors that the code in the try statements comes across
            //purpose of the catch statement is to throw an error message if the user tries to delete an item from an empty array list 
            JOptionPane.showMessageDialog(null,"The first index of the array is empty - you cannot delete an empty space!"); //prints an error message to the screen
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        
        //When the saveBtn is pressed, data inside of the ArrayList will be saved onto a file
        //The file can be used later on when the application is executed again
        JOptionPane.showMessageDialog(null,"Congratulations! Your data has been successfully saved!");
        
        /**
         * @author Alexis Pechon, x19358953
         * @reference https://mymoodle.ncirl.ie/course/view.php?id=563#section-9
         */
        
        
        //Local Variables
        File myFile; //Declaring a new File called f
        FileOutputStream myFileOutputStream; //Declaring a new variable for FileOutputStream called fStream
        ObjectOutputStream myOutputStream; //Declaring a new variable for ObjectOutputStream called oStream
        
        try{
            //The try statement will run everything inside.
            myFile = new File("students.dat"); //Creating a new file called students.dat, contents of the ArrayList will be stored there
            myFileOutputStream = new FileOutputStream(myFile,false); //By setting the FileOutputStream to false, it allows the file to be overridden when the save function is called or pressed
            myOutputStream = new ObjectOutputStream(myFileOutputStream);
            
            myOutputStream.writeObject(studentsArr); //writes the details of the ArrayList onto the file
            myOutputStream.close(); //safely closes the ObjectOutputStream
        }
        catch(IOException ex){
            //If any errors were to occur, a message will be printed out to the console
            System.out.println(ex);
        }
    }//GEN-LAST:event_saveBtnActionPerformed

    private void loadBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadBtnActionPerformed

        //When the button is clicked, it will load everything that was saved onto the file
        //This will also work when you exit the program and then run again
        
                
        /**
         * @author Alexis Pechon, x19358953
         * @reference
         * https://mymoodle.ncirl.ie/course/view.php?id=563#section-9
         */
        
        
        //Local Variables
        File myFile; //Creating a file variable called f
        FileInputStream myFileInputStream; //Creating a FileInputStream variable called fStream
        ObjectInputStream myInputStream; //Creating a ObjectInputStream called oStream
        
        try{
            myFile = new File("students.dat"); //Calling for the file called students.dat to load in the information
            myFileInputStream = new FileInputStream(myFile);
            myInputStream = new ObjectInputStream(myFileInputStream);
            
            studentsArr = (ArrayList<Students>)myInputStream.readObject(); //line of code used to read the file so it could be printed back to the user
            
            myInputStream.close(); //safely closes the ObjectOutputStream
        }
        catch(IOException | ClassNotFoundException e){
            System.out.println(e); //prints out any potential errors that may have occurred during the catch statement
        }
        
        //for each loop is needed to check through the file every time the load button is pressed
        for(Students s : studentsArr){
            JOptionPane.showMessageDialog(null,s.getStudentDetails()); //prints out the details of the ArrayList back to the user when the button is pressed
        }
    }//GEN-LAST:event_loadBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StudentsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentsGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel choiceLbl;
    private javax.swing.JTextField choiceTf;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton loadBtn;
    private javax.swing.JRadioButton postgraduateRb;
    private javax.swing.JButton printBtn;
    private javax.swing.JLabel programmeLbl;
    private javax.swing.JTextField programmeTf;
    private javax.swing.JButton saveBtn;
    private javax.swing.JLabel studentNameLbl;
    private javax.swing.JTextField studentNameTf;
    private javax.swing.JLabel studentNumberLbl;
    private javax.swing.JTextField studentNumberTf;
    private javax.swing.JRadioButton studentRb;
    private javax.swing.JRadioButton undergraduateRb;
    // End of variables declaration//GEN-END:variables
}
