import java.util.*;
public class input2 {
    
    public static void main(String args[]){
        
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        scan.close();
        
        boolean hasUpperCase = !text.equals(text.toLowerCase());
        
        if(hasUpperCase) {
                
        } else {
                
            System.out.println(Caps(text));
                
        }
        
    }
    
    static String Caps(String str){
            
        String[] word = str.split(" ");
        StringBuilder builder = new StringBuilder();

        for(int i = 0; i < word.length; i++){
                
            builder.append(Character.toUpperCase(word[i].charAt(0)));
            builder.append(word[i].substring(1));
            builder.append(' ');
        }
            
        return builder.toString();        
    }
}