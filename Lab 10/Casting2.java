import java.util.*;
public class Casting2 {
    
    public static void main(String args[]) {
        
        Scanner scan = new Scanner(System.in);
        
        for(int i = 0; i >= 0; i++){
            
            int decimalNumber = scan.nextInt();
            scan.close();
            char chr = (char) decimalNumber;
            
            if(decimalNumber == 27){
               
              break;
               
            }
            
            System.out.print(chr + " ");
        }
    }
}