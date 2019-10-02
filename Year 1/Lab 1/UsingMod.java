public class UsingMod {

    public static void main (String args []) {

    int a = 123;
          
    int result = 0;
          
    result = a % 10;
              
    int result1 = result;
                
    a = a / 10;
                
    result = a % 10;
                  
    int result2 = result;
                    
    a = a / 10;
                      
    result = a;
                      
    int result3 = result;
                        
    System.out.println("The digits in the number 123 are: ");
    System.out.println(result3);
    System.out.println(result2);
    System.out.println(result1);
                    
                    
    }
}