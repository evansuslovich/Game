import java.awt.*;
public class Bullet{

    private double x1 = 0;
    private double y1 = 0;

    private double x2 = 200; 
    private double y2 = 350; 

    private boolean isPressed; 

    public Bullet(double x1, double y1, boolean isPressed){
        this.x1 = x1;
        this.y1 = y1;
        this.isPressed = isPressed;

    }

    public double getSlope(){
        if(x1 == 200){
            return 0;
        }
        return (y1 - 350) / (200 - x1); 
    }

    public void setX2(double x2){
        this.x2 = x2; 
    }

    public void setY2(double y2){
        this.y2 = y2; 
    }

    public double getX2(){
        return x2; 
    }

    public double getY2(){
        return y2; 
    }

    public boolean isPressed(){
        return isPressed;
    }

    public Rectangle getRectangle(){
        return new Rectangle((int)getX2(), (int)getY2(), 3,3);
    }

    

    

    


     



    

}
