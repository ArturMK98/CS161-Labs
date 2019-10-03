import java.util.*;
public class arraySwap {
    
    public static void main(String args[]) {
        
        Scanner scan = new Scanner(System.in);
        int number1 = 0, number2 = 0, number3 = 0, number4 = 0, number5 = 0;
        int firstArray[];

        firstArray = new int[5];
        
            for(int i = 0; i < firstArray.length; i++) {
                
                if(i == 0){
                    
                    number1 = firstArray[i] = scan.nextInt();
                    
                }if(i == 1){
                    
                    number2 = firstArray[i] = scan.nextInt();
                    
                }if(i == 2){
                    
                    number3 = firstArray[i] = scan.nextInt();
                    
                }if(i == 3){
                    
                    number4 = firstArray[i] = scan.nextInt();
                    
                }if(i == 4){
                    
                    number5 = firstArray[i] = scan.nextInt();
                }
            }
            
        scan.close();

        System.out.print(number1 + " " + number2 + " " + number3 + " "  + number4 + " " + number5);
        System.out.println();
        System.out.print(number5 + " " + number2 + " " + number3 + " "  + number4 + " " + number1);
        
    }
}