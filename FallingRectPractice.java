import javax.swing.JFrame;
import javax.swing.JPanel;


import java.awt.*;
import java.awt.event.*;

import java.util.Random;

import javax.swing.Timer; 
//import java.util.TimerTask;
//import java.util.Timer;

public class FallingRectPractice extends JPanel implements ActionListener{
    private static final long serialVersionUID = 1L; 

    static Rectangle[] rectangles = new Rectangle[10]; 
    
    private JFrame frame; 

    Timer timer;
    //TimerTask rectanglesTask; 


    
    public FallingRectPractice(){
        frame = new JFrame(); 
        frame.setSize(400,400); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        createRectangles(); 
        
        timer = new Timer(1000, this);
        timer.setRepeats(true);
        timer.start();
        
        frame.add(this); 
        frame.setVisible(true); 
    }
    

    // create the rectangles 
    public void createRectangles(){
        Random rand = new Random(); 
        for(int i = 0; i < rectangles.length; i++){
            int x = rand.nextInt(400); 
            int y = rand.nextInt(100);  
            rectangles[i] = new Rectangle(x,y,10,10);
        }
    }
    
    // move the rectangles down 5 pixels
    public void moveRectangles(){
            for(int i = 0; i < rectangles.length; i++){
            if(rectangles[i].getY() < 400){
                rectangles[i].setLocation(rectangles[i].x, rectangles[i].y + 5);
                repaint(); 
            }
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
    
        //g.setColor(Color.black); 
        //g.fillRect(0,0, frame.getContentPane().getWidth(), (int)(frame.getContentPane().getHeight()*.26)); 
    

    }


    @Override
    public void actionPerformed(ActionEvent e){
        moveRectangles(); 
    }

   

    public static void main(String[] args){
        new FallingRectPractice(); 
    }
}
  