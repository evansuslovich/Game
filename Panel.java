import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;

public class Panel extends JPanel implements MouseListener {
    private static final long serialVersionUID = 1L;

    public Panel(){
        addMouseListener(this);

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