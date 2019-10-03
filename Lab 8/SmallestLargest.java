import java.util.*;
public class SmallestLargest {
    
    public static void main(String args[]) {
        
        Scanner scan = new Scanner(System.in);
        
        int firstArray[];
        firstArray = new int[scan.nextInt()];
        
        for(int i = 0; i < firstArray.length; i++) {
            
            firstArray[i] = scan.nextInt();
            
        }
        
        scan.close();
        int largest = firstArray[firstArray.length -1];
        int smallest = firstArray[0];
        
        for(int i = 0; i < firstArray.length; i++){
            
            if(firstArray[i] > largest){
                
                largest = firstArray[i];
                
            }if(firstArray[i] < smallest){
                
                smallest = firstArray[i];
                
            }
            
        }
        
        int firstNumber = firstArray[0];
        int lastNumber = firstArray[firstArray.length -1];
        int count1 = 0;
        int count2 = 0;
        
        for(int i = 0; i < firstArray.length; i++){
            
            if(count1 == 0){
                
                if(firstArray[i] == smallest){
                    
                    firstArray[i] = firstNumber;
                    count1++;
                    
                }
            }
            
        }
        
        firstArray[0] = smallest;
        
        for(int i = 0; i < firstArray.length; i++){
            
            if(count2 == 0){
                
                if(firstArray[i] == largest){
                    
                    firstArray[i] = lastNumber;
                    count2++;
                    
                }
                
            }
            
        }
        
        firstArray[firstArray.length -1] = largest;
        
        for(int i = 0; i < firstArray.length; i++){
            
            System.out.print(firstArray[i] + " ");
            
        }
        
    }
    
}