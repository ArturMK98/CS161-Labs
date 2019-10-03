import java.util.*;
public class SumProduct {
    
    public static void main(String args[]) {
        
        Scanner scan = new Scanner(System.in);
        
        int sum = 0;
        int product = 1;
        int firstArray[];
        firstArray = new int[scan.nextInt()];
        
        for(int i = 0; i < firstArray.length; i++){
                
            firstArray[i] = scan.nextInt();       
        }

        scan.close();
            
        for(int i = 0; i < firstArray.length; i++){
                
            sum += firstArray[i];
            product *= firstArray[i];              
        }
            
        int largest = firstArray[firstArray.length -1];
            
        for(int i = 0; i < firstArray.length; i++){
                
            if(firstArray[i] > largest){
                    
                largest = firstArray[i];
                    
            }     
        }
            
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
        System.out.println("Largest Number: " + largest);
        
    }
}