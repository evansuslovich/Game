import java.awt.Graphics;
import java.util.Random;

import java.awt.*; 
import javax.swing.*;
import java.awt.Color;


public class FallingRect extends JFrame{
    private static final long serialVersionUID = 1L;

    private Random rand = new Random(); 
    private JPanel panel = new JPanel(); 

    private int x = 0; 
    private int y = 0; 


    public FallingRect(){
        setSize(400,400); 
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        panel.paintComponents(null); 
        
        add(panel);
        setVisible(true); 
    }

    
    public void paintComponent(Graphics g) {
        super.paintComponents(g);

        for(int i = 0; i < 20; i++){
            x = rand.nextInt(400); 
            y = rand.nextInt(400); 
            draw(g);
        }
    }

    public void draw(Graphics g) {
        g.setColor(new Color(123,123,123));
        g.fillRect(x,y,20,20); 
    }



    public static void main(String[] args){
        new FallingRect(); 
    }

    

}
