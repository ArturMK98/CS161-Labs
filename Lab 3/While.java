public class While {

    public static void main(String args[]) {

        int num1   = 40;
        int x      =  2;
        int count  =  0;
        
        while(num1 >= x) {

            num1 = num1 / 2;
            count++;
        }
        
        System.out.println(count);
    }
}