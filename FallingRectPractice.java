import javax.swing.*;
import java.awt.Rectangle; 
import java.awt.Graphics; 
import java.awt.Color; 

import java.util.Random; 

public class FallingRectPractice extends JPanel{
    private static final long serialVersionUID = 1L; 

    private Rectangle[] rectangles = new Rectangle[25]; 


    public FallingRectPractice(){
        JFrame frame = new JFrame(); 
        frame.setSize(400,400); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        fillArray(); 

        frame.add(this); 
        frame.setVisible(true); 
    }
    
    public void fillRectangles(){
        Random rand = new Random(); 
        int x = 
        for(int i = 0; i < rectangles.length; i++){

        }
    }
    public void paint(Graphics g){
        super.paint(g);

        g.setColor(Color.black); 
        //g.fillRect(rectangle1.x,rectangle1.y, rectangle1.width, rectangle1.height);

    }



    public static void main(String[] args){
        new FallingRectPractice(); 
    }
}
  