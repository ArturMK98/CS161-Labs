import java.util.Scanner;
public class input1 {
    
    public static void main(String args[]) {
        
        Scanner scan1 = new Scanner(System.in);
        String firstString = scan1.nextLine();
        String secondString = scan1.nextLine();
        scan.close();
        
        boolean equalsOrNot = firstString.equals(secondString);  
        boolean equalsOrNot2 = firstString.equalsIgnoreCase(secondString);
        
        if(equalsOrNot) {
                
            System.out.println("Exactly the same: True");
                
        } else if(equalsOrNot2) {
                
            System.out.println("Exactly the same: False");
            System.out.println("Similar: True");
                
        } else {
                
            System.out.println("Exactly the same: False");
            System.out.println("Similar: False");
                
        }
    }
}