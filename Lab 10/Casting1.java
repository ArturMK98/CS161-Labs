import java.util.*;
public class Casting1 {
    
    public static void main(String args[]) {
        
        Scanner scan = new Scanner(System.in);
        
        double firstArray[];
        firstArray = new double[5];
        
        for(int i = 0; i < firstArray.length; i++){
            
            String text = scan.nextLine();
            String amount = text.substring(0, 5);
            double pay = Double.parseDouble(amount);
            firstArray[i] = pay;
        }

        scan.close();
        
        double largestPay = firstArray.length -1;
        double lowestPay = firstArray[0];
        
        for(int i = 0; i < firstArray.length; i++) {
            
            if(firstArray[i] > largestPay){
                
                largestPay = firstArray[i];
            }
            
            if(firstArray[i] < lowestPay){
                
                lowestPay = firstArray[i];
            }
        }
        
        System.out.println("Largest: " + largestPay);
        System.out.println("Lowest: " + lowestPay);
    }
}