import java.util.*;
public class hexToDec {
    
    public static void main(String args[]) {
        
        Scanner scan = new Scanner(System.in);
        String hexNumber = scan.nextLine();
        scan.close();

        int decimalNumber = (Integer.parseInt(hexNumber, 16));
        
        System.out.println(decimalNumber);
        
    }
}