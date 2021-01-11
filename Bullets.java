import java.awt.*; 

public class Bullets {
    private int x = 0; 
    private int y = 0;

    public Bullets(int x, int y){
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
