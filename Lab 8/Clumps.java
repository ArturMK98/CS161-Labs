import java.util.*;
public class Clumps {
    
    public static void main(String args[]) {
        
        Scanner scan = new Scanner(System.in);
    
        int firstArray[];
        firstArray = new int[scan.nextInt()];
        
        for(int i = 0; i < firstArray.length; i++){
            
            firstArray[i] = scan.nextInt();
        }

        scan.close();
        
        int count = 1;
        int biggestClump = 0;
        for(int i = 0; i < firstArray.length -1; i++) {
        
            if(firstArray[i] == firstArray[i + 1]){
                
                count++;
                if(count > biggestClump){
                    
                    biggestClump = count;
                    
                }
                
            } else {
                
                count = 1;
                
            } 
        }
        
        System.out.println("Biggest Clump Size: " + biggestClump);
    }  
}