import javax.swing.*;
import java.awt.Rectangle; 
import java.awt.Graphics; 
import java.awt.Color; 

import java.util.Random; 

public class FallingRectPractice extends JPanel{
    private static final long serialVersionUID = 1L; 

    private Rectangle[] rectangles = new Rectangle[1]; 
    private JFrame frame; 

    public FallingRectPractice(){
        frame = new JFrame(); 
        frame.setSize(400,400); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        fillRectangles(); 
        intersect();
        //moveRectangles();  
    

        frame.add(this); 
        frame.setVisible(true); 
    }
    
    public void fillRectangles(){
        /*Random rand = new Random(); 
   
        for(int i = 0; i < rectangles.length; i++){
            int x = rand.nextInt(400); 
            int y = rand.nextInt(100);  

            rectangles[i] = new Rectangle(x,y,10,10);
            */ 
        rectangles[0] = new Rectangle(10,10,10,10);
        
    }

    public void moveRectangles(){
        for(int i = 0; i < rectangles.length; i++){
            rectangles[i].setBounds(rectangles[i].x,rectangles[i].y + 5,rectangles[i].width, rectangles[i].height);
            repaint(); 
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

    

    public void intersect(){
        Rectangle rect; 
        int counter = 0; 
        for(int x = 0; x < rectangles.length;x++){
            rect = rectangles[x]; 
            for(int y = 0; y < rectangles.length; y++){
                counter++; 
                if(x != y){
                    if(rect.intersects(rectangles[y])){
                        System.out.println("Detection");
                        System.out.println(counter); 

                    }
                }
            }
        }
    }

    public static void main(String[] args){
        FallingRectPractice practice = new FallingRectPractice();

        FallingRectPractice practice2 = new FallingRectPractice(); 
        for(int i = 0; i < 10; i++){
            practice2.moveRectangles();
        }


    }
}
  