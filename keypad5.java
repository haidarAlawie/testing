import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 * Write a description of class keypad5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class keypad5 extends JFrame
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class keypad5
     */
    public keypad5()
    {
        // initialise instance variables
        x = 0;
    }

    public void keypadCreator(){
        
    JFrame keypad = new JFrame() ; 
    Dimension keypadSize = new Dimension (300, 600);
    keypad.setTitle("keypad") ; 
    keypad.setPreferredSize(keypadSize); 
    
    Container contents =  keypad.getContentPane()  ; 
    JPanel topPane = new JPanel() ; 
    JPanel middlePane = new JPanel(); 
    JPanel bottomPane = new JPanel(); 
    
    
    
    
    keypad.setVisible(true) ; 
    keypad.pack();
        
        
    }
}
