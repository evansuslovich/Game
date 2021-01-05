import javax.swing.*; 

public class Game extends JFrame{
    private static final long serialVersionUID = 1L;

    

    private Panel panel = new Panel(); 

    public Game(){
        setSize(450,300); 
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        add(panel); 
        setVisible(true); 
    }
    public static void main(String[] args){
        new Game();

    }
} 