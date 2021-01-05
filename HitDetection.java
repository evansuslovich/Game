import javax.swing.*; 
import java.awt.*; 
public class HitDetection extends JPanel {
    private static final long serialVersionUID = 1L; 

    private Rect r1 = new Rect(112,300);
    private Rect r2 = new Rect(100,300); 

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

        detection();

    }
    public void detection(){
        Rectangle rect1 = r1.getBounds(); 
        Rectangle rect2 = r2.getBounds(); 

        if(rect1.intersects(rect2)){
            System.out.println("Detection"); 
        }
        else
        {
            System.out.println("No Detection");
        }
    }



    public static void main(String[] args){
        new HitDetection();    
     }
    
}
