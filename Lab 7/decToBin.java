import java.util.*;
public class decToBin {
    
    public static void main(String args[]) {
        
        Scanner scan = new Scanner(System.in);
        int decimalNumber = scan.nextInt();
        scan.close();
        
        String binaryNumber = Integer.toBinaryString(decimalNumber);
        
        System.out.println(binaryNumber);
        
    }
}