import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*; 
/**
 * Write a description of class keypad10 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class keypad10 extends JFrame
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class keypad10
     */
    public keypad10()
    {
        // initialise instance variables
        x = 0;
    }

    public void keypad() {
        
    JFrame keypad = new JFrame();     
    Dimension keypadSize = new Dimension(300,600)  ; 
    keypad.setPreferredSize(keypadSize); 
    keypad.setTitle("Keypad"); 
    
    Container contents = keypad.getContentPane(); 
    JPanel  topPanel = new JPanel() ; 
    JPanel middlePanel = new JPanel(); 
    JPanel bottomPanel= new JPanel(); 
    
    contents.add(topPanel, BorderLayout.NORTH);
    contents.add(middlePanel, BorderLayout.CENTER);
    contents.add(bottomPanel, BorderLayout.SOUTH); 
    
    JPanel dialPad= new JPanel() ; 
    dialPad.setLayout(new GridLayout(6,3)); 
    JButton one = new JButton("1"); 
    
    
        
    }
}
