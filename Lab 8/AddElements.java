import java.util.*;
public class AddElements {
    
    public static void main(String args[]) {
        
        Scanner scan = new Scanner(System.in);
        
        double firstArray[];
        firstArray = new double[10];
        
        for(int i = 0; i < firstArray.length; i++) {
                
            double number = scan.nextDouble();
            firstArray[i] = number;
        }

        scan.close();
            
        for(int i = 1; i < firstArray.length; i++){
                
            double sum = firstArray[i] + firstArray[i - 1];
            System.out.println(firstArray[i] + " + " + firstArray[i - 1] + " = " + (double) Math.round((sum) * 100) / 100);
        }
    }
}