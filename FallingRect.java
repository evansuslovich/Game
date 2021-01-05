import java.awt.Graphics;
import java.util.Random;

import java.awt.*; 
import javax.swing.*;
import java.awt.Color;


public class FallingRect extends JPanel{
    private static final long serialVersionUID = 1L;

    private Random rand = new Random(); 

    private int x = 0; 
    private int y = 0; 


    public FallingRect(){
        JFrame frame = new JFrame(); 
        frame.setSize(400,400); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.add(this);
        frame.setVisible(true); 
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
        System.out.println(x + " " + y); 
        g.setColor(Color.red);
        g.fillRect(x,y,20,20); 
    }



    public static void main(String[] args){
        new FallingRect(); 
    }

    

}
