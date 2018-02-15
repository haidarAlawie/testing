import java.awt.*;
import java.awt.event.*;
import javax.swing.*; 
/**
 * Write a description of class Keypad3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Keypad3
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Keypad3
     */
    public Keypad3()
    {
        // initialise instance variables
        
    }

    public void keyPadWindow(){
    JFrame keypad = new JFrame(); 
    Dimension keypadWindow = new Dimension (400, 800);
    keypad.setPreferredSize(keypadWindow); 
    keypad.setTitle("keypad");
    
    Container contents = keypad.getContentPane(); 
    JPanel topPanel = new JPanel(); 
    JPanel middlePanel = new JPanel(); 
    JPanel bottomPanel = new JPanel(); 
    
    contents.add(topPanel, BorderLayout.NORTH);
    contents.add(middlePanel, BorderLayout.CENTER); 
    contents.add(bottomPanel, BorderLayout.SOUTH); 
        
        
    }
}
