import java.awt.*;
import java.awt.event.*;
import javax.swing.*; 
/**
 * Write a description of class Keypad here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Keypad extends JFrame
{
    // instance variables - replace the example below with your own
    private int x;
    /**
     * Constructor for objects of class Keypad
     */
    public Keypad()
    {
        // initialise instance variables
        setUpKeypad(); 
    }

    public void setUpKeypad(){
        
    JFrame keypad = new JFrame() ;
    Dimension keypadWindow = new Dimension (400,600); 
    keypad.setTitle("Keypad");
    keypad.setPreferredSize(keypadWindow); 
    
    Container contents = keypad.getContentPane(); 
    JPanel topPane= new JPanel() ;
    JPanel middlePane = new JPanel();
    JPanel bottomPanel= new JPanel(); 
    
    contents.add(topPane, BorderLayout.NORTH); 
    contents.add(middlePane, BorderLayout.CENTER) ; 
    contents.add(bottomPanel, BorderLayout.SOUTH); 
    
    JPanel dialPad = new JPanel ();
    dialPad.setLayout(new GridLayout(5,3)); 
    
    
        
        
    keypad.setVisible(true); 
    keypad.pack();
    }
}
