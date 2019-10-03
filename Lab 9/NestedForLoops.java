public class NestedLoops {
    
    public static void main(String args[]) {
        
        int num = 12;
        
            for(int i = 1; i <= num; i++) {
                
                for(int j = 0; j <= num; j++) {
                    
                int product = i * j;
                System.out.println(i + " * " + j + " = " + product);
            }
                
            System.out.println("* " + "* " + "* " + "* " + "* ");
        }
    }
}