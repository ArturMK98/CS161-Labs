import java.util.*;
public class binToDec {
    
    public static void main(String args[]) {
        
        Scanner scan = new Scanner(System.in); 
        String binaryNumber = scan.nextLine();
        scan.close();
        
        int decimalNumber = (Integer.parseInt(binaryNumber, 2));
        
        System.out.println(decimalNumber);
        
    }
}