import java.awt.Rectangle; 

public class Rect{

    int x,y = 0;
    
    public Rect(int x, int y){
        this.x = x; 
        this.y = y; 
    }

    public Rectangle getBounds(){
        return (new Rectangle(x,y,20,20)); 
 
    }
    
}
