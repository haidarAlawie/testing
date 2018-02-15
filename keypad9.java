import java.awt.* ; 
import java.awt.event.*; 
import javax.swing.*;
/**
 * Write a description of class keypad9 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class keypad9 extends JFrame
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class keypad9
     */
    public keypad9()
    {
        // initialise instance variables
        x = 0;
    }

    public void keyPad(){
        
    JFrame keypad = new JFrame () ;
    Dimension keypadSize = new Dimension (300, 600) ; 
    keypad.setPreferredSize(keypadSize); 
    keypad.setTitle("Keypad") ; 
    
    Container contents = keypad.getContentPane();  
    JPanel topPane = new JPanel(); 
    JPanel middlePane = new JPanel(); 
    JPanel bottomPane = new JPanel();
    
    JPanel dialPad = new JPanel(); 
    dialPad.setLayout (new GridLayout(6,3));
    JButton one =new JButton("1"); 
    
    
        
        
        
        
    }
}
