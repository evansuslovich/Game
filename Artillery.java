import java.awt.*;
import java.awt.Color;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.Timer; 

import java.util.LinkedList;


public class Artillery extends JPanel implements ActionListener {

    private static final long serialVersionUID = 1L;
    private JFrame frame;

    
    LinkedList<Bullet> bullets = new LinkedList<Bullet>(); 

    private Rectangle artillery = new Rectangle(190, 350, 15, 15);
    private Rectangle bullet = new Rectangle(200,350,3,3); 

   


    private double size = 3; 

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
                isPressed = false;
                if(e.getY() < 350){
                    isPressed = true; 
                    bullets.add(new Bullet( Double.valueOf(e.getX()), Double.valueOf(e.getY()), isPressed)); 
                }
                

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

    /*public void setLocation(int x, int y){
     
        double x1 = Double.valueOf(x); // x position of the mouse
        double y1 = Double.valueOf(y); // y posiiton of the mouse

        x2 = Double.valueOf(bullet.x);  // x position of the bullet
        y2 = Double.valueOf(bullet.y); // y position of the bullet '
        
        slope = (y1 - y2) / (x2 - x1); 

        if(x1 == bullet.x){
            slope = 0; 
        }
    }
    */

    public void moveBullet()
    {
        for(int i = 0; i < bullets.size(); i++){ // go through the list

            Bullet bul = bullets.get(i); 
            if(bul.isPressed()){ // if mouse is pressed

                if(bul.getSlope() > 0){ // if the slope is positive 
                    bul.setX2(bul.getX2() + 1);
                    bul.setY2(bul.getY2() - bul.getSlope());
                    bul.setRect(bul.getX2(),bul.getY2(),size,size); 
                    repaint(); 
                }

                if(bul.getSlope() < 0){ /// if the slope is negative

                    bul.setX2(bul.getX2() - 1); 
                    bul.setY2(bul.getY2() + bul.getSlope()); 
                    bul.setRect(bul.getX2(),bul.getY2(),size,size); 
                    repaint(); 
                }
                else
                {
                    bul.setY2(bul.getY2() - 3);
                    bul.setRect(bul.getX2(),bul.getY2(),size,size); 
                    repaint(); 
                }
            }
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

        for(int i = 0; i < bullets.size(); i++){
            g.setColor(Color.orange); 
            g.fillRect(200,350,3,3); 
        }
    

    }

    @Override
    public void actionPerformed(ActionEvent e){
        moveBullet(); 
    }

    public static void main(String[] args) {
        new Artillery();
    }

}
