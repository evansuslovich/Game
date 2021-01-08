import javax.swing.JFrame;
import javax.swing.JPanel;


import java.awt.*;
import java.awt.event.*;

import java.util.Random;

import javax.swing.Timer; 

public class FallingRectPractice extends JPanel implements ActionListener{

    private static final long serialVersionUID = 1L; 
    static Rectangle[] rectangles = new Rectangle[10]; 
    private JFrame frame; 
    Timer timer;
    


    public FallingRectPractice(){
        frame = new JFrame(); 
        frame.setSize(500,400); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        createRectangles(); 

        timer = new Timer(100, this);
        timer.setRepeats(true);
        timer.start();
        
        frame.add(this); 
        frame.setVisible(true); 
    }
    

    // create the rectangles 
    public void createRectangles(){
        Random rand = new Random(); 
        for(int i = 0; i < rectangles.length; i++){
            int x = rand.nextInt(500); 
            int y = rand.nextInt(25);  
            rectangles[i] = new Rectangle(x,y,10,10);
        }
    }
    
    // move the rectangles down 5 pixels
    public void moveRectangles(){
        int index = 0; 
            for(int i = 0; i < rectangles.length; i++)
            {
                if(rectangles[i].getY() < 350){
                    rectangles[i].setLocation(rectangles[i].x, rectangles[i].y + 5);
                    repaint(); 
                }
                else
                {
                    stopRectangles(index); 
                }
            }
        }

    // stops the rectangles once they hit a certain number
    public void stopRectangles(int i){
        rectangles[i].setLocation(rectangles[i].x, rectangles[i].y);
        repaint();
    }


    // abstract method that paints the graphics 
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
    
        g.setColor(Color.black); 
        g.fillRect(0,0, frame.getContentPane().getWidth(), (int)(frame.getContentPane().getHeight()*.26)); 
    

    }


    // time abstract class that moves the rectangles
    @Override
    public void actionPerformed(ActionEvent e){
        moveRectangles(); 
    }

   

    public static void main(String[] args){
        new FallingRectPractice(); 
    }
}
  