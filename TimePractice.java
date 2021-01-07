import java.util.TimerTask; 
import java.util.Timer;


    class RunTask extends TimerTask{

        @Override
         public void run() {
            System.out.println("Timer"); 

        }

    }   

    public class TimePractice{
        public static void main(String[] args){

            RunTask task = new RunTask(); 
            Timer timer = new Timer(); 
            timer.schedule(task, 1000, 1000); 

            /*
            try{
                Thread.sleep(10000); 
            }catch (InterruptedException exc){}
            timer.cancel(); */

    }
}