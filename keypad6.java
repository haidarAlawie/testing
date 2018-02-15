import java.awt.*;
import java.awt.event.*; 
import javax.swing.*; 

/**
 * Write a description of class keypad6 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class keypad6 extends JFrame
{
    // instance variables - replace the example below with your own
   

    /**
     * Constructor for objects of class keypad6
     */
    public keypad6()
    {
        // initialise instance variables
        
    }

    public void keypadMaker (){ 
        
    JFrame keypad = new JFrame () ;
    keypad.setTitle("Keypad") ; 
    Dimension keypadSize = new Dimension (300, 600) ; 
    keypad.setPreferredSize ( keypadSize) ; 
    
    Container contents = keypad.getContentPane() ; 
    JPanel  topPane = new JPanel() ;
    JPanel middlePane = new JPanel() ; 
    JPanel bottomPane = new JPanel() ; 
    
    contents.add(topPane, BorderLayout.NORTH);
    contents.add(middlePane, BorderLayout.CENTER);
    contents.add(bottomPane, BorderLayout.SOUTH); 
    
    
        
    }
}
