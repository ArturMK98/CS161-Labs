public class ForLoop {

    public static void main(String args[]) {

        int x = 0;
        int i = 0;
        
        for(int a = 1; a <= 100; a ++) {

            if(a % 13 == 0) {

                i += a;
            }

            x = x + (a *a);
        }

        System.out.println("The sum of all numbers divisible by 13 is " + i);
        System.out.println("The sum of all squares is " + x);
    }
}