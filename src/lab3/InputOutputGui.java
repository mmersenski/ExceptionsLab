package lab3;

import javax.swing.JOptionPane;

/**
 * This class is responsible for all input and output in the program.
 * 
 * @author  Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class InputOutputGui {
    private NameService nameService;

    public InputOutputGui() {
        nameService = new NameService();
    }

    public void startConversation() {
        
        String fullName = JOptionPane.showInputDialog("Enter full name:");
        String msg = "";
        try{
            String lastName = nameService.extractLastName(fullName);
            msg = "Your last name is: " + lastName;
        }
//        catch(IllegalArgumentException mle){
//        catch(MaximumLengthException mle){
//            msg = mle.getMessage();
//        }
        //only need to use the 1 catch statment
        //the JVM will know which error message to throw based on the error
        catch(IllegalArgumentException iae){
//        catch(MaximumLengthException iae){    
            msg = iae.getMessage();
        }
        JOptionPane.showMessageDialog(null, msg);

        
    }
     
}
