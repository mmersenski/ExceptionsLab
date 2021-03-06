package lab1;

import javax.swing.JOptionPane;

/**
 * The purpose of this challenge is to give you practice time using
 * Java Exception handling techniques.
 * <p>
 * Your challenge is to consider all the possible things that can go wrong
 * with this program and use exception handling where appropriate to prevent
 * the program from crashing. In addition you must display a friendly error
 * message in a JOptionPane and ask the user to try again. (Yes, this violates 
 * the Single Responsibility Principle, but for this lab, we'll overlook that.)
 * 
 * @author  Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class Challenge1 {
    private static final int LAST_NAME_IDX = 1;

    // this method responsible for output
    public static void main(String[] args) {
        Challenge1 app = new Challenge1();
        
        String fullName = JOptionPane.showInputDialog("Enter full name (use Format: first last):");
        String msg = "";
        try{
        String lastName = app.extractLastName(fullName);
        msg = "Your last name is: " + lastName;
        }
        catch(IllegalArgumentException iae){
            msg = iae.getMessage();
        }
        JOptionPane.showMessageDialog(null, msg);
    }
    
    // write the code to extract the lastName from the fullName
    // Use exception handling to prevent a crash in the event that fullName
    // is null or empty. Throw the exception to the calling method. and handle
    // it there.
    public String extractLastName(String fullName) {
        String lastName = null;
        // The JOptionPane.showInputDialog is taking the users input
        // the code below only needs to extract the info, could look for a space in the data
        // Your code goes here.
        String[] lastNameArray = fullName.split(" ");
        if(lastNameArray.length != 2){
            throw new IllegalArgumentException("name format must be 'First Last' name.");
        }
        
        lastName = lastNameArray[1];
        return lastName;
    }

}
