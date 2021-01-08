import java.awt.*; 
import javax.swing.*; 
import java.awt.Color; 


public class Artillery extends JPanel{

    private static final long serialVersionUID = 1L;

    private Rectangle artillery = new Rectangle(100,100,10,10); 

    public Artillery(){
        JFrame frame = new JFrame(); 
        frame.setSize(400,400); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        

        frame.add(this); 
        frame.setVisible(true); 
    }   


    public void paint(Graphics g){
        //super.paint(g); 
        g.setColor(new Color(75,83,32)); 
        g.fillRect(artillery.x, artillery.y, artillery.width, artillery.height); 
    }

    

   
    public static void main(String[] args){
        new Artillery(); 
    }
}
