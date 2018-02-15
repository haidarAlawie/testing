import java.awt.*; 
import java.awt.event.*;
import javax.swing.*; 
/**
 * Write a description of class keypad4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class keypad4 extends JFrame
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class keypad4
     */
    public keypad4()
    {
        // initialise instance variables
        x = 0;
    }

    public void getKeyPad(){
        
    JFrame keypad = new JFrame(); 
    
    Dimension keypadSize = new Dimension (600, 300);
    keypad.setPreferredSize(keypadSize); 
    keypad.setTitle("Keypad"); 
    
    Container contents = keypad.getContentPane();
    JPanel topPanel = new JPanel (); 
    JPanel middlePanel = new JPanel(); 
    JPanel bottomPanel = new JPanel(); 
    
    
        
        
    }
}
