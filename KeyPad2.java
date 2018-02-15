import java.awt.*; 
import java.awt.event.*;
import javax.swing.*;
/**
 * Write a description of class KeyPad2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class KeyPad2 extends JFrame 
{
    // instance variables - replace the example below with your own
    

    /**
     * Constructor for objects of class KeyPad2
     */
    public KeyPad2()
    {
        // initialise instance variables
        Keypad();
    }

    private void Keypad(){
    
        JFrame keypad = new JFrame(); 
        Dimension keypadWindow = new Dimension (400, 600 ) ;
        keypad.setPreferredSize(keypadWindow);
        keypad.setTitle("KeyPad"); 
        
        
        Container contents = keypad.getContentPane(); 
        JPanel topPane = new JPanel(); 
        JPanel middlePane = new JPanel(); 
        JPanel bottomPane = new JPanel(); 
        
        contents.add(topPane, BorderLayout.NORTH);
        contents.add(middlePane, BorderLayout.CENTER); 
        contents.add(bottomPane, BorderLayout.SOUTH); 
        
       
    }
}
