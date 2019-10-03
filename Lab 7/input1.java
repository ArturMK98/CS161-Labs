import java.util.*;
public class input1 {
    
    public static void main(String args[]) {
        
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        scan.close();
        int count = 0;
        
        for(int i = 0; i < text.length(); i++){
                
            if(text.charAt(i) == 'a'){
                    
                count++;
                    
            }
                
        }
            
        if(count <= 3) {
                
            String replace = text.replace('a', '#');
            System.out.println(replace);
                
        } else {
                
            String replace = text.replace('a', '@');
            System.out.println(replace);
                
        }
        
    }
    
}