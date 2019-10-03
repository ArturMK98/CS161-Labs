public class Ternary {

    public static void main(String args[]) {

        char member = 'Y';
        char yes =    'N';
        //char no  =    'Y';
        int fee  =     0 ;
        
        fee = (member == yes) ? 5 : 20;
          
        System.out.println("The fee is: " + fee);
    }
}