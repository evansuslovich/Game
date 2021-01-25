import java.awt.*;

public class Bullet extends Rectangle{

    private static final long serialVersionUID = -1L;

    private double x1 = 0;
    private double y1 = 0;

    private double x2 = 200; 
    private double y2 = 350; 

    private boolean isPressed; 

    public Bullet(double x1, double y1, boolean isPressed){
        this.x1 = x;
        this.y1 = y;
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

    

    


     



    

}
