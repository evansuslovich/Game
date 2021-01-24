import java.awt.*; 

public class Bullets {
    private int x1 = 0; 
    private int y1 = 0;

    public Bullets(int x1, int y1, int x2, int y2){
        this.x = x; 
        this.y = y;
    }

    public int getX(){
        return x; 
    }
    public int getY(){
        return y; 
    }

    public Rectangle getRectangle(){
        return new Rectangle(x,y,3,3);
    }
    
}
