import java.util.*;
public class LargestRow {
    
    public static void main(String args[]) {
        
        Scanner scan = new Scanner(System.in);
        
        int rows = scan.nextInt();
        int columns = rows;
        
        int firstArray[][];
        firstArray = new int[rows][columns];
        
        for(int i = 0; i < rows; i++){
            
            for(int j = 0; j < columns; j++){
                
                firstArray[i][j] = scan.nextInt();
            }
        }
        
        scan.close();
        
        int sum = 0;
        int largestSum = 0;
        int rowNumber = 0;
        
        for(int i = 1; i < rows; i++){
            
            for(int j = 0; j < columns; j++){
                
                int number = firstArray[i][j];
                sum += number;
                
                if(sum > largestSum){
                    
                    largestSum = sum;
                    rowNumber = i + 1;
                }
            }
            
            sum = 0;
        }
        
        System.out.println("R" + rowNumber);
    }
}