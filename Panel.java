import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.Graphics;
import java.awt.Color; 

import javax.swing.*;

import java.util.Random; 


public class Panel extends JPanel implements MouseListener {
    private static final long serialVersionUID = 1L;

    private int x = 0; 
    private int y = 0; 

    private int r1 = 0; 
    private int r2 = 0; 
    private int r3 = 0; 

    private Random rand = new Random(); 
    public Panel(){
        addMouseListener(this);
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


    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println(e.getPoint());  

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e){

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}