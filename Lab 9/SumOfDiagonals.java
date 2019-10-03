import java.util.*;
public class SumOfDiagonals {
    
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
        int sum2 = 0;
        
        for(int i = 0; i < rows; i++){
            
            for(int j = 0; j < columns; j++){
                
                if(i == j){
                    
                    sum += firstArray[i][j];
                }
            }
        }
        
        for(int i = rows -1; i >= 0; i--){
            
            for(int j = columns -1; j >= 0; j--){
                
                if(j == columns -1 - i){
                    
                    sum2 += firstArray[i][j];
                }
            }
        }
        
        int sumOfDiagonals = sum + sum2;
        System.out.println("Sum of diagonals = " + sumOfDiagonals);
    }
}