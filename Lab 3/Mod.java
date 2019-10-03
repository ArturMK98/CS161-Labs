public class Mod {

    public static void main(String args []) {

        int i = 0;
        for(int a = 100; a < 1000; a++)
        
        if(a % 47 == 0) {
            
            i = a;
            System.out.println(i);
            
            i = i / 100;
            
            int i2 = a / 10;
            i2 = i2 % 10;
            
            int i3 = a % 10;
            
            System.out.println(i);
            System.out.println(i2);
            System.out.println(i3);
            System.out.println("**********");
            
        }
    }
}