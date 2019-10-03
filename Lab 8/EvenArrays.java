import java.util.*;
public class EvenArrays {
    
    public static void main(String args[]) {
        
        Scanner scan = new Scanner(System.in);
        
        int firstArray[];
        firstArray = new int[10];
        
        int index = 0;
        int number = scan.nextInt();
        int firstTenEven = number + 20;
        
        for(int i = number +1; i <= firstTenEven; i++) {
                
            if(i % 2 == 0){
                    
                firstArray[index] = i;
                index++;
                    
            }
        }
            
        for(int i = 0; i < 1000; i++) {
                
            int position = scan.nextInt();
            if(position > firstArray.length) {
                    
                System.out.println("Position " + position + ": " + "No such index!");
                    
            } else if(position < 0) {
                    
                break;
                    
            } else {
                    
                System.out.println("Position " + position + ": " + firstArray[position]);
                    
            } 
        }
        scan.close();
    } 
}