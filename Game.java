import java.awt.Color;
import java.awt.*; 
import javax.swing.*; 

public class Game extends JFrame{
    private static final long serialVersionUID = 1L;

    

    private Panel panel = new Panel();
    
    JPanel left = new JPanel(); 
    JPanel right = new JPanel(); 

    public Game(){
        setSize(450,300); 
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        left.setBackground(Color.blue); 
        right.setBackground(Color.red); 

        panel.add(left); 
        panel.add(right); 

        add(panel); 
        
        setVisible(true); 
    }
    public static void main(String[] args){
        new Game();

    }
} 