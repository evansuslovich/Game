import java.awt.*;
import java.awt.Color;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.Timer; 

import java.util.LinkedList;


public class Artillery extends JPanel implements ActionListener {

    private static final long serialVersionUID = 1L;
    private JFrame frame;

    
    LinkedList<Bullets> bullets = new LinkedList<Bullets>(); 

    private Rectangle artillery = new Rectangle(190, 350, 15, 15);
    private Rectangle bullet = new Rectangle(200,350,3,3); 

    private double x = 0; 
    private double y = 0; 

    private double width = 3; 
    private double height = 3;

    private boolean isPressed = false; 



    Timer timer; 

    public Artillery() {
        frame = new JFrame();
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        timer = new Timer(100,this); 
        timer.setRepeats(true); 
        timer.start(); 

        this.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {
                isPressed = true; 

                
                setLocation(e.getX(),e.getY());
                
            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }

        });

        frame.add(this);
        frame.setVisible(true);
    }

    public void setLocation(int x, int y){
        this.x = x; 
        this.y = y; 
    }

    public void moveBullet(){
        double x1 = x; 
        double y1 = y; 

        double x2 = 200; 
        double y2 = 350;

        if(isPressed){

            if(x == bullet.x){
                y2++; 
                bullet.setRect(x2,y2,width,height); 
            }
    
            x1 = Double.valueOf(x); 
            y1 = Double.valueOf(y); 
    
            x2 = Double.valueOf(bullet.x);  
            y2 = Double.valueOf(bullet.y * -1); 
    
            double slope = (y2 - y1) / (x2 - x1);
    
            if(slope < 0){
                x2+=-1; // try and work on the bug for moving 

                y2+=slope; 
            }
            else{
                x2+=1; 
                y2+=slope;
            }

           
            bullet.setRect(x2,y2,width,height);
            repaint();
        }

       
    }

  
    public void paint(Graphics g) {
        // back panel
        g.setColor(new Color(0, 0, 128));
        g.fillRect(0, (int) (frame.getContentPane().getHeight() * .90), frame.getContentPane().getWidth(), 40);

        // artillery
        g.setColor(new Color(75, 83, 32));
        g.fillRect(artillery.x, artillery.y, artillery.width, artillery.height);

        //bullet
        g.setColor(Color.black); 
        g.fillRect(bullet.x,bullet.y,bullet.width,bullet.height); 
    

    }

    public static void main(String[] args) {
        new Artillery();
    }



    @Override
    public void actionPerformed(ActionEvent e){
        moveBullet(); 
    }
}
