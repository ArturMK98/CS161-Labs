public class Modulus {
    public static void main(String args[]) {

        int num1  = 18;
        int num2  = 27;
        int num3  = 33;
        int num4  = 20;
        int num5  =  3;
        int even  =  0;
        int odd   =  0;
        
        if(num1 % 2 == 0) {

            even++;

        } else {

            odd ++;
        }

        if(num2 % 2 == 0) {

            even ++;

        } else {

            odd++;
        }

        if(num3 % 2 == 0) {

            even ++;   

        } else {

            odd ++;
        }
        
        if(num4 % 2 == 0) {

            even ++; 

        } else {

            odd ++;
        }

        if(num5 % 2 == 0) {

            even ++; 

        } else {

            odd ++;
        }  
            
        System.out.println("Odd: " + odd);
        System.out.println("Even: " + even);
    }
}