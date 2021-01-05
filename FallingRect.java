import java.awt.Graphics;
import java.awt.Color;

import javax.swing.*;

import java.util.Random;



public class FallingRect extends JPanel{
    private static final long serialVersionUID = 1L;

    private Random rand = new Random(); 

    private int x = 0; 
    private int y = 0; 
    
    private int r1 = 0; 
    private int r2 = 0; 
    private int r3 = 0; 


    public FallingRect(){
        JFrame frame = new JFrame(); 
        frame.setSize(400,400); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false); 
        
        frame.add(this);
        frame.setVisible(true); 
    }

    public void paintComponent(Graphics g) {
        super.paintComponents(g);

        for(int i = 0; i < 10; i++){
            x = rand.nextInt(400); 

            r1 = rand.nextInt(256); 
            r2 = rand.nextInt(256); 
            r3 = rand.nextInt(256); 

            draw(g);
        }
    }

    public void draw(Graphics g) {
        System.out.println(x + " " + y); 
        g.setColor(new Color(r1,r2,r3));
        g.fillRect(x,y,20,20); 
    }



    public static void main(String[] args){
        new FallingRect(); 
    }

    

}
