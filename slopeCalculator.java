public class slopeCalculator{

    public static void main(String[] args){
        double x1 = 201; 
        double y1 = 0; 

        double x2 = 200; 
        double y2 = 350; 

        double slope = (y1 - y2) / (x2 - x1); 

        if(slope < 0){
            System.out.println("negative"); 
        }
        else{
            System.out.println("positive"); 
        }

    }
    
}
