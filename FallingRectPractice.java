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
        
        fillRectangles(); 

        frame.add(this); 
        frame.setVisible(true); 
    }
    
    public void fillRectangles(){
        Random rand = new Random(); 
        int x = 0; 
        int y = 0; 

        int width = 10; 
        int height = 10; 

        for(int i = 0; i < rectangles.length; i++){
            x = rand.nextInt(400); 
            y = rand.nextInt(400); 

            rectangles[i] = new Rectangle(x,y,width,height);

        }
    }
    public void paint(Graphics g){
        super.paint(g);

        Random rand = new Random(); 
    
        for(int i = 0; i < rectangles.length; i++){
            int r1 = rand.nextInt(256); 
            int r2 = rand.nextInt(256); 
            int r3 = rand.nextInt(256); 

            g.setColor(new Color(r1,r2,r3)); 
            g.fillRect(rectangles[i].x,rectangles[i].y, rectangles[i].width, rectangles[i].height);
        }
    }



    public static void main(String[] args){
        new FallingRectPractice(); 
    }
}
  