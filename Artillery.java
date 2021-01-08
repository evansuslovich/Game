import java.awt.*; 
import javax.swing.*; 
import java.awt.Color; 

import java.awt.event.MouseEvent; 
import java.awt.event.MouseListener; 

import java.awt.event.ActionListener;



public class Artillery extends JPanel implements ActionListener{

    private static final long serialVersionUID = 1L;
    private JFrame frame; 
    private Rectangle artillery = new Rectangle(200,350,15,15); 

    public Artillery(){
        frame = new JFrame(); 
        frame.setSize(400,400); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        
        this.addMouseListener(new MouseListener(){

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
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }

        });

        frame.add(this); 
        frame.setVisible(true); 
    }   


    public void paint(Graphics g){
        // back panel 
        g.setColor(new Color(0,0,128));
        g.fillRect(0,(int)(frame.getContentPane().getHeight()*.90), frame.getContentPane().getWidth(), 40);

        // artillery 
        g.setColor(new Color(75,83,32)); 
        g.fillRect(artillery.x, artillery.y, artillery.width, artillery.height); 

    }


    public static void main(String[] args){
        new Artillery(); 
    }
}
