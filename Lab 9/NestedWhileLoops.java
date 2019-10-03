public class NestedWhileLoops {
    
    public static void main(String args[]) {
        
        int num = 5;
        int i = 0;
        int j = 0;
        
        while(i < num){
                
            while(j <= i){
                    
                System.out.print("#");
                j++;
            }
                
            System.out.println();
            i++;
            j = 0;
        }        
    }
}