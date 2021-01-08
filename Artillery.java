import javax.swing.*; 


public class Artillery extends JPanel{

    private static final long serialVersionUID = 1L;

    public Artillery(){
        JFrame frame = new JFrame(); 
        frame.setSize(400,400); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 


        frame.add(this); 
        frame.setVisible(true); 
    }   

    public static void main(String[] args){
        new Artillery(); 
    }
}
