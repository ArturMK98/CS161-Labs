import java.util.*;
public class SumOfOdd {
    
    public static void main(String args[]) {
        
        Scanner scan = new Scanner(System.in);
        
        int rows = scan.nextInt();
        int columns = scan.nextInt();
        
        int firstArray[][];
        firstArray = new int[rows][columns];
        
        for(int i = 0; i < rows; i++){
            
            for(int j = 0; j < columns; j++){
                
                firstArray[i][j] = scan.nextInt();
            }
        }
        
        scan.close();
        
        int sum = 0;
        int count = 0;
        
        for(int i = 0; i < rows; i++){
            
            for(int j = 0; j < columns; j++){
                
                int number = firstArray[i][j];
                if(number % 2 != 0){
                    
                    count++;
                    sum += number;
                }
            }
        }
        
        System.out.println("Odd number count = " + count);
        System.out.println("Sum of odd numbers = " + sum);
    }
}