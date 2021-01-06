import java.util.Timer;
import java.util.TimerTask; 
public class FallingRectPractice extends TimerTask {
    private int counter = 0; 
    private Timer timer = new Timer();



    public void run(){
        if(counter == 5){
            timer.cancel();;
        }
        System.out.println("Hello World"); 
        counter++; 
        

    }
    public static void main(String[] args){
        //Timer timer = new Timer(); 
        //timer.schedule(new FallingRectPractice(), 0, 1000);  
    }
   

}
