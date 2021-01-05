import javax.swing.*; 
import java.awt.*; 
import java.awt.Rectangle; 
public class HitDetection extends JPanel {
    private static final long serialVersionUID = 1L; 

    private Rectangle r1 = new Rectangle(100,100);
    private Rectangle r2 = new Rectangle(300,300); 

    public HitDetection(){
        JFrame frame = new JFrame(); 
        frame.setSize(400,400); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(this); 
        frame.setVisible(true); 
    }

    public void paint(Graphics g){
        super.paint(g); 

        g.setColor(Color.red); 
        
        g.fillRect(r1.x, r1.y , 20,20); 

        g.setColor(Color.blue);
        g.fillRect(r2.x, r2.y , 20,20); 


    }
    public void hitDetection(){
        if(r1.intersects(r2)){
            System.out.println("Interest"); 
        }
        else
        {
            System.out.println("No Interest");
        }
    }

    public static void main(String[] args){
        HitDetection h = new HitDetection(); 
        h.hitDetection();
    }
    
}
